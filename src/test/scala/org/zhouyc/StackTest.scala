package org.zhouyc.datastructure

object StackTest{
  def main(args: Array[String]): Unit = {
    val stack = new Stack()
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.mkString())
    println(stack.getStackSize())
    stack.pop()
    println(stack.getStackSize())
    println(stack.top().get.value)
    stack.pop()
    println(stack.getStackSize())
  }
}
