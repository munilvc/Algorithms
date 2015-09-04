object Factorial {
  println("Factorial")                            //> Factorial
  
  /** Factorial */
  def factorial(n: Int): Int = {
    if (n == 1) 1 else n * factorial(n - 1)
  }                                               //> factorial: (n: Int)Int
  factorial(5)                                    //> res0: Int = 120
  factorial(6)                                    //> res1: Int = 720
}