package org.zhouyc.functionalprogramming

object Chapter2 {
  def main(args: Array[String]): Unit = {
    println(fib(6))
    println(MyModule.formatResult("absolute value",-1, MyModule.abs))
    println(MyModule.formatResult("factorial", 5, MyModule.factorial))
    println(MyModule.formatFactorial(5))

  }
  def fib(n:Int):Int={
    def go(pre:Int, second:Int, cnt:Int):Int =
      if(n==cnt) pre
      else go(second, pre+second, cnt+1)

    go(0, 1, 1)
  }
}


object MyModule{
  def abs(i: Int):Int = if(i<0) -i  else i

  def factorial(n:Int):Int = {
    def go(n:Int, acc:Int): Int ={
      if(n<=0) acc
      else go(n-1, n*acc)
    }
    go(n,1)
  }

  private def formatAbs(x:Int)={
    val msg = "the absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def formatFactorial(n:Int)={
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def formatResult(name:String, n:Int, f:Int=>Int): String ={
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }


}
