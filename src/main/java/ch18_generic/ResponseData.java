package ch18_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> {
    private String message;
    private T data;
}
/*
    Generic을 쓸거라면 클래스에 서 추가적인 명령어 필요
    <T> 이거 빼먹으면 안됨
 */