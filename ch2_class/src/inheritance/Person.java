package inheritance;

// final
// 1. 클래스 앞에 붙으면 상속 불가
// 2. 메소드 앞에 붙으면 오버라이딩 불가
// 3. 변수 앞에 붙으면 값 변경 불가

public /* final */ class Person {
    static final int MAX = 15; // 상수
    String name;

    public Person(String name) {
        this.name = name;
    }

    final void test() {

    }
}
