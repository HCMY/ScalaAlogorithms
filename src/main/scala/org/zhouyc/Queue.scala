package org.zhouyc

import scala.collection.mutable.ArrayBuffer

class Queue{
  var queue:ArrayBuffer[Int] = new ArrayBuffer[Int]();

  def enqueue(value:Int)={
    queue += value
  }

  def dequeue(): Unit ={
    queue.remove(0)
  }

  def getTop():Option[Int]={
    println(queue.size)
    if(!queue.isEmpty) {
      return Some(queue(0))
    }
    return  None
  }

  def getTail(): Option[Int] ={
    if(!queue.isEmpty) {
      return Some(queue(queue.size-1))
    }
    return None
  }

  def getQueueSize():Int={
    queue.size-1
  }
}