package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;

public class ConsoleInfo {
    public String getDeptId(Scanner sc) {
        System.out.println("\n---------- 학과 정보 입력 ----------");
        System.out.print("학과 코드 >> ");
        String deptId = sc.nextLine();

        return deptId;
    }

    public DeptDTO setDept(Scanner sc) {
        System.out.println("\n---------- 학과 정보 입력 ----------");
        System.out.print("학과 코드 >> ");
        String deptId = sc.nextLine();
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();

        return new DeptDTO(deptId, deptName);
    }

    public String getDeptName(Scanner sc) {
        System.out.print("학과명 >> ");
        String deptName = sc.nextLine();

        return deptName;
    }

    public void print(DeptDTO deptDTO) {
        System.out.println("\n---------- 전체 학과 정보 ----------");
        System.out.println("학과번호\t학과명");
        System.out.println("------------------------------------");

        if (deptDTO != null) {
            System.out.print(deptDTO.getDeptId() + "\t\t");
            System.out.println(deptDTO.getDeptName());
        }
    }

    public void printAll(List<DeptDTO> list) {
        System.out.println("\n---------- 전체 학과 정보 ----------");
        System.out.println("학과번호\t학과명");
        System.out.println("------------------------------------");

        if (!list.isEmpty()) {
            for (DeptDTO deptDTO : list) {
                System.out.print(deptDTO.getDeptId() + "\t\t");
                System.out.println(deptDTO.getDeptName());
            }
        }
    }

    public ProfessorDTO insertProfessor(Scanner sc) {
        System.out.print("아이디 입력 >> ");
        String profId = sc.nextLine();
        System.out.print("이름 입력 >> ");
        String profName = sc.nextLine();
        System.out.print("학과코드 입력 >> ");
        String deptId = sc.nextLine();

        return new ProfessorDTO(profId, profName, deptId);
    }

    public ProfessorDTO updateProfessor(Scanner sc) {
        // 수정할 교수 아이디 받기
        System.out.println("===== 수정할 교수 정보 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        System.out.print("학과코드 >> ");
        String deptId = sc.nextLine();

        ProfessorDTO professorDTO = new ProfessorDTO();
        professorDTO.setProfId(profId);
        professorDTO.setDeptId(deptId);
        return professorDTO;
    }

    public String deleteProfessor(Scanner sc) {
        // 삭제할 교수 아이디 받기
        System.out.println("===== 삭제할 교수 정보 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

    public String selectProfessor(Scanner sc) {
        // 특정 교수 조회
        System.out.println("===== 교수 조회 =====");
        System.out.print("교수번호 >> ");
        String profId = sc.nextLine();
        return profId;
    }

    public void printProfessor(ProfessorDTO professorDTO) {
        if (professorDTO != null) {
            System.out.println("교수번호 : " + professorDTO.getProfId());
            System.out.println("교수명 : " + professorDTO.getProfName());
            System.out.println("학과번호 : " + professorDTO.getDeptId());
        }
    }

    public StudentDTO insertStudent(Scanner sc) {
        System.out.println("\n---------- 학생 정보 입력 ----------");
        System.out.print("학번 >> ");
        String studentId = sc.nextLine();
        System.out.print("이름 >> ");
        String name = sc.nextLine();
        System.out.print("키 >> ");
        double height = Double.parseDouble(sc.nextLine());
        System.out.print("학과 코드 >> ");
        String deptId = sc.nextLine();

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentId(studentId);
        studentDTO.setName(name);
        studentDTO.setHeight(height);
        studentDTO.setDeptId(deptId);

        return studentDTO;
    }

    public StudentDTO updateStudent(Scanner sc) {
        System.out.println("\n---------- 학생 정보 입력 ----------");
        System.out.print("학번 >> ");
        String studentId = sc.nextLine();
        System.out.print("키 >> ");
        double height = Double.parseDouble(sc.nextLine());

        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentId(studentId);
        studentDTO.setHeight(height);

        return studentDTO;
    }

    public String deleteStudent(Scanner sc) {
        System.out.println("\n---------- 학생 정보 입력 ----------");
        System.out.print("학번 >> ");
        String studentId = sc.nextLine();

        return studentId;
    }

    public String getDeptStudent(Scanner sc) {
        System.out.println("\n---------- 학생 정보 입력 ----------");
        System.out.print("학번 >> ");
        String deptId = sc.nextLine();

        return deptId;
    }

    public String getStudentId(Scanner sc) {
        System.out.println("\n---------- 학생 정보 입력 ----------");
        System.out.print("학과 번호 >> ");
        String studentId = sc.nextLine();

        return studentId;
    }

    public void printStudent(StudentDTO studentDTO) {
        if (studentDTO != null) {
            System.out.println("학번 : " + studentDTO.getStudentId());
            System.out.println("이름 : " + studentDTO.getName());
            System.out.println("키 : " + studentDTO.getHeight());
            System.out.println("학과 번호 : " + studentDTO.getDeptId());
        }
    }

    public void printAllStudent(List<StudentDTO> list) {
        if (!list.isEmpty()) {
            for (StudentDTO dto : list) {
                System.out.print("학번 : " + dto.getStudentId() + " | ");
                System.out.print("이름 : " + dto.getName() + " | ");
                System.out.print("키 : " + dto.getHeight() + " | ");
                System.out.print("학과 번호 : " + dto.getDeptId());
                System.out.println();
            }
        }
    }
}