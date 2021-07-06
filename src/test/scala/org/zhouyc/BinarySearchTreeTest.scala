package org.zhouyc.datastructure

object BinarySearchTreeTest {
  def main(args: Array[String]): Unit = {
    val bst = new BinaryTree()
    bst.insert(4)
    bst.insert(2)
    bst.insert(6)
    bst.insert(5)
    bst.insert(8)

    val res = bst.visitBST();
    println(res.mkString(" "))
  }

}
