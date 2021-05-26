package org.zhouyc

object LinkedListTest{
  def main(args: Array[String]): Unit = {
    val list = new LinkedList();
    list.insertToTail(1);
    list.insertToTail(2);
    list.insertToTail(3);
    list.insertToTail(4);

    println(list.findElementByValue(4));
    println(list.findElementByValue(5));
    println(list.mkString())

    list.insertAfterElement(9,2);
    println(list.mkString())
  }
}



