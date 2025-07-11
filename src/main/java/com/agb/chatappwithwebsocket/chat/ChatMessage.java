package com.agb.chatappwithwebsocket.chat;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType messageType;

}
