package io;

import java.io.*;

// InputStreamReader : byte 기반 스트림을 문자 기반 스트림으로 연결
// OutputStreamWriter : byte 기반 스트림의 데이터를 지정된 인코딩의 문자 데이터로 변환

public class ReaderEx1 {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("C:\\temp\\dir\\file1.txt");
            Reader is = new InputStreamReader(in, "UTF-8");
            Writer out = new FileWriter("C:\\temp\\output2.txt");

            int input = 0;
            char[] cbuf = new char[1024];
            while ((input = in.read()) != -1) {
                out.write(cbuf);
            }

            in.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
