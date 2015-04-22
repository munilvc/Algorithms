package com.viglink.batch

import scala.slick.collection.heterogenous._
import scala.slick.collection.heterogenous.syntax._

object Tables {
  println("Simulating table generation from Slick to work with HCons")
                                                  //> Simulating table generation from Slick to work with HCons

  case class Revenue(ii:Int, sss:String, i2:Option[Int])

  /** Row type of table Revenue */
  type RevenueRow = HCons[Int, HCons[String, HCons[Option[Int],HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int,HCons[Int, HNil]]]]]]]]]]]]]]]]]]]]]]]]]]]
  /** Constructor for RevenueRow providing default values if available in the database schema. */
  def RevenueRow(a111: Int, a2: String, a3: Option[Int], a4: Int, a5: Int, a6: Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14: Int, a15: Int,a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int, a22: Int,a23: Int, a24: Int, a25: Int, a26: Int, a27: Int): RevenueRow = {
    a111 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: HNil
  }                                               //> RevenueRow: (a111: Int, a2: String, a3: Option[Int], a4: Int, a5: Int, a6: 
                                                  //| Int, a7: Int, a8: Int, a9: Int, a10: Int, a11: Int, a12: Int, a13: Int, a14
                                                  //| : Int, a15: Int, a16: Int, a17: Int, a18: Int, a19: Int, a20: Int, a21: Int
                                                  //| , a22: Int, a23: Int, a24: Int, a25: Int, a26: Int, a27: Int)com.viglink.ba
                                                  //| tch.Tables.RevenueRow

  val x = RevenueRow(1, "2", Some(3), 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21, 22,23,24,25,26,27)
                                                  //> x  : com.viglink.batch.Tables.RevenueRow = 1 :: 2 :: Some(3) :: 4 :: 5 :: 6
                                                  //|  :: 7 :: 8 :: 9 :: 10 :: 11 :: 12 :: 13 :: 14 :: 15 :: 16 :: 17 :: 18 :: 19
                                                  //|  :: 20 :: 21 :: 22 :: 23 :: 24 :: 25 :: 26 :: 27 :: HNil

 x match {
  case a1321 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: HNil => {
      println(a1321)
      Revenue(a1321,a2,a3)
    }
    case _ => error("unknown")
 }                                                //> 1
                                                  //| res0: com.viglink.batch.Tables.Revenue = Revenue(1,2,Some(3))

  def convertRevenueRowToBatchRevenue(revenueRow: RevenueRow): String = {
    revenueRow match {
      case a1321 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: HNil => {
        //Revenue(a1,a2,a3)
        "Hola"
      }
      case _ => "Chao"
    }
  }                                               //> convertRevenueRowToBatchRevenue: (revenueRow: com.viglink.batch.Tables.Reve
                                                  //| nueRow)String
  
  
  convertRevenueRowToBatchRevenue(x)              //> res1: String = Hola

  val fv:(Int :: String :: Option[Int] :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: Int :: HNil) => Revenue = {
    case a1 :: a2 :: a3 :: a4 :: a5 :: a6 :: a7 :: a8 :: a9 :: a10 :: a11 :: a12 :: a13 :: a14 :: a15 :: a16 :: a17 :: a18 :: a19 :: a20 :: a21 :: a22 :: a23 :: a24 :: a25 :: a26 :: a27 :: HNil => {
      println(a1)
      Revenue(a1,a2,a3)
    }
    case _ => error("unknown")
  }                                               //> fv  : slick.collection.heterogenous.syntax.::[Int,slick.collection.heteroge
                                                  //| nous.syntax.::[String,slick.collection.heterogenous.syntax.::[Option[Int],s
                                                  //| lick.collection.heterogenous.syntax.::[Int,slick.collection.heterogenous.sy
                                                  //| ntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collection.he
                                                  //| terogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.
                                                  //| collection.heterogenous.syntax.::[Int,slick.collection.heterogenous.syntax.
                                                  //| ::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collection.heterog
                                                  //| enous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.colle
                                                  //| ction.heterogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[In
                                                  //| t,slick.collection.heterogenous.syntax.::[Int,slick.collection.heterogenous
                                                  //| .syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,slick.collection
                                                  //| .heterogenous.syntax.::[Int,slick.collection.heterogenous.syntax.::[Int,sli
                                                  //| ck.collection.heterogen
                                                  //| Output exceeds cutoff limit.

  val xx = RevenueRow(1, "2", Some(3), 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21, 22,23,24,25,26,27)
                                                  //> xx  : com.viglink.batch.Tables.RevenueRow = 1 :: 2 :: Some(3) :: 4 :: 5 :: 
                                                  //| 6 :: 7 :: 8 :: 9 :: 10 :: 11 :: 12 :: 13 :: 14 :: 15 :: 16 :: 17 :: 18 :: 1
                                                  //| 9 :: 20 :: 21 :: 22 :: 23 :: 24 :: 25 :: 26 :: 27 :: HNil
  val z = fv(xx)                                  //> 1
                                                  //| z  : com.viglink.batch.Tables.Revenue = Revenue(1,2,Some(3))
 
}