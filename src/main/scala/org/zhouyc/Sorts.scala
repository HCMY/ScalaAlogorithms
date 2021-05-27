package org.zhouyc

object Sorts{
  def bubbleSort(array:Array[Int]): Array[Int] ={
    val length = array.length
    for(i <- Range(0,length)){
      for(j <- Range(i, length)){
        if(array(i)>array(j)){
          var temp = array(i)
          array(i) = array(j)
          array(j) = temp
        }
      }
    }
    array
  }

  def insertSort(): Unit ={
    //TODO
  }

  def mergeSort(): Unit ={
    //TODO
  }

  def quickSort(array: Array[Int]): Array[Int] ={
    _quickSort(array, 0, array.length-1);
    array
  }

  private[this] def _partition(array: Array[Int], left:Int, right: Int): Int ={
    var pivot = array(left)
    var high = right
    var low = left

    while (low < high){
      while(low < high && array(high) > pivot){
        high -= 1
      }
      array(low) = array(high)

      while(low < high && array(low) <= pivot){
        low += 1
      }
      array(high) = array(low)
    }
    array(low) = pivot
    low
  }

  private[this] def _quickSort(array: Array[Int], left:Int, right: Int): Unit ={
    if(left<right){
      var mid = _partition(array, left, right);

      _quickSort(array, left, mid-1)
      _quickSort(array, mid+1, right)
    }
  }
}
