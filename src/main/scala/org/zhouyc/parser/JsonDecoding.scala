package org.zhouyc.parser




case class Config(
                 comment:String,
                 dir:String,
                 executors:Option[Int],
                 isOk:Option[Boolean],
                 isRequires:Boolean,
                 num:Int,
                 ratio:Double
                 )


object JsonDecoding {
  def decodingJson(): Unit = {
    var jsonStr:String =
      """{
        |"comment":"this is comment",
        |"dir":"this is dir",
        |"executors":10,
        |"isOk":true,
        |"isRequires":true,
        |"num":100,
        |"ratio":0.2,
        |"test":10000
        |}
        |
        |""".stripMargin

    println(jsonStr)

    import io.circe.parser._
    import io.circe.generic.auto._

    val decodeStr = decode[Config](jsonStr) match {
      case Left(msg) => throw new RuntimeException(
        s"""
          |===================
          |parser error ${msg}
          |""".stripMargin
      )
      case Right(source) => source
    }

    println(decodeStr)

  }
}
