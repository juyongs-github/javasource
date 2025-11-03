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

    public int insert() {
        int result = 0;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }

        return result;
    }

    public int delete() {
        int result = 0;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(ps);
        }

        return result;
    }

    public ProfessorDTO getRow() {
        ProfessorDTO dto = null;
        int result = 0;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(ps);
        }

        return dto;
    }
}
