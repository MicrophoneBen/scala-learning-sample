object LazyUsage {
  //val 被声明为lazy的时候使用懒加载，一直到首次取值使用，才进行初始化，对于大对象，应该使用这个方法
  def init():  String = {
    println("嘿嘿，Init执行了")
    "Init 执行完了，我走了"
  }

  def main(args: Array[String]): Unit = {
    lazy val msg  = init()
    println("声明之后没有使用，Init方法并没有执行")
    println(msg)
  }

}
