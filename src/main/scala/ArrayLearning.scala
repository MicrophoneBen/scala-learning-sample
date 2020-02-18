import scala.collection.mutable.ArrayBuffer
import scala.collection.JavaConversions.bufferAsJavaList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable

object ArrayLearning {

  def main(args: Array[String]): Unit = {
    //定义
    val arr1 = new Array[Int](10)
    //赋值
    arr1(1) = 7

    //遍历
    for(arr <- arr1){
      printf("%d  ", arr)
    }
    println()


    //变长数据组
    val arr2 = ArrayBuffer[Int](3)
    //追加值
    arr2.append(5)
    //重新赋值
    arr2(0) = 4
    for (ann <- arr2){
      printf("%d ", ann)
    }

    //变为定长
    val aee = arr2.toArray
    val abb = arr1.toBuffer

    //多维数组，定义
    val avv  = Array.ofDim[Double](3,4)
    //赋值
    avv(1)(1)=11.11

    /*
    与Java数组的互转
     Scala数组转Java数组：
     */
    val arr4 = ArrayBuffer("1","2","3")
    val javaArr = new ProcessBuilder(arr4)
    println(javaArr.command())


    val scalaArr: mutable.Buffer[String] = javaArr.command()
    println(scalaArr)
  }
}
