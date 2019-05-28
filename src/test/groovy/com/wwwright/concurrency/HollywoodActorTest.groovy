package com.wwwright.concurrency

import akka.actor.ActorRef
import akka.actor.ActorSystem
import org.junit.Test

class HollywoodActorTest {

    final ActorSystem akkaSystem = ActorSystem.create("helloakka");

    @Test
    void testHollywoodActor() {
        final ActorRef johnnyDepp = akkaSystem.actorOf(HollywoodActor.props("johnnyDepp"), "johnnyDepp");
        johnnyDepp.tell("My String Message", null)

        println("Sleep a bit to let actor message print");
        sleep(200);
    }

}