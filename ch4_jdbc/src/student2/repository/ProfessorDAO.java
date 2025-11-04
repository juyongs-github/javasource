package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import student2.dto.ProfessorDTO;

public class ProfessorDAO {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;

    public ProfessorDAO(Connection con) {
        this.con = con;
    }

    public int insert(ProfessorDTO professorDTO) {
        int result = 0;
        try {
            String sql = "INSERT INTO professor VALUES(?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, professorDTO.getProfId()); // sql에서 '?' 부분에 들어갈 값 지정
            ps.setString(2, professorDTO.getProfName());
            ps.setString(3, professorDTO.getDeptId());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }

        return result;
    }

    public int update(ProfessorDTO professorDTO) {
        int result = 0;
        try {
            String sql = "UPDATE professor SET dept_id = ? WHERE prof_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, professorDTO.getDeptId());
            ps.setString(2, professorDTO.getProfId());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }

        return result;
    }

    public int delete(String profId) {
        int result = 0;
        try {
            String sql = "DELETE FROM professor WHERE prof_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, profId);
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }

        return result;
    }

    public ProfessorDTO getRow(String profId) {
        ProfessorDTO dto = null;
        try {
            String sql = "SELECT * FROM professor WHERE prof_id = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, profId);
            rs = ps.executeQuery();

            while (rs.next()) {
                dto = new ProfessorDTO();
                dto.setProfId(rs.getString("prof_id"));
                dto.setProfName(rs.getString("prof_name"));
                dto.setDeptId(rs.getString("dept_id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(ps);
        }

        return dto;
    }
}
