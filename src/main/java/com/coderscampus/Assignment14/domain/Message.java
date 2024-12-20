package com.coderscampus.Assignment14.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private String text;
    private Channel channel;
    private User user;
}
