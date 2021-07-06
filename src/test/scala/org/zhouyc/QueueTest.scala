package org.zhouyc.datastructure

object QueueTest {
  def main(args: Array[String]): Unit = {
    val queue = new Queue

    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    println(queue.getTop().getOrElse("None"), queue.getTail().getOrElse("None"),queue.getQueueSize())

    queue.dequeue()
    println(queue.getTop().getOrElse("None"), queue.getTail().getOrElse("None"),queue.getQueueSize())

    queue.dequeue()
    queue.dequeue()
    println(queue.getTop().getOrElse("None"), queue.getTail().getOrElse("None"),queue.getQueueSize())

  }
}
