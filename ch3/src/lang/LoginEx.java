package lang;

public class LoginEx {
    public static void main(String[] args) throws NotExistIDException, WrongPasswordException {
        login("white", "12345");
        login("blue", "1212");

        // try {
        // login("white", "12345");
        // login("blue", "1212");
        // } catch (NotExistIDException | WrongPasswordException e) {
        // System.out.println("예외 발생!!");
        // }
    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
        // id가 blue가 아니라면 NotExistIDException 발생
        if (id.equals("blue")) {
            throw new NotExistIDException("아이디를 확인하세요.");
        }
        // password가 "12345"가 아니라면 WrongPasswordException 발생
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호를 확인하세요.");
        }
    }
}
