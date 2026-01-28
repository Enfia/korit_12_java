package ch99_practice.ch10_access_modifier;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        setBalance(balance);
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        setBalance(balance);
        setPinNumber(pinNumber);
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

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        if(balance < 0) {
            System.out.println("잔액은 음수일 수 없음");
        } else{
            this.balance = balance;
        }
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber >= 0 && pinNumber <= 9999){
            this.pinNumber = pinNumber;
        } else{
            System.out.println("불가능한 비밀번호입니다.");
        }
    }

    public void deposit(int amount, int inputPin){
        if(inputPin != this.pinNumber){
            System.out.println("비밀번호가 틀렸습니다");
            return;
        }
        if(amount <= 0){
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        this.balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + this.balance+"원");
    }

    public void withdraw(int amount, int inputPin){
        if(inputPin != this.pinNumber){
            System.out.println("비밀번호가 틀렸습니다");
            return;
        }
        if(amount <= 0){
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        if(this.balance < amount){
            System.out.println("출금 불가입니다");
            return;
        }
        this.balance -= amount;
        System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + this.balance+"원");
    }
    public void showAccountInfo(){
        System.out.println("계좌번호 : "+ this.accountNum);
        System.out.println("계좌 소유자 : "+ this.accountHolder);
        System.out.println("현재 잔액 : "+ this.balance +"원");
        System.out.println();
    }
}
