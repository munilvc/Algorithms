object DynamicConnectivity_WeightedQuickUnion {
  println("Dynamic Connectivity: Set of objects which can be connected. Be able to determine if an object is connected to other.")
                                                  //> Dynamic Connectivity: Set of objects which can be connected. Be able to dete
                                                  //| rmine if an object is connected to other.

  val data = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)  //> data  : Array[Int] = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  val sizeForRoot = Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                                                  //> sizeForRoot  : Array[Int] = Array(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

  def root(pX: Int): Int = {
    var pXX = pX
    while (data(pXX) != pXX) {
      pXX = data(pXX)
    }
    pXX
  }                                               //> root: (pX: Int)Int

  def union(p: Int, q: Int) {
    val rootP = root(p)
    val rootQ = root(q)
    if (rootP != rootQ) {
      if (sizeForRoot(rootP) < sizeForRoot(rootQ)) {
        data(rootP) = rootQ
        sizeForRoot(rootQ) += sizeForRoot(rootP)
      } else {
        data(rootQ) = rootP
        sizeForRoot(rootP) += sizeForRoot(rootQ)
      }
    }
  }                                               //> union: (p: Int, q: Int)Unit

  def connected(p: Int, q: Int) = {
    root(p) == root(q)
  }                                               //> connected: (p: Int, q: Int)Boolean

  /*
  Give the id[] array that results from the following sequence of 9 union
  operations on a set of 10 items using the weighted quick-union algorithm from lecture.

    5-9 4-3 1-9 5-2 0-6 6-4 5-8 5-6 4-7

  Your answer should be a sequence of 10 integers, separated by whitespace.
  
  Recall: when joining two trees of equal size, our weighted quick union convention is to
  make the root of the second tree point to the root of the first tree. Also, our weighted
  quick union algorithm performs union by size (number of nodes) -  not union by height -
  and does not do path compression.
  */


  union(5,9)
  union(4,3)
  union(1,9)
  union(5,2)
  union(0,6)
  union(6,4)
  union(5,8)
  union(5,6)
  union(4,7)
  
  println("Index:")                               //> Index:
  println("0123456789")                           //> 0123456789
  println(data.mkString)                          //> 5554050555


  /*
  connected(1, 2)
  union(1, 2)
  connected(1, 2)
  union(8, 6)
  union(3, 1)
  connected(3, 2)
  union(4, 6)
  union(9, 4)
  connected(4, 3)
  println("Index:")
  println("0123456789")
  println(data.mkString)
  connected(6, 9)
  println(sizeForRoot.mkString)
*/

}