package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import student2.dto.DeptDTO;

// DAO(Data Access Object) : 데이터베이스 관련 작업
public class DeptDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public DeptDAO(Connection con) {
        this.con = con;
    }

    public int insert(DeptDTO deptDTO) {
        int result = 0;
        try {
            String sql = "INSERT INTO department VALUES(?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, deptDTO.getDeptId());
            ps.setString(2, deptDTO.getDeptName());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }
        return result;
    }

    public int delete(String deptId) {
        int result = 0;
        try {
            String sql = "DELETE FROM department WHERE dept_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, deptId);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }
        return result;
    }

    public int update(DeptDTO deptDTO) {
        int result = 0;
        try {
            String sql = "UPDATE department SET dept_name = ? WHERE dept_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, deptDTO.getDeptName());
            ps.setString(2, deptDTO.getDeptId());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }
        return result;
    }

    // 조회 결과가 하나인 경우
    // 특정 학과 조회
    public DeptDTO getRow(String deptName) {
        DeptDTO deptDTO = null;

        try {
            String sql = "SELECT * FROM department WHERE dept_name = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, deptName);
            rs = ps.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                deptName = rs.getString("dept_name");
                deptDTO = new DeptDTO(deptId, deptName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(ps);
        }

        return deptDTO;
    }

    // 조회 결과가 여러개인 경우
    // 전체 학과 조회
    public List<DeptDTO> getRows() {
        List<DeptDTO> list = new ArrayList<>();

        try {
            String sql = "SELECT * FROM department";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");
                list.add(new DeptDTO(deptId, deptName));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(ps);
        }

        return list;
    }
}