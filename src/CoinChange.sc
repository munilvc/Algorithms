object CoinChange {
  println("Coin Change")                          //> Coin Change
  
  /*
  Coing Change:
  Implementar una función getChange() que recibe dos parámetros: “monto” y “pago”.
  La función deberá devolver un arreglo de enteros que indique la mínima cantidad de monedas necesaria para dar el vuelto de la operación.
  El arreglo deberá tener 6 posiciones fijas donde cada posición albergará la cantidad de monedas del vuelto según su denominación, así:
  Change[0] = Guardará el # monedas de 0.10 soles
  Change[1] = Guardará el # monedas de 0.20 soles
  Change[2] = Guardará el # monedas de 0.50 soles
  Change[3] = Guardará el # monedas de 1.00 soles
  Change[4] = Guardará el # monedas de 2.00 soles
  Change[5] = Guardará el # monedas de 5.00 soles

  Por ejemplo, suponiendo que una persona compra un bien X a 2.4 soles y paga con un billete de 20 soles, el vuelto que le corresponde sería de 17.6 soles.  ¿Cómo se pagaría este vuelto usando la menor cantidad de monedas posibles?  Para esto usamos la función getChange(2.4, 20), la cual deberá devolver un arreglo con estos valores:
  Change[0] = 1
  Change[1] = 0
  Change[2] = 1
  Change[3] = 0
  Change[4] = 1
  Change[5] = 3

  Dado que 1*0.1 soles + 1*0.5 soles + 1*2 soles + 3*5 soles = 17.6 soles
  */

  val valores = Array(0.10, 0.20, 0.5, 1, 2, 5)   //> valores  : Array[Double] = Array(0.1, 0.2, 0.5, 1.0, 2.0, 5.0)
  val monedasUsadas: Array[Int] = Array(0, 0, 0, 0, 0, 0)
                                                  //> monedasUsadas  : Array[Int] = Array(0, 0, 0, 0, 0, 0)
  def calcularVuelto(monto: Double, pago: Double): Array[Int] = {
    val vuelto = pago - monto
    if (vuelto > 0) {
      verificarValor(vuelto, valores.length - 1)
    } else {
      monedasUsadas
    }
  }                                               //> calcularVuelto: (monto: Double, pago: Double)Array[Int]

  def verificarValor(montoActual: Double, indiceValorMoneda: Int): Array[Int] = {
    //println(indiceValorMoneda)
    if (indiceValorMoneda == -1) {
      monedasUsadas
    } else if (montoActual < valores(indiceValorMoneda)) {
      monedasUsadas(indiceValorMoneda) = 0
      verificarValor(montoActual, indiceValorMoneda - 1)
    } else {
      val numeroMonedas = (montoActual / valores(indiceValorMoneda)).toInt
      val nuevoValor = montoActual % valores(indiceValorMoneda)
      monedasUsadas(indiceValorMoneda) = numeroMonedas
      verificarValor(nuevoValor, indiceValorMoneda - 1)
    }
  }                                               //> verificarValor: (montoActual: Double, indiceValorMoneda: Int)Array[Int]

  calcularVuelto(19.5, 20)                        //> res0: Array[Int] = Array(0, 0, 1, 0, 0, 0)
  calcularVuelto(2.4, 20)                         //> res1: Array[Int] = Array(1, 0, 1, 0, 1, 3)
  calcularVuelto(5, 20)                           //> res2: Array[Int] = Array(0, 0, 0, 0, 0, 3)
  calcularVuelto(13.5, 20)                        //> res3: Array[Int] = Array(0, 0, 1, 1, 0, 1)
  calcularVuelto(4.2, 20)                         //> res4: Array[Int] = Array(1, 1, 1, 0, 0, 3)

}