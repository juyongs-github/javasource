package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ProfessorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "JAVADB";
            String password = "12345";

            con = DriverManager.getConnection(url, user, password);

            boolean run = true;
            while (run) {
                System.out.println("==========================");
                System.out.println("1. 교수정보 입력");
                System.out.println("2. 교수정보 수정");
                System.out.println("3. 교수정보 삭제");
                System.out.println("4. 교수정보 조회");
                System.out.println("5. 프로그램 종료");
                System.out.println("==========================");
                System.out.print("선택 >> ");

                int menu = Integer.parseInt(sc.nextLine());
                switch (menu) {
                    case 1:
                        ProfessorDTO professorDTO = insert();

                        String sql = "INSERT INTO professor VALUES(?, ?, ?)";
                        ps = con.prepareStatement(sql);
                        ps.setString(1, professorDTO.getProfId()); // sql에서 '?' 부분에 들어갈 값 지정
                        ps.setString(2, professorDTO.getProfName());
                        ps.setString(3, professorDTO.getDeptId());

                        int rows = ps.executeUpdate();
                        System.out.println(rows > 0 ? "입력 성공!!!" : "입력 실패...");
                        break;
                    case 2:
                        update();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        select();
                        break;
                    case 5:
                        run = false;
                        break;
                    default:
                        break;
                }
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

    public static ProfessorDTO insert() {
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 입력 >> ");
        String profId = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String profName = sc.nextLine();
        System.out.print("학과코드 입력 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, profName, deptId);
    }

    public static void update() {

    }

    public static void delete() {

    }

    public static void select() {

    }
}
