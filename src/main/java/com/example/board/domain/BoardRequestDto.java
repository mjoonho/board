package com.example.board.domain;

import lombok.Getter;
import org.apache.logging.log4j.util.Strings;

@Getter
public class BoardRequestDto {
    private String username;
    private String contents;
    private  String title;
    private String name;

}
