package io;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아서 파일에 출력하는 프로그램 작성
        // 'q' 입력 시 입력 받던 걸 중지
        try {
            Scanner sc = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\output3.txt"));
            String input = "";
            System.out.println("파일에 작성할 데이터를 입력해 주세요.");
            System.out.println("중지를 원하시면 q를 입력 하세요.");

            do {
                System.out.print(">> ");
                input = sc.next();
                bw.write(input);
                bw.newLine();
            } while (!"q".equals(input));

            sc.close();
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
