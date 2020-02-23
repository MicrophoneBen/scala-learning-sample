object Mostfold {
  def main(args: Array[String]): Unit = {
    val list = List(1,8,2,9)

     val aaa = list.fold(5){(sum: Int, y: Int) =>{
      val item: Int = if(y % 2 == 0) y
      else 0
       sum + item
    }}
    println(aaa)
  }

  private val tuple = (1,2,3,4, "hello world", 1.245)
  println(tuple._5)
  private val value = tuple._6
  println(value)


  val list = List(1,2,3,4,5,65)
  for(ele <- list) {
    print(ele + "  ")
  }
   println()

  val myTuple = ("Michale", "Mike", "Ben", 1, 2, 4, 6, 7, 4.345, 'A', 'z')
  for(ele <- myTuple.productIterator) print(ele + " ")
  println()

  myTuple.productIterator.foreach(x => print(x + " "))
  println()

  myTuple.productIterator.foreach(print)

  println()

  val list1 = 1 :: 2 :: Nil
  println(list1)

  val list3 = list1 :+ 5
  println(list3)

  val list4 = list3 ++ list1
  println(list4)


  //定义一个即将作为方法参数的函数
  val orgsFunction = (x: Int, y: Int, str: String) => {
    val sum = (x + y) * 10
    (sum, str)
  }

  // val list2 = 1 :: 4 :: 6
  //一个二阶函数，传入一个函数和一个整数，传入的第一个函数是返回一个Tuple类型的值的函数
  def getSum(func: (Int, Int , String) => (Int, String), y: Int) = {
    val origin = 10
    val tuple = func(y, origin, "结果是 ：")
    //tuple.productIterator.toList.foreach(print)
    println(tuple._2 + tuple._1)
  }

  getSum(orgsFunction, 10)
}
