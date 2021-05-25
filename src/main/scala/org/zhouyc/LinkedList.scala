package org.zhouyc


class Node(var value:Int, var next:Option[Node])

class LinkedList(var head:Option[Node]){
  def this() = this(None);

  def insertToTail(value:Int): Unit ={
    val new_node = new Node(value,None);
    head match {
      case None =>
        head = Some(new_node);
      case Some(head) =>
        var curr_node = head;
        while (curr_node.next.isDefined){
          curr_node = curr_node.next.get;
        }
        curr_node.next = Some(new_node);
    }
  }

  def findElementByValue(value:Int): Boolean ={
    var std_node:Node = head.get;
    while(std_node.next.isDefined){
      if(value == std_node.value){
        return  true
      }
      std_node = std_node.next.get
    }
    if(std_node.value == value)
      return true
    return false
  }

  def mkString():String={
    head.map(x=>{
      var node = x;
      val result = new StringBuilder

      while(node.next.isDefined){
        result.append(node.value);
        node = node.next.get;
      }
      result.append(node.value);
      result.mkString
    }).getOrElse("")
  }



}
