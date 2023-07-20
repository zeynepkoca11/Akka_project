
package com.mycompany.actorapp1;
// ActorApp1.java
import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
public class ActorApp1 {
    public static void main(String[] args) { 
        ActorSystem system = ActorSystem.create("akka-system");
        ActorRef actor1 = system.actorOf(Props.create(Actor1.class), "actor1");
        actor1.tell("Hi from Actor1", ActorRef.noSender());
        system.terminate();
    }
}

