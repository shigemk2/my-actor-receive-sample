package com.example

import akka.actor.{Actor, Props}
import akka.event.Logging

class MyActor extends Actor {
  val log = Logging(context.system, this) // logger

  // アクター内でアクターを生成できます。
  val child = context.actorOf(Props(classOf[MyActor2], "myArg3", "myArg4"), name = "myChild")

  def receive = {
    case s: String => {
      log.info("received: %s" format s)
      child ! s
    }
    case _ =>
  }
}
