package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insert {
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

            // 입력할 학생 정보 입력받기
            System.out.print("아이디 입력 >> ");
            String studentId = sc.nextLine();
            System.out.print("이름 입력 >> ");
            String name = sc.nextLine();
            System.out.print("키 입력 >> ");
            double height = Double.parseDouble(sc.nextLine());
            System.out.print("학과코드 입력 >> ");
            String deptId = sc.nextLine();

            String sql = "INSERT INTO student ";
            sql += "VALUES(?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentId); // sql에서 '?' 부분에 들어갈 값 지정
            ps.setString(2, name);
            ps.setDouble(3, height);
            ps.setString(4, deptId);
            int rows = ps.executeUpdate();

            System.out.println(rows > 0 ? "입력 성공!!!" : "입력 실패...");
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
