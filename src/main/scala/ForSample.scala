object ForSample {
  def main(args: Array[String]): Unit = {
    //左闭右闭
    for (i <- 1 to 2; j <- 2 to 3) {
      printf("%d,    %d", i, j)
      println()
      println(i * j)
      println(i * j + " ")
      println(i * j + ' ') //  ' '表示空格，ASCII表中大小为32
    }
    println()

    //左闭右开
    for (i <- 1 until 3; j <- 0 until 2) {
      printf("%d,   %d", i, j)
      println()
      println(i * j + " ");
    }

    //循环保护式（也是条件判断式），保护式满足true进入循环，满足false跳过，类似continue
    var sum = 0;
    for (i <- 0 to 10 if i % 2 != 0) {
      print(i + "  ")
      sum += i
    }
    println("加和结果是 " + sum)
    println()

    for(i <- 1 to 3; j = 4 - i) {
      print(j + " ")
    }
    println()


    val for5 = for(i <- 1 to 10) yield i
    println(for5)


    /*
      尖叫提示：{}和()对于for表达式来说都可以。for 推导式有一个不成文的约定：
      当for 推导式仅包含单一表达式时使用原括号，当其包含多个表达式时使用大括号。
      值得注意的是，使用原括号时，早前版本的Scala 要求表达式之间必须使用分号。
     */
    for{
      i <- 1 to 3
      j = 4 - i}
      print(i * j + " ")
    println()

  }
}
