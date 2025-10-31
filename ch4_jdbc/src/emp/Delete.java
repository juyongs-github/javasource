package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
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
            String sql = "DELETE FROM EMP WHERE empno = 7499";
            PreparedStatement ps = con.prepareStatement(sql);
            int result = ps.executeUpdate();

            System.out.println(result > 0 ? "삭제 성공!!!" : "삭제 실패...");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
