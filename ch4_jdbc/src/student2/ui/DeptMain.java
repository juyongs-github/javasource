package student2.ui;

import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;
import student2.service.DeptService;

public class DeptMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeptService deptService = new DeptService();
        ConsoleInfo info = new ConsoleInfo();
        boolean run = true;

        while (run) {
            System.out.println(
                    "==================================================================================================");
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
            System.out.println("10. 프로그램 종료 | ");
            System.out.println(
                    "==================================================================================================");
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

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 10:
                    run = false;
                    break;
                default:
                    break;
            }
        }
    }
}
