package murat.celik.javaollamachatbot;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final ChatClient chatClient;

    public ChatService(ChatClient.Builder chatClientBuilder) {
        // Spring AI 1.0+ ChatClient yapılandırması
        this.chatClient = chatClientBuilder.build();
    }

    public String getResponse(String message) {
        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}