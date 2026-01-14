package ch21_exception;

class LoginFailedException extends Exception{
    public LoginFailedException(String message) {
        super(message); // 메세지를 출력하다는 의미는 아님 그래서 로그인 시 예외가 발생하였습니다 출력 후 로그인 실패가 뜸
        System.out.println("로그인 시 예외가 발생하였습니다.");
    }
}
/*
    Exception(String message){
        this.message = message;
    }
    인 상태임 catch (LoginFailedException e)에서 getter를 통해서 출력했기 때문에 콘솔상의 순서가 다르게 보임
 */

public class Exception2 {
    public static void login(String id, String password) throws LoginFailedException {
        String correctId = "admin";
        String correctPassword = "1q2w3e4r!!";

        // 특정 메서드에서 예외가 발생하는 것을 지정하고 싶다면 throws 명령어를 입력해야 함(3인칭 단수라서)
        if(!id.equals(correctId) || !password.equals(correctPassword)){
            throw new LoginFailedException("ID 또는 PW가 틀렸습니다.");
        }
        // throw(s가 없음) : 동사 원형으로 시작했으니까 명령문임
        // LoginFailedException() 생성자에 String 매개변수를 집어넣어서 객체를 생성했는데,
        // 그 객체를 던지라는 의미임

    }


    public static void main(String[] args) {
        String inputId = "admin";
        String inputPassword = "123qwer!!";
//        login(inputId, inputPassword);
        // throws를 달면 오류가 발생함 그래서 try / catch / finally 쓰라는 뜻임
        // main 메서드에 throws를 입력해도 됨
        try{
            login(inputId, inputPassword);
        } catch (LoginFailedException e) {
            System.out.println("로그인 실패 : " + e.getMessage());
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
