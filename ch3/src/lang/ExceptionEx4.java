package lang;

public class ExceptionEx4 {
    public static void main(String[] args) {
        try {
            String data2 = "a100";
            int value2 = Integer.parseInt(data2);
            System.out.println(value2);
        } catch (NumberFormatException e) {
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            // exception 발생 여부와 상관없이 꼭 실행 해야할 코드 작성
            System.out.println("프로그램 재실행");
        }
    }
}
