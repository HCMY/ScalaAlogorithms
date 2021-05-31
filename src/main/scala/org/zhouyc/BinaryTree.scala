package org.zhouyc

import scala.collection.mutable.ArrayBuffer

class TreeNode(var value:Int, var left:Option[TreeNode], var right: Option[TreeNode])

class BinaryTree(var root: Option[TreeNode]){
    def this() = this(None)

    var values:ArrayBuffer[Int] = ArrayBuffer[Int]();

    def insert(value: Int): Unit ={
      root match {
        case None =>
          root = Some(new TreeNode(value, None, None));
        case Some(node)=>
          var node = root.get
          _insert(value, node)
      }
    }

    def _insert(value:Int, node:TreeNode): Unit ={
      if(value <= node.value){
        if(node.left.isDefined) {
          _insert(value, node.left.get)
        } else {
          var new_node = new TreeNode(value, None, None)
          node.left = Some(new_node)
        }
      }else{
        if(node.right.isDefined){
          _insert(value, node.right.get)
        }else{
          var new_node = new TreeNode(value, None, None)
          node.right = Some(new_node)
        }
      }
    }


  def visitBST(node:Option[TreeNode]=root): ArrayBuffer[Int]={
    if (node.isDefined) {
      visitBST(node.get.left)
      values.append(node.get.value)
      visitBST(node.get.right)
    }
    values
  }

}