package com.izzat.chat.dto;

import com.izzat.chat.enums.MessageType;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
public record ChatMessage(
        String content,
        String sender,
        MessageType messageType

) {
}
