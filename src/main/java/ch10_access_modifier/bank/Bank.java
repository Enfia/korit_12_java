package ch10_access_modifier.bank;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;
    private final int pinNumberLength =  (int)(Math.log10(pinNumber)+1);
    // final은 잘 모르지만 에디터에서 final 붙이라고 해서 붙임
    // 잘모르겠지만 뭔가 글자수로 변환을 시켜주는 거 같음

    // 2-1
    public Bank() {
    }

    //2-2
    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    //2-3
    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    //2-4
    public Bank(int accountNum, String accountHolder, int balance) {
        setBalance(balance);
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    //2-5
    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        setBalance(balance);
        setPinNumber(pinNumber);
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        if(balance < 0){
            System.out.println("잔액은 음수 일 수 없음");
            return;
        }
        this.balance = balance;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber<0 || pinNumber>9999||pinNumberLength > 4){
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        System.out.println("성공적으로 비밀번호를 생성하였습니다.");
        this.pinNumber = pinNumber;
    }

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

    public void deposit(int amount, int inputPin){
        if (pinNumber == inputPin){
            System.out.println("올바른 비밀번호 입니다.");
            if(amount < 0){
                System.out.println("불가능한 입력 금액입니다.");
                return;
            }
            System.out.println(amount +"원 보낼게요");
            this.balance += amount;
            System.out.println("현재 잔액 : " + this.balance);
            return;
        }
        System.out.println("비밀번호가 틀렸습니다.");
    }

    public void withdraw(int amount, int inputPin){
        if (pinNumber == inputPin){
            System.out.println("올바른 비밀번호 입니다.");
            if(amount < 0 || balance < amount){
                System.out.println("불가능한 입력 금액입니다.");
                return;
            }
            System.out.println(amount + "원 꺼낼게요");
            this.balance -= amount;
            System.out.println("현재 잔액 : " + this.balance);
            return;
        }
        System.out.println("비밀번호가 틀렸습니다.");
    }

    public void showAccountInfo(){
        System.out.println("계좌 번호 : " + getAccountNum());
        System.out.println("계좌 소유자 : "+ getAccountHolder());
        System.out.println("현재 잔액 : " + getBalance());
    }

}
