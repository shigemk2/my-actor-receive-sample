# my-actor-receive-sample

https://www.qoosky.io/techs/e0f555bc87#アクターの生成

```sh
[info] Running com.example.Hello 
[INFO] [10/06/2016 01:47:12.270] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor1] received: hi actor1
[INFO] [10/06/2016 01:47:12.270] [mySystem-akka.actor.default-dispatcher-3] [akka://mySystem/user/myActor1/myChild] args: myArg3, myArg4, received: hi actor1
[INFO] [10/06/2016 01:47:12.271] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor2] args: myArg1, myArg2, received: hi actor2
[INFO] [10/06/2016 01:47:13.264] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor2] args: myArg1, myArg2, received: hi actor2
[INFO] [10/06/2016 01:47:13.264] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor1] received: hi actor1
[INFO] [10/06/2016 01:47:13.265] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor1/myChild] args: myArg3, myArg4, received: hi actor1
[INFO] [10/06/2016 01:47:14.264] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor2] args: myArg1, myArg2, received: hi actor2
[INFO] [10/06/2016 01:47:14.264] [mySystem-akka.actor.default-dispatcher-5] [akka://mySystem/user/myActor1] received: hi actor1
[INFO] [10/06/2016 01:47:14.265] [mySystem-akka.actor.default-dispatcher-4] [akka://mySystem/user/myActor1/myChild] args: myArg3, myArg4, received: hi actor1
[INFO] [10/06/2016 01:47:15.265] [mySystem-akka.actor.default-dispatcher-5] [akka://mySystem/user/myActor2] args: myArg1, myArg2, received: hi actor2
[INFO] [10/06/2016 01:47:15.265] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor1] received: hi actor1
[INFO] [10/06/2016 01:47:15.265] [mySystem-akka.actor.default-dispatcher-2] [akka://mySystem/user/myActor1/myChild] args: myArg3, myArg4, received: hi actor1
[INFO] [10/06/2016 01:47:16.265] [mySystem-akka.actor.default-dispatcher-5] [akka://mySystem/user/myActor2] args: myArg1, myArg2, received: hi actor2
[INFO] [10/06/2016 01:47:16.265] [mySystem-akka.actor.default-dispatcher-7] [akka://mySystem/user/myActor1] received: hi actor1
[INFO] [10/06/2016 01:47:16.265] [mySystem-akka.actor.default-dispatcher-5] [akka://mySystem/user/myActor1/myChild] args: myArg3, myArg4, received: hi actor1
[success] Total time: 10 s, completed 2016/10/06 1:47:17
```
