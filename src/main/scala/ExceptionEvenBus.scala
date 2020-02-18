object ExceptionEvenBus {

  /*
  抛出异常：用throw关键字，抛出一个异常对象。所有异常都是Throwable的子类型。
           throw表达式是有类型的，就是Nothing，因为Nothing是所有类型的子类型，所以throw表达式可以用在需要类型的地方。
  捕捉异常：在Scala里，借用了模式匹配的思想来做异常的匹配，
           因此，在catch的代码里，是一系列case字句。

  异常捕捉的机制与其他语言中一样，如果有异常发生，catch字句是按次序捕捉的。
  因此，在catch字句中，越具体的异常越要靠前，越普遍的异常越靠后。
  如果抛出的异常不在catch字句中，该异常则无法处理，会被升级到调用者处。

  finally字句用于执行不管是正常处理还是有异常发生时都需要执行的步骤，一般用于对象的清理工作。

   */
  def divider(x: Int, y: Int): Double = {
    if (y == 0)
      throw new Exception("0 不能作为除数");
    else if(y % 2 == 0)
      throw new RuntimeException("除数为2 抛出运行时异常")
    else x / y
  }

  def main(args: Array[String]): Unit = {
    try {
      for (i <- -3 to 3) {
        println(divider(10, i))
      }
    } catch {
      case exception: RuntimeException => println("捕获了运行时异常 ： " + exception)
      case exception: Exception => println("捕获了异常 ： " + exception)
    } finally {
      "最后执行的语句"
    }
  }
}
