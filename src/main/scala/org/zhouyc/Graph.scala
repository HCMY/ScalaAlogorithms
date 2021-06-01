package org.zhouyc

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.{HashMap, ListBuffer,HashSet, Queue}
import scala.util.control.Breaks._

class Graph(vertex: Array[String]){
  var adj = Array.ofDim[Int](vertex.length, vertex.length)

  def addEdge(srcNode:String, dstNode:String): Unit ={
    val srcIdx = vertex.indexOf(srcNode)
    val dstIdx = vertex.indexOf(dstNode)
    adj(srcIdx)(dstIdx) = 1
  }

  def BFS(srcNode:String, dstNode:String): ArrayBuffer[Int] ={
    val srcIdx = vertex.indexOf(srcNode)
    val dstIdx = vertex.indexOf(dstNode)
    var visited = new mutable.HashSet[Int]()
    var queue = new mutable.Queue[Int]()
    var route = new ArrayBuffer[Int]()

    queue.enqueue(srcIdx)
    route.append(srcIdx)

    breakable {
      while (queue.nonEmpty) {
        var node = queue.dequeue()
        visited(node) = true

        for (curr_node <- Range(0, vertex.length)) {
          val flag = adj(node)(curr_node)
          if (flag == 1 && !visited.contains(curr_node)) {
            queue.enqueue(curr_node)
            visited(curr_node) = true
            route += curr_node

            if (curr_node.equals(dstIdx)) {
              break
            }
          }
        }
      }
    }
    route
  }

  def DFS(srcNode:String, dstNode:String): ArrayBuffer[Int] ={
    val srcIdx = vertex.indexOf(srcNode)
    val dstIdx = vertex.indexOf(dstNode)
    var visited = new mutable.HashSet[Int]()
    var stack = new mutable.Stack[Int]()
    var route = new ArrayBuffer[Int]()

    route.append(srcIdx)
    stack.push(srcIdx)
    visited(srcIdx) = true

    breakable {
      while (stack.nonEmpty) {
        val node = stack.pop()
        for (currNode <- Range(0, vertex.length)) {
          val flag = adj(node)(currNode)
          if (flag == 1 && !visited.contains(currNode)) {
            visited(currNode) = true
            route.append(currNode)
            stack.push(currNode)
            if (currNode.equals(dstIdx))
              break
          }
        }
      }
    }
    route
  }
}
