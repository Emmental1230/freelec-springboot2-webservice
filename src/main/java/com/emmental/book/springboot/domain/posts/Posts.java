package com.emmental.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Getter                 //lombok의 어노테이션
@NoArgsConstructor      //lombok의 어노테이션
@Entity                 //JPA의 어노테이션
                        //table과 link될 class임을 나타냄
                        //기본값으로 class의 카멜케이스 이름을 언더스코어 네이밍으로 table이름을 매칭함
                        //ex) SalesManager.java -> sales_manaber table
public class Posts {

    @Id                 //해당 table의 PK 필드를 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //PK의 생성 규칙을 나타냄
    private Long id;

    @Column(length= 500, nullable = false)                  //table의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 class의 필드는
                                                            //모두 칼럼이 된다.
                                                            //사용하는 이유는 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
