package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter //lombok 라이브러리로 getter/setter 자동 추가
public class HelloData {

    private String username;
    private int age;

}
