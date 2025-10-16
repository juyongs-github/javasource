package lang;

// Throwable
//  Exception(예외)
//     - 종류
//     1) 컴파일 예외 : 빨간줄 나오는 부분 => ex) ClassNotFoundException
//     2) 런타임 예외 : 실행해봐야 알 수 있는 예외 => ex) ArithmeticException
//     - 처리 방법
//     1) 예외 처리
//         => try {} catch(Exception) {}
//         => try - catch - finally
//     2) 예외 던지기
//         => 메서드() throws exception1, exception2...
//     - 강제 Exception 발생 시키기
//         => throw new Exception();
//  Error

public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(4 / 0);
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void findClass() throws ClassNotFoundException {
        Class.forName("aaa");
    }
}
