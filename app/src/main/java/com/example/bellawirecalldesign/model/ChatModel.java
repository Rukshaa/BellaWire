package com.example.bellawirecalldesign.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class ChatModel {

    private int profileImage;
    private String profileName;
    private String profileText;
    private String time;

}
