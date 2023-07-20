
package com.mycompany.actorapp1;
import akka.actor.AbstractActor;
public class Actor1 extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder().matchEquals("Hi from Actor1", message -> {
                System.out.println("Received: " + message);
                // "Hi from Actor1" mesajını "actor2" aktörüne gönder
                getContext().actorSelection("/user/actor2").tell("Hi from Actor1", getSelf());
            })
            .build();
    }
}
