package com.example.ChatApp.Using.WebSocket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class message {
    private String name;
    private String content;
}
