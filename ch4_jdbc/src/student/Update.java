package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
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

            // 수정할 학생 아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();
            System.out.print("키 입력 >> ");
            double height = Double.parseDouble(sc.nextLine());

            String sql = "UPDATE student SET height = ? WHERE student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, height); // sql에서 '?' 부분에 들어갈 값 지정
            ps.setString(2, studentId);
            int rows = ps.executeUpdate();
            System.out.println(rows > 0 ? "수정 성공!!!" : "수정 실패...");
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
