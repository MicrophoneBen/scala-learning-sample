import scala.util.control.Breaks

object HelloScala {
  def main(args: Array[String]): Unit = {
    printf("Hello World")


    println()
    val num1 = 10
    val num2 =
      if (num1 > 20) {
        "num1的值大于20"
      } else {
        "num1的值小于20"
      }
    println(num2)


    val result2 =
      if (num1 < 100) {
        "num1 小于100"
      }
    println(result2)

    /*
       如果缺少一个判断，什么都没有返回，但是Scala认为任何表达式都会有值，对于空值，
       使用Unit类，写做()，叫做无用占位符，相当于java中的void。


      尖叫提示：行尾的位置不需要分号，只要能够从上下文判断出语句的终止即可。
      但是如果在单行中写多个语句，则需要分号分割。在Scala中，{}快包含一系列表达式，
      其结果也是一个表达式。块中最后一个表达式的值就是块的值。
     */
    val res = 200
    val reams =
    if (res < 100) {
      "num1 小于100"
    }
    println(reams)

    val map1 = Map("Alice" -> 29, "ben" -> 30, "Hedy" -> 25)
    printf("Alice‘s age is  %d", map1("Alice"))
    println()
    printf("Alice‘s age is  %s", map1.get("Alice").mkString)


    println()

    val arr1 = new Array[Int](5)
    print(arr1.mkString(","))
    arr1(2) = 4 //调用update方法
    println()
    println(arr1.mkString(","))


    val a = "Hello".apply(3)
    val b = "Hello"(3)
    println(a.equals(b))


    println("HelloWorld".distinct)


    var n = 1;
    val while1: Unit = while(n <= 10){
      n += 1
    }
    println(while1)
    println(n)

     /*
        尖叫提示：scala并没有提供break和continue语句来退出循环，如果需要break，可以通过几种方法来做
        1、使用Boolean型的控制变量
        2、使用嵌套函数，从函数中return
        3、使用Breaks对象的break方法。
      */

    val loop = new Breaks
    n = 1
    loop.breakable{
      while(n <= 20){
        n += 1;
        if(n == 10){
          loop.break()
        }
      }
    }
    println(n)

  }
}
