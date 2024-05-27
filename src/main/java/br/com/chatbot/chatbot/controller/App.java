package br.com.chatbot.chatbot.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


import br.com.chatbot.chatbot.config.Msg;
import br.com.chatbot.chatbot.service.OpenAIChatService;

@Controller
public class App {

    private OpenAIChatService openAIService;

    public App(OpenAIChatService openAIService) {
        this.openAIService = openAIService;
    }

    @MessageMapping("/chatMessage")
    @SendTo("/chat")
    public Msg sendMessage(Msg message){
        String userMessage = message.getMsg();
        String response = openAIService.getChatGPTResponse(userMessage);
        return new Msg("ChatGPT", response);
    }
}
