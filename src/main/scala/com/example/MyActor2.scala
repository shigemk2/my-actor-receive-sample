package com.example

import akka.actor.Actor
import akka.event.Logging

class MyActor2(arg1: String, arg2: String) extends Actor {
  val log = Logging(context.system, this)

  def receive = {
    case s: String => {
      log.info("args: %s, %s, received: %s" format (arg1, arg2, s))
    }
    case _ =>
  }

}
