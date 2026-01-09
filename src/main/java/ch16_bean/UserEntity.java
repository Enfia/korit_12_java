package ch16_bean;

import lombok.Getter;


@Getter
public class UserEntity {
    private int username;
    private int password;
    private  String email;
    private String name;

    public UserEntity() {
    }

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
