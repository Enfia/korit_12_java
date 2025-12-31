package ch10_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {
//        Bank test1 = new Bank(123456, "홍길동", 1000000);
//        test1.setPinNumber(12345);
//        test1.showAccountInfo();

        Bank account1 = new Bank(123456, "홍길동", 100000, 1234);
        Bank account2 = new Bank(987654, "신사임당", 500000, 1234);

        account1.showAccountInfo();
        account2.showAccountInfo();

        account1.deposit(50000,1234);
        account1.withdraw(200000, 1234);
        account1.withdraw(100000, 1234);

        account2.withdraw(100000,1234);
        account2.deposit(200000,1234);


        System.out.println("최종 계좌 정보");
        account1.showAccountInfo();
        account2.showAccountInfo();

    }
}
