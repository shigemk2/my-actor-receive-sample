package com.example

import akka.actor.{ActorSystem, Props}

object Hello {
  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem("mySystem")

    val props1 = Props[MyActor]
    val props2 = Props(classOf[MyActor2], "myArg1", "myArg2")

    val actor1 = system.actorOf(props1, name = "myActor1")
    val actor2 = system.actorOf(props2, name = "myActor2")

    while (true) {
      actor1 ! "hi actor1"
      actor2 ! "hi actor2"
      Thread.sleep(1000)
    }
  }
}
