object PascalTriangle {
  println("Pascal triangle")                      //> Pascal triangle
  
  /** Pascal Triangle*/
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == c) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }                                               //> pascal: (c: Int, r: Int)Int

  pascal(2, 6)                                    //> res0: Int = 15
  pascal(5, 6)                                    //> res1: Int = 6
  pascal(4, 4)                                    //> res2: Int = 1
  pascal(0, 8)                                    //> res3: Int = 1
}