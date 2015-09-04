package scalaTests

object verifyOrder {
  println("verifyOrder")                          //> verifyOrder
  
  /*
  Implementar una funcion "EnOrden(n[])" que recibe como parametro n[] que es un arreglo de numeros enteros en donde no se repite ningun elemento.
  La funcion debera devolver uno de los siguientes valores:
  +1, si el arreglo esta ordenado de forma ascendente
  -1, si el arreglo esta ordenado de forma descendente
  0, si el arreglo no esta ordenado
  */
  
  def isOrdered(n: List[Int]): Int = {
    if(isAscending(n)) 1 else if(isDescending(n)) -1 else 0
  }                                               //> isOrdered: (n: List[Int])Int

  def isAscending(n: List[Int]): Boolean = {
    if(n.length > 1) if (n.head < n.tail.head) true && isAscending(n.tail) else false
    else true
  }                                               //> isAscending: (n: List[Int])Boolean

  def isDescending(n: List[Int]): Boolean = {
    if(n.length > 1) if (n.head > n.tail.head) true && isDescending(n.tail) else false
    else true
  }                                               //> isDescending: (n: List[Int])Boolean

  isOrdered(List(2, 4, 5, 7, 8, 12, 53))          //> res0: Int = 1
  isOrdered(List(2, 4, 5, 7, 8, 12, 53, 1))       //> res1: Int = 0
  isOrdered(List(23, 2, 4, 5, 7, 8, 12, 53))      //> res2: Int = 0
  isOrdered(List(10, 7, 3, 2))                    //> res3: Int = -1
  isOrdered(List(4, 10, 7, 3, 2))                 //> res4: Int = 0
  isOrdered(List(2, 9, 5, 3, 8, 7, 25, 14))       //> res5: Int = 0
  isOrdered(List(1, 1))                           //> res6: Int = 0
}