package br.com.chatbot.chatbot.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.completion.chat.ChatCompletionRequest;
import com.theokanning.openai.completion.chat.ChatCompletionResult;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

@Service
public class OpenAIChatService {

    private final OpenAiService openAIService;

    public OpenAIChatService(@Value("${openai.api.key}") String apiKey) {
        this.openAIService = new OpenAiService(apiKey);
    }

    public String getChatGPTResponse(String prompt) {

        ChatMessage userMessage = new ChatMessage("user", prompt);

        ChatCompletionRequest chatCompletionRequest = ChatCompletionRequest.builder()
            .model("gpt-4")
            .messages(Collections.singletonList(userMessage))
            .maxTokens(50)
            .build();

        ChatCompletionResult chatCompletionResult = openAIService.createChatCompletion(chatCompletionRequest);
        
        if (chatCompletionResult != null && chatCompletionResult.getChoices() != null && !chatCompletionResult.getChoices().isEmpty()) {
            return chatCompletionResult.getChoices().get(0).getMessage().getContent().trim();
        }
        return "Desculpe, não consegui gerar uma resposta.";

    }
}
