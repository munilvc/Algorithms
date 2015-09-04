object Fibonacci {
  println("Fibonacci")                            //> Fibonacci
  
  /** Fibonacci */
  def fibonacci(n: Int): Int = {
    if (n == 0 | n == 1) 1 else fibonacci(n - 2) + fibonacci(n - 1)
  }                                               //> fibonacci: (n: Int)Int

  fibonacci(10)                                   //> res0: Int = 89
  fibonacci(5)                                    //> res1: Int = 8
  fibonacci(7)                                    //> res2: Int = 21
}