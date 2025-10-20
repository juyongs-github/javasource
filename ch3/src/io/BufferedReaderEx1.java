package io;

import java.io.*;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("C:\\temp\\dir\\file1.txt");
            // InputStreamReader reader = new InputStreamReader(in, "UTF-8");
            // BufferedReader br = new BufferedReader(reader);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(new FileInputStream("C:\\temp\\dir\\file1.txt"), "UTF-8"));

            // Writer out = new FileWriter("C:\\temp\\output2.txt");
            // BufferedWriter bw = new BufferedWriter(out);

            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\temp\\output2.txt"));

            String input = null;
            while ((input = br.readLine()) != null) {
                bw.write(input);
                bw.newLine(); // enter
            }

            // in.close();
            bw.flush(); // buffer 비우기
            bw.close();
            // out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
