package object;

public class StudentEx1 {
    public static void main(String[] args) {
        // 객체 생성
        Student obj = new Student();

        // 인스턴스 초기화
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        obj.changeName();
        System.out.println(obj);

        // 메서드 호출
        // 1) 결과 반환 : 변수에 담거나 혹은 print 구문 사용
        // 2) 결과 변환 X : 호출만 하기
        System.out.println(obj.getAddress());

        Student student = new Student();
        student.setName("성춘향");
        student.setTel("010-1111-2222");
        student.setAddress("경기도 수원시");
        // System.out.println(student);
        System.out.println(student.getName());

    }
}
