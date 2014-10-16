object DynamicConnectivity {
  println("Dynamic Connectivity: Set of objects which can be connected. Be able to determine if an object is connected to other.")
                                                  //> Dynamic Connectivity: Set of objects which can be connected. Be able to dete
                                                  //| rmine if an object is connected to other.
  
  val data = Array(0,1,2,3,4,5,6,7,8,9)           //> data  : Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  def root(pX: Int): Int = {
    var pXX = pX
    while(data(pXX) != pXX){
      pXX = data(pXX)
    }
    pXX
  }                                               //> root: (pX: Int)Int
   
  def union(pA: Int, pB: Int){
    val rootPA = root(pA)
    val rootPB = root(pB)
    data(rootPB) = rootPA
  }                                               //> union: (pA: Int, pB: Int)Unit
  
  def connected(pA: Int, pB: Int) = {
    root(pA) == root(pB)
  }                                               //> connected: (pA: Int, pB: Int)Boolean
  
  connected(1,2)                                  //> res0: Boolean = false
  union(1,2)
  connected(1,2)                                  //> res1: Boolean = true
  union(8,6)
  union(3,1)
  connected(3,2)                                  //> res2: Boolean = true
  union(4,6)
  union(9,4)
  connected(4,3)                                  //> res3: Boolean = false
  println("Index:")                               //> Index:
  println("0123456789")                           //> 0123456789
  println(data.mkString)                          //> 0313958749
  connected(6,9)                                  //> res4: Boolean = true
}