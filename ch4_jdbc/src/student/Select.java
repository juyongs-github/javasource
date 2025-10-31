package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "JAVADB";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM student";
            ps = con.prepareStatement(sql);
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
