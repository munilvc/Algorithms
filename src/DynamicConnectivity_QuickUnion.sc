object DynamicConnectivity_QuickUnion {
  println("Dynamic Connectivity: Set of objects which can be connected. Be able to determine if an object is connected to other.")
                                                  //> Dynamic Connectivity: Set of objects which can be connected. Be able to dete
                                                  //| rmine if an object is connected to other.

  val data = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)  //> data  : Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

  // Get the root value
  def root(pX: Int): Int = {
    var pXX = pX
    while (data(pXX) != pXX) {
      pXX = data(pXX)
    }
    pXX
  }                                               //> root: (pX: Int)Int

  //Recall: our quick-find convention for the union operation p-q is to change id[p]
  //(and perhaps some other entries) but not id[q].
  def union(p: Int, q: Int) {
    val rootP = root(p)
    val rootQ = root(q)
    data(rootP) = rootQ
  }                                               //> union: (p: Int, q: Int)Unit

  def connected(p: Int, q: Int) = {
    root(p) == root(q)
  }                                               //> connected: (p: Int, q: Int)Boolean

  /*
  Give the id[] array that results from the following sequence of 6 union
  operations on a set of 10 items using the quick-find algorithm.

  1-8 0-3 2-6 5-0 5-9 1-6
  
  Your answer should be a sequence of 10 integers, separated by whitespace.
  
  Recall: our quick-find convention for the union  operation p-q is to change id[p]
  (and perhaps some other entries) but not id[q].
  */

  union(1, 8)
  union(0, 3)
  union(2, 6)
  union(5, 0)
  union(5, 9)
  union(1, 6)
  println("Index:")                               //> Index:
  println("0123456789")                           //> 0123456789
  println(data.mkString)                          //> 3869436769
  connected(0,9)                                  //> res0: Boolean = true
  /*
  connected(1,2)
  union(1,2)
  connected(1,2)
  union(8,6)
  union(3,1)
  connected(3,2)
  union(4,6)
  union(9,4)
  connected(4,3)
  println("Index:")
  println("0123456789")
  println(data.mkString)
  connected(6,9)
  */
}