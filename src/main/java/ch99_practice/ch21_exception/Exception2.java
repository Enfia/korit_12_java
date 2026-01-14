package ch99_practice.ch21_exception;

class LoginFaildException extends Exception{
    public LoginFaildException(String message) {
        super(message);
        System.out.println("로그인 시 예외가 발생하였습니다.");
    }
}
public class Exception2 {
    static void mainLogin(String id, String pw) throws LoginFaildException{
        String correctId = "admin";
        String correctPw = "admin";
        if(!id.equals(correctId)||!pw.equals(correctPw)){
            throw new LoginFaildException("ID 또는 비밀번호가 틀렸습니다");
        }
    }
    public static void main(String[] args) {
        String id123 = "admin";
        String pw123 = "1234";
        try{
            mainLogin(id123, pw123);
        } catch (LoginFaildException e){
            System.out.println("사유 : "+e.getMessage());
        } finally {
            System.out.println("프로그램이 정상 종료합니다.");
        }



    }
}
