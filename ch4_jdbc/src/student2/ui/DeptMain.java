package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.dto.ProfessorDTO;
import student2.dto.StudentDTO;
import student2.service.DeptService;
import student2.service.ProfessorService;
import student2.service.StudentService;

public class DeptMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeptService deptService = new DeptService();
        ProfessorService professorService = new ProfessorService();
        StudentService studentService = new StudentService();
        ConsoleInfo info = new ConsoleInfo();
        boolean run = true;

        while (run) {
            System.out.println("===================================================================================");
            System.out.print("1. 학과 등록 | ");
            System.out.print("2. 학과 수정 | ");
            System.out.print("3. 학과 삭제 | ");
            System.out.print("4. 학과 조회 | ");
            System.out.print("5. 전체 학과 조회 | ");
            System.out.println();
            System.out.print("6. 교수정보 입력 | ");
            System.out.print("7. 교수정보 수정 | ");
            System.out.print("8. 교수정보 삭제 | ");
            System.out.print("9. 교수정보 조회 | ");
            System.out.println();
            System.out.print("10. 학생정보 입력 | ");
            System.out.print("11. 학생정보 수정 | ");
            System.out.println("12. 학생정보 삭제 | ");
            System.out.print("13. 학생정보 조회(학과별) | ");
            System.out.print("14. 학생정보 조회(개인별) | ");
            System.out.println("15. 프로그램 종료 | ");
            System.out.println("===================================================================================");
            System.out.print("선택 >> ");

            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    // 추가할 학과번호, 학과명 입력
                    DeptDTO deptDTO = info.setDept(sc);
                    boolean result = deptService.addDept(deptDTO);
                    System.out.println(result ? "학과 정보 추가 성공!!!" : "학과 정보 추가 실패...");
                    break;
                case 2:
                    // 수정할 학과정보 입력
                    deptDTO = info.setDept(sc);
                    result = deptService.updateDept(deptDTO);
                    System.out.println(result ? "학과 정보 수정 성공!!!" : "학과 정보 수정 실패...");
                    break;
                case 3:
                    // 삭제할 학과번호 입력
                    String deptId = info.getDeptId(sc);
                    result = deptService.deleteDept(deptId);
                    System.out.println(result ? "학과 정보 삭제 성공!!!" : "학과 정보 삭제 실패...");
                    break;
                case 4:
                    String deptName = info.getDeptName(sc);
                    deptDTO = deptService.getDept(deptName);
                    info.print(deptDTO);
                    break;
                case 5:
                    List<DeptDTO> list = deptService.getDepts();
                    info.printAll(list);
                    break;
                case 6:
                    // 교수 정보 입력 받기
                    ProfessorDTO professorDTO = info.insertProfessor(sc);
                    // 입력 정보 Service로 넘겨준 후 결과 받기
                    result = professorService.insertProfessor(professorDTO);
                    System.out.println(result ? "교수 정보 추가 성공!!!" : "교수 정보 추가 실패...");
                    break;
                case 7:
                    // 수정할 교수 정보 입력 받기
                    professorDTO = info.updateProfessor(sc);
                    // 수정 정보 Service로 넘겨준 후 결과 받기
                    result = professorService.updateProfessor(professorDTO);
                    System.out.println(result ? "교수 정보 수정 성공!!!" : "교수 정보 수정 실패...");
                    break;
                case 8:
                    // 삭제할 교수 정보 입력 받기
                    String profId = info.deleteProfessor(sc);
                    // 삭제 정보 Service로 넘겨준 후 결과 받기
                    result = professorService.deleteProfessor(profId);
                    System.out.println(result ? "교수 정보 삭제 성공!!!" : "교수 정보 삭제 실패...");
                    break;
                case 9:
                    // 조회 할 교수 정보 입력 받기
                    profId = info.selectProfessor(sc);
                    // 조회 정보 Service로 넘겨준 후 결과 받기
                    professorDTO = professorService.getProfessor(profId);
                    // 받은 결과 출력
                    info.printProfessor(professorDTO);
                    break;
                case 10:
                    StudentDTO studentDTO = info.insertStudent(sc);
                    result = studentService.insertStudent(studentDTO);
                    System.out.println(result ? "학생 정보 추가 성공!!!" : "학생 정보 추가 실패...");
                    break;
                case 11:
                    studentDTO = info.updateStudent(sc);
                    result = studentService.updateStudent(studentDTO);
                    System.out.println(result ? "학생 정보 수정 성공!!!" : "학생 정보 수정 실패...");
                    break;
                case 12:
                    String studentId = info.deleteStudent(sc);
                    result = studentService.deleteStudent(studentId);
                    System.out.println(result ? "학생 정보 삭제 성공!!!" : "학생 정보 삭제 실패...");
                    break;
                case 13:
                    deptId = info.getDeptStudent(sc);
                    List<StudentDTO> students = studentService.selectStudentByDeptId(deptId);
                    info.printAllStudent(students);
                    break;
                case 14:
                    studentId = info.getStudentId(sc);
                    studentDTO = studentService.selectStudentByStudentId(studentId);
                    info.printStudent(studentDTO);
                    break;
                case 15:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
