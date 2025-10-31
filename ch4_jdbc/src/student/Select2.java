package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Select2 {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "JAVADB";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            // 조회할 학생 아이디 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();

            String sql = "SELECT * FROM student WHERE student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentId); // sql에서 '?' 부분에 들어갈 값 지정
            rs = ps.executeQuery();

            while (rs.next()) {
                String id = rs.getString("student_id");
                String name = rs.getString("name");
                double height = rs.getDouble("height");
                String deptId = rs.getString("dept_id");
                System.out.printf("%s\t%s\t%f\t%s\n", id, name, height, deptId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
