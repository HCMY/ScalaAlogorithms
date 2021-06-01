package org.zhouyc

object GraphTest {
  def main(args: Array[String]): Unit = {
    val nodeNum = 5
    val vertex = new Array[String](nodeNum+1)
    for(i <- Range(1, nodeNum+1))
      vertex(i) = i.toString

    val graph = new Graph(vertex)
    graph.addEdge("1","2")
    graph.addEdge("1","4")
    graph.addEdge("2","3")
    graph.addEdge("3","5")
    graph.addEdge("4","5")

    val bfsRoute = graph.BFS("1","5")
    println(bfsRoute.mkString(" "))
  }

}
