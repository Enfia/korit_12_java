# 미션 1 — 다운캐스팅 제거하기 (다형성 체감)

## 🎯 목표
- `instanceof`와 **다운캐스팅을 전부 제거**
- `performSpecificMethod()`를 **다형성 구조**로 리팩토링

---

## 📌 현재 문제점
- `CentralControl` 내부에서
    - `instanceof` 사용
    - `(AirConditioner) device` 같은 다운캐스팅 존재
- 전자기기 추가 시 `else if`가 계속 늘어남

👉 **확장에 취약한 구조**

---

## 🧩 미션 1 단계

### ✅ Step 1. `Power` 인터페이스 수정
아래 메서드 **1개 추가**

```java
void action();
