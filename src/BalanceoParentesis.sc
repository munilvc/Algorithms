object BalanceoParentesis {
  println("BalanceoParentesis")                   //> BalanceoParentesis
  
  /** Recursivo */

  def balance(chars: List[Char]): Boolean = {

    def evaluarChars(chars: List[Char], v: Int): Int = {
      if (chars.isEmpty || v == -1) {
        v
      } else {
        var char = chars.head
        if (char == '(') evaluarChars(chars.tail, v + 1)
        else if (char == ')') evaluarChars(chars.tail, v - 1)
        else evaluarChars(chars.tail, v)
      }
    }

    val n = evaluarChars(chars, 0)
    if (n != 0) false else true
  }                                               //> balance: (chars: List[Char])Boolean

  balance("(a)".toList)                           //> res0: Boolean = true
  balance("((a)".toList)                          //> res1: Boolean = false
  balance("(a))".toList)                          //> res2: Boolean = false
  balance("(a())((()))".toList)                   //> res3: Boolean = true
  balance("(a))(".toList)                         //> res4: Boolean = false
  balance("(arriba (abajo? -) echa (/ muni ))carajo)".toList)
                                                  //> res5: Boolean = false
  balance("uno (does (tres) cuatro). (cinco seis )".toList)
                                                  //> res6: Boolean = true
  balance(":-)".toList)                           //> res7: Boolean = false
  balance("())(".toList)                          //> res8: Boolean = false
}