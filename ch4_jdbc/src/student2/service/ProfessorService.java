package student2.service;

import java.sql.Connection;
import java.sql.SQLException;

import student2.dto.ProfessorDTO;
import static student2.repository.JDBCUtil.*;
import student2.repository.ProfessorDAO;

// Controller <=> Service <=> DAO
public class ProfessorService {
    public boolean insertProfessor(ProfessorDTO professorDTO) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int rows = dao.insert(professorDTO);

            if (rows > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }

        return false;
    }

    public boolean updateProfessor(ProfessorDTO professorDTO) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int rows = dao.update(professorDTO);

            if (rows > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }

        return false;
    }

    public boolean deleteProfessor(String profId) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int rows = dao.delete(profId);

            if (rows > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }

        return false;
    }

    public ProfessorDTO getProfessor(String profId) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            ProfessorDTO dto = dao.getRow(profId);
            return dto;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con);
        }

        return null;
    }
}