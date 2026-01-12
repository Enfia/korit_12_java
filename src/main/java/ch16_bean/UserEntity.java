package ch16_bean;

import lombok.Getter;

// 롬복 사용함 쉬움
@Getter
public class UserEntity {
    private int username;
    private int password;
    private  String email;
    private String name;

    // 생성자
    public UserEntity() {
    }

    // setter 사용 getter는 위에 롬복 함
    햣
    public void setUsername(int username) {
        this.username = username;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "username : " + username + "\nemail : " + email + "\nname : " + name + "\n비밀번호는 보안 상 제공하지 않습니다.";
    }
}
