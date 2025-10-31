package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
    public static void main(String[] args) {
        // DB 서버 연결
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";

            // 2. DB 연결
            con = DriverManager.getConnection(url, user, password);
            System.out.println("연결 되었습니다.");

            // 3. SQL 구문
            String sql = "SELECT * FROM EMP";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

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
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (Exception e) {

            }
        }
    }
}
