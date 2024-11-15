// src/main/java/com/example/chatserver/controller/ChatController.java
package com.example.chat_server.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public String handleMessage(String message) {
        return message; // Broadcast the message to all clients
    }
}
