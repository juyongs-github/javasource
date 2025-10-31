package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "JAVADB";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            // 삭제할 학생 아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();

            // java.sql.SQLIntegrityConstraintViolationException
            // ORA-02292: 무결성 제약조건(JAVADB.FK_ENROLLMENT_STUDENT)이 위배되었습니다- 자식 레코드가 발견되었습니다

            // 부모 삭제
            String sql = "DELETE FROM enrollment WHERE student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentId); // sql에서 '?' 부분에 들어갈 값 지정
            int rows = ps.executeUpdate();

            // 자식 삭제
            sql = "DELETE FROM student WHERE student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentId); // sql에서 '?' 부분에 들어갈 값 지정
            rows = ps.executeUpdate();

            System.out.println(rows > 0 ? "삭제 성공!!!" : "삭제 실패...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
