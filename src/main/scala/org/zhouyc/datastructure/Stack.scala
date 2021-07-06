package org.zhouyc.datastructure


class Stack {
  var head:Option[Node] = None
  private var size = 0;

  def clearStack(): Unit ={
    head = None
    size = 0
  }

  def push(data:Int){
    var new_node = new Node(data, None)
    head match {
      case None =>
        head = Some(new_node)
      case Some(oK) =>
        new_node.next = Some(oK)
        head = Some(new_node)
    }
    size += 1
  }

  def pop(): Unit ={
    head match {
      case None =>
        None
      case Some(oK) =>
        head = head.get.next
        size -= 1
    }
  }

  def top(): Option[Node] ={
    head match {
      case None => None
      case Some(oK) => head
    }
  }

  def mkString():String={
    head.map(node=>{
      var root = node
      val res = new StringBuilder
      while (root.next.isDefined){
        res.insert(0,root.value);
        root = root.next.get
      }
      res.insert(0, root.value)
      res.mkString
    }).getOrElse("")
  }

  def getStackSize():Int={
    size;
  }
}
