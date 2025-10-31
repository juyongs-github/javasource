package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
    public static void main(String[] args) {
        // DB 서버 연결
        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            // 2. DB 연결
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("연결 되었습니다.");

            // 3. SQL 구문
            String sql = "INSERT INTO EXAM_EMP ";
            sql += "VALUES(7201, 'TEST_USER1', 'MANAGER', 7788, '2016-01-02', 4500, NULL, 50)";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();

            System.out.println(result > 0 ? "입력 성공!!!" : "입력 실패...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
