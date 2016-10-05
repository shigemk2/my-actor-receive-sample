package com.example

import akka.actor.{ActorSystem, Props}

object Hello {
  def main(args: Array[String]): Unit = {
    // とても重い処理。アプリケーション内に一つだけ作るようにします。
    implicit val system = ActorSystem("mySystem") // 名前はログなどに記載されます。

    // アクターの設定。イミュータブルにすることでスレッドセーフにします。
    val props1 = Props[MyActor]
    val props2 = Props(classOf[MyActor2], "myArg1", "myArg2") // 引数あり Actorクラスには引数をつけられるの

    val actor1 = system.actorOf(props1, name = "myActor1") // 名前はログなどで使用されます。
    val actor2 = system.actorOf(props2, name = "myActor2") // 名前の重複はアクター間で許されません。

    // whileしつづけて、shutdownしない
    for(i <- 1 to 5) {
      actor1 ! "hi actor1"
      actor2 ! "hi actor2"
      Thread.sleep(1000)
    }
    system.terminate()
  }
}
