import scala.slick.collection.heterogenous._
import scala.slick.collection.heterogenous.syntax._

object Tables {
  println("Simulating table generation from Slick to work with HCons")
                                                  //> Simulating table generation from Slick to work with HCons

  case class Revenue(ii:Int, sss:Int, i2:Int)

  /** Row type of table Revenue */
  type RevenueRow = HCons[Int, HCons[Int, HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int, HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for RevenueRow providing default values if available in the database schema. */
  def RevenueRow(a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int,a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int, a22: Int,a23: Int, a24: Int, a25: Int, a26: Int, a27: Int): RevenueRow = {
    a1 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: HNil
  }                                               //> RevenueRow: (a1: Int, a2: Int, a3: Int, a4: Int, a5: Int, a6: Int, a7: Int,
                                                  //|  a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: I
                                                  //| nt, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int, a22: Int, a
                                                  //| 23: Int, a24: Int, a25: Int, a26: Int, a27: Int)com.viglink.batch.network.T
                                                  //| ables.RevenueRow

  val x = RevenueRow(1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21, 22,23,24,25,26,27)
                                                  //> x  : com.viglink.batch.network.Tables.RevenueRow = 1 :: 2 :: 3 :: 4 :: 5 ::
                                                  //|  6 :: 7 :: 8 :: 9 :: 10 :: 11 :: 12 :: 13 :: 14 :: 15 :: 16 :: 17 :: 18 :: 
                                                  //| 19 :: 20 :: 21 :: 22 :: 23 :: 24 :: 25 :: 26 :: 27 :: HNil

  val fv:(Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: HNil) => Revenue = {
    case a1 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: HNil => {
      println(a1)
      Revenue(a1,a2,a3)
    }
    case _ => error("unknown")
  }                                               //> fv  : slick.collection.heterogenous.syntax.::[Int,slick.collection.heteroge
                                                  //| nous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collec
                                                  //| tion.heterogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int
                                                  //| ,slick.collection.heterogenous.syntax.::[Int,slick.collection.heterogenous.
                                                  //| syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collection.
                                                  //| heterogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slic
                                                  //| k.collection.heterogenous.syntax.::[Int,slick.collection.heterogenous.synta
                                                  //| x.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collection.heter
                                                  //| ogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.col
                                                  //| lection.heterogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[
                                                  //| Int,slick.collection.heterogenous.syntax.::[Int,slick.collection.heterogeno
                                                  //| us.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collecti
                                                  //| on.heterogenous.syntax.
                                                  //| Output exceeds cutoff limit.

val z = fv(x)                                     //> 1
                                                  //| z  : com.viglink.batch.network.Tables.Revenue = Revenue(1,2,3)

}
