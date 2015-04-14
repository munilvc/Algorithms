import scala.slick.collection.heterogenous._
import scala.slick.collection.heterogenous.syntax._

object Tables {
  println("Simulating table generation from Slick to work with HCons")
                                                  //> Simulating table generation from Slick to work with HCons

  case class Revenue(ii:Int, sss:String, i2:Int)

  /** Row type of table Revenue */
  type RevenueRow = HCons[Int, HCons[String, HCons[Int, HNil]]]
  /** Constructor for RevenueRow providing default values if available in the database schema. */
  def RevenueRow(id: Int, code: String, domainId: Int): RevenueRow = {
    id :: code :: domainId :: HNil
  }                                               //> RevenueRow: (id: Int, code: String, domainId: Int)com.viglink.batch.network.
                                                  //| Tables.RevenueRow

  val x = RevenueRow(1, "TestCode", 2)            //> x  : com.viglink.batch.network.Tables.RevenueRow = 1 :: TestCode :: 2 :: HNi
                                                  //| l

  val fv:(Int :: String :: Int :: HNil) => Revenue = {
    case i :: s :: ii :: HNil => {
      println(s)
      Revenue(i,s,ii)
    }
    case _ => error("unknown")
  }                                               //> fv  : slick.collection.heterogenous.syntax.::[Int,slick.collection.heterogen
                                                  //| ous.syntax.::[String,slick.collection.heterogenous.syntax.::[Int,slick.colle
                                                  //| ction.heterogenous.syntax.HNil]]] => com.viglink.batch.network.Tables.Revenu
                                                  //| e = <function1>

val z = fv(x)                                     //> TestCode
                                                  //| z  : com.viglink.batch.network.Tables.Revenue = Revenue(1,TestCode,2)

}
