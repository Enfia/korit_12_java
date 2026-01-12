package ch10_access_modifier.bank;

public class Bank {

    // 필드 변수 선언
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    // 기본 생성자
    public Bank() {
    }

    // 생성자 매개변수
    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    // 생성자 매개변수
    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    // 생성자 매개변수
    public Bank(int accountNum, String accountHolder, int balance) {
        setBalance(balance);
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    // AllArgsConstructor임
    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        setBalance(balance);
        setPinNumber(pinNumber);
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    // 이하는 getter임
    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    //이하는 setter임
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // 음수인지 확인해주는거 음수이면 return해서 멈춤
    public void setBalance(int balance) {
        if(balance < 0){
            System.out.println("잔액은 음수 일 수 없음");
            return;
        }
        this.balance = balance;
    }

    // 0~9999까지 비번 가능함 만약 아니라면 return해서 멈춤
    public void setPinNumber(int pinNumber) {
        if(pinNumber<0 || pinNumber>9999){
            System.out.println("불가능한 비밀번호입니다."+"\n");
            return;
        }
        this.pinNumber = pinNumber;
    }

    // 솔모뒤 (솔직히 모르면 뒤져야함)
    public void deposit(int amount, int inputPin){
        if (pinNumber == inputPin){
//            System.out.println("올바른 비밀번호 입니다.");
            if(amount <= 0){
                System.out.println("불가능한 입력 금액입니다."+"\n");
                return;
            }
            this.balance += amount;
            System.out.println(amount +"원이 입금되었습니다. 현재 잔액 : " + this.balance+"\n");return;
        }
        System.out.println("비밀번호가 틀렸습니다."+"\n");
    }

    // 솔모뒤
    public void withdraw(int amount, int inputPin){
        if (pinNumber == inputPin){
//            System.out.println("올바른 비밀번호 입니다.");
            if(amount <= 0 || balance < amount){
                System.out.println("불가능한 입력 금액입니다."+"\n");
                return;
            }
            this.balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액 :"+ this.balance+"\n");
            return;
        }
        System.out.println("비밀번호가 틀렸습니다."+"\n");
    }

    // 솔모뒤
    public void showAccountInfo(){
        System.out.println("계좌 번호 : " + getAccountNum());
        System.out.println("계좌 소유자 : "+ getAccountHolder());
        System.out.println("현재 잔액 : " + getBalance()+"\n");
    }
}
