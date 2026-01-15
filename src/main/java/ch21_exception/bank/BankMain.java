package ch21_exception.bank;

import ch21_exception.signup.InvalidIdException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankMain {
    int balance = 10000;
    public void withdraw(int amount) throws InsufficientBalanceException {
        if( amount > balance){
            throw new InsufficientBalanceException("잔액이 부족합니다. (부족 금액: "+ (amount - balance)+")");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankMain bankMain = new BankMain();
        System.out.println("금액을 입력해주세요 >>> ");
        try{
            int amount = sc.nextInt();
            bankMain.withdraw(amount);
            System.out.println("출금 후 잔액 : "+ (bankMain.balance-amount));
        } catch (InsufficientBalanceException e) {
            System.out.println("출금 실패 : " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("정수만 입력이 가능합니다.");
        }
    }
}
