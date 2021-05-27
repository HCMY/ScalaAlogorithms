package org.zhouyc

object SortsTest {
  def main(args: Array[String]): Unit = {
    var array1:Array[Int] = Array(1,4,2,3,8,7,1,2);
    val bubbleSortedArray = Sorts.bubbleSort(array1)
    println(bubbleSortedArray.mkString(" "))

    var array2:Array[Int] = Array(1,4,2,3,8,7,1,2);
    val quickSortedArray = Sorts.quickSort(array2)
    println(quickSortedArray.mkString(" "))

  }

}
