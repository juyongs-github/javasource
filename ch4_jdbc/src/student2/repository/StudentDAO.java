package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    // INSERT
    public int insert(StudentDTO studentDTO) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "INSERT INTO student VALUES(?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentDTO.getStudentId());
            ps.setString(2, studentDTO.getName());
            ps.setDouble(3, studentDTO.getHeight());
            ps.setString(4, studentDTO.getDeptId());
            result = ps.executeUpdate();

            if (result > 0) {
                commit(con);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(ps);
            close(con);
        }

        return result;
    }

    // DELETE : student_id
    public int delete(String studentId) {
        int result = 0;

        try {
            con = getConnection();
            String sql = "DELETE FROM student WHERE student_id = ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentId);
            result = ps.executeUpdate();

            if (result > 0) {
                commit(con);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(ps);
            close(con);
        }

        return result;
    }

    // UPDATE : height 수정
    public int update(StudentDTO studentDTO) {
        int result = 0;
        try {
            con = getConnection();
            String sql = "UPDATE student SET height = ? WHERE student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setDouble(1, studentDTO.getHeight());
            ps.setString(2, studentDTO.getStudentId());
            result = ps.executeUpdate();

            if (result > 0) {
                commit(con);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(ps);
            close(con);
        }

        return result;
    }

    // 전체 학생 조회 (dept_id)
    public List<StudentDTO> getRows(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            con = getConnection();
            String sql = "SELECT * FROM student WHERE dept_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, deptId);
            rs = ps.executeQuery();

            while (rs.next()) {
                StudentDTO studentDTO = new StudentDTO();
                studentDTO.setStudentId(rs.getString("student_id"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setHeight(rs.getDouble("height"));
                studentDTO.setDeptId(rs.getString("dept_id"));
                list.add(studentDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(ps);
            close(con);
        }

        return list;
    }

    // 특정 학생 조회 (student_id)
    public StudentDTO getRow(String studentId) {
        StudentDTO studentDTO = new StudentDTO();
        try {
            con = getConnection();
            String sql = "SELECT * FROM student WHERE student_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, studentId);
            rs = ps.executeQuery();

            while (rs.next()) {
                studentDTO.setStudentId(rs.getString("student_id"));
                studentDTO.setName(rs.getString("name"));
                studentDTO.setHeight(rs.getDouble("height"));
                studentDTO.setDeptId(rs.getString("dept_id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(ps);
            close(con);
        }

        return studentDTO;
    }
}