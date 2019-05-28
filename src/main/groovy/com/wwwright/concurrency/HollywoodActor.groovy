package com.wwwright.concurrency

import akka.actor.ActorRef
import akka.actor.Props
import akka.actor.UntypedAbstractActor

class HollywoodActor extends UntypedAbstractActor {

    static public Props props(String message) {
        return Props.create(HollywoodActor.class, {new HollywoodActor(message) } );
    }

    private final String message;

    def HollywoodActor(String message) {
        this.message = message
    }

    @Override
    void onReceive(Object role) throws Throwable {
        println "Hollywood actor ${message}, Playing ${role} from thread ${Thread.currentThread().getName()}"
    }


}
