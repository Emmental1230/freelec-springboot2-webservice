package com.emmental.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication                            //항상 최상단에 위치  // springboot의 자동 설정, spring Bean 읽기&생성을 모두 자동으로 설정
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);     //내장 AWS를 실행
    }

}

