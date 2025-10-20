package io;

import java.io.*;

// InputStream : 추상 클래스
// 이미지, 영상 파일도 다룰 수 있음
// read() : 한 byte를 읽어 int로 리턴
// read(byte[] b) : byte[] 만큼 읽어오고 읽어온 데이터 수 반환
// read(byte[] b, int off, int len) : 특정 위치로 부터 byte[] 만큼 읽어오기

public class InputStreamEx1 {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:\\temp\\img1.jpg");
            OutputStream out = new FileOutputStream("C:\\temp\\copy2.jpg");

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = in.read(bytes)) != -1) {
                // System.out.print((char) input);
                out.write(bytes);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
