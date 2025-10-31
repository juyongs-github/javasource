package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Connect {
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
            String sql = "SELECT * FROM EMP";
            PreparedStatement ps = con.prepareStatement(sql);
            // SELECT 라면 excuteQuery() => ResultSet
            // INSERT, UPDATE, DELETE라면 excuteUpdate() => int(수정 성공한 행의 개수)
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.print(rs.getInt("empno") + "\t");
                System.out.print(rs.getString("ename") + "\t");
                System.out.print(rs.getString("job") + "\t");
                System.out.print(rs.getInt("mgr") + "\t");
                System.out.print(rs.getDate("hiredate") + "\t");
                System.out.print(rs.getInt("sal") + "\t");
                System.out.print(rs.getInt("comm") + "\t");
                System.out.println(rs.getInt("deptno"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}