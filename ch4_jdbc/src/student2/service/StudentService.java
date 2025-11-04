package student2.service;

import java.util.List;

import student2.dto.StudentDTO;
import student2.repository.StudentDAO;

public class StudentService {
    private StudentDAO studentDAO = new StudentDAO();

    public boolean insertStudent(StudentDTO studentDTO) {
        int result = studentDAO.insert(studentDTO);
        return result > 0 ? true : false;
    }

    public boolean deleteStudent(String studentId) {
        int result = studentDAO.delete(studentId);
        return result > 0 ? true : false;
    }

    public boolean updateStudent(StudentDTO studentDTO) {
        int result = studentDAO.update(studentDTO);
        return result > 0 ? true : false;
    }

    public List<StudentDTO> selectStudentByDeptId(String deptId) {
        return studentDAO.getRows(deptId);
    }

    public StudentDTO selectStudentByStudentId(String studentId) {
        return studentDAO.getRow(studentId);
    }
}
