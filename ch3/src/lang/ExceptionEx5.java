package lang;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            String data2 = "a100";
            int value2 = Integer.parseInt(data2);
            System.out.println(value2);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("인자값을 확인하거나 입력값 확인");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
