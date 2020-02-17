object MethodScala {

  /*
  尖叫提示：
    1、Scala可以通过=右边的表达式 推断出函数的返回类型。如果函数体需要多个表达式，可以用代码块{}。
    2、可以把return 当做 函数版本的break语句。
    3、递归函数一定要指定返回类型。
    4、变长参数通过*来指定，所有参数会转化为一个seq序列。
   */
  def main(args: Array[String]): Unit = {
    myPrintString("中国加油")
    println()
    myPrintString("zhang bingquan", 26)
    println()
    mPrintString("abc")
    println()
    myMethod(leg = 8, content = "哈哈哈")
    myMethod("你好")
    println(sum(1,2,3,4,5))
    val sum_factorial = factorial(4);
    println(sum_factorial)
  }

  /*
     scala定义函数的标准格式为：
     def 函数名(参数名1: 参数类型1, 参数名2: 参数类型2) : 返回类型 = {函数体}
   */
  def myPrintString(context: String): Unit = {
    printf("这是第一个传递字符串的函数，字符串是 : %s", context)
  }

  //以上函数是显示指定了返回类型 Unit，这个就是相当于空返回(),类比void, 可以不指定返回类型
  def myPrintString(context: String, numeric: Int) {
    printf("我是 %s,  我今年 %d 了", context, numeric)
  }

  //返回值类型有多种可能，此时也可以省略Unit
  def mPrintString(content: String): Any = {
    if (content.length >= 3)
      content + "喵喵喵~"
    else
      3
  }

  //带有默认值参数的函数，调用该函数时，可以只给无默认值的参数传递值，也可以都传递，新值会覆盖默认值；
  // 传递参数时如果不按照定义顺序，则可以通过参数名来指定。
  def myMethod(content: String, leg: Int = 4): Unit = {
    println(content + "," + leg)
  }

  //变长参数（不确定个数参数，类似Java的…）
  def sum(args: Int*): Int = {
    var result = 0
    for(arg <- args)
      result += arg
    result
  }

  def factorial(n: Int): Int = {
    if(n <= 0)
      1
    else
      n * factorial(n - 1)
  }
}
