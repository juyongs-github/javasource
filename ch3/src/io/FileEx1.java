package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // 경로 지정 : / (Unix 계열) or \ (Windows 계열)
        // \ 사용 시 \n, \t 등과 구분하기 위해 \\ 사용
        // File file = new File("C:/tmp/file.txt");
        File file = new File("C:\\tmp\\file1.txt");

        String name = file.getName();
        System.out.println("파일명 : " + name);
        // 확장자를 제외한 이름 추출
        System.out.println("확장자를 제외한 이름 : " + name.substring(0, name.indexOf(".")));
        System.out.println("확장자 이름 : " + name.substring(name.indexOf(".") + 1));
        System.out.println("경로를 포함한 파일명 : " + file.getPath());
        System.out.println("파일이 속해 있는 디렉토리 : " + file.getParent());
        System.out.println("파일 pathSeparator : " + file.pathSeparator);
        System.out.println("파일 pathSeparatorChar : " + file.pathSeparatorChar);
        System.out.println("파일 separator : " + file.separator);
        System.out.println("파일 separatorChar : " + file.separatorChar);
    }
}
