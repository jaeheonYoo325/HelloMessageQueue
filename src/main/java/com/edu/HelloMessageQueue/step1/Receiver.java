package com.edu.HelloMessageQueue.step1;

import org.springframework.stereotype.Component;

//@Component
public class Receiver {
    public void receiveMessage(String message) {
        System.out.println("[#] received: " + message);
    }
}
