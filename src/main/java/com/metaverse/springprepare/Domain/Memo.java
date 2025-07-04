package com.metaverse.springprepare.Domain;


import lombok.RequiredArgsConstructor;

//@Getter
//@Setter //값 변경
//@NoArgsConstructor  // 기본 생성자 생성 에너테이션
//@AllArgsConstructor // 모든 필드를 파라미터로 받는 생성자
@RequiredArgsConstructor // final 필드를 필수로 가져야하는 생성자
public class Memo {
    private final String username;
    private String contents;
    private String description;
    private final String password;
}
