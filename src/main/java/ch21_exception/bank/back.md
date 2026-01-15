## # 3 은행 계좌 출금 시스템
상황: 통장 잔액보다 더 많은 금액을 출금할 수 없습니다.

요구사항:

InsufficientBalanceException 사용자 정의 예외 클래스를 만드세요.

int balance = 10000; (현재 잔액)을 선언합니다.

withdraw(int amount) 메서드에서 amount > balance일 경우 예외를 발생시키세요. (메시지: "잔액이 부족합니다. (부족 금액: OOO원)")

main에서 출금액을 입력받아 처리하세요.