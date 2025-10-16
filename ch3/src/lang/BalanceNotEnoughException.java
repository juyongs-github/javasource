package lang;

// 상속 받을 예외 클래스 지정하기
// Exception : 컴파일 예외 발생
// RuntimeException : 실행 시 예외 발생
// public class BalanceNotEnoughException extends Exception {
//     public BalanceNotEnoughException() {

//     }

//     public BalanceNotEnoughException(String message) {
//         super(message);
//     }
// }

public class BalanceNotEnoughException extends RuntimeException {
    public BalanceNotEnoughException() {

    }

    public BalanceNotEnoughException(String message) {
        super(message);
    }
}