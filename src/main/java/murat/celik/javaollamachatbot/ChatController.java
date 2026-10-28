package murat.celik.javaollamachatbot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    private final murat.celik.javaollamachatbot.ChatService chatService;

    public ChatController(murat.celik.javaollamachatbot.ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam(value = "message", defaultValue = "Merhaba") String message) {
        return chatService.getResponse(message);
    }
}