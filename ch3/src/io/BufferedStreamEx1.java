package io;

import java.io.*;

public class BufferedStreamEx1 {
    public static void main(String[] args) {
        try {
            // InputStream in = new FileInputStream("C:\\temp\\dir\\file1.txt");
            // BufferedInputStream bis = new BufferedInputStream(in);

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\temp\\dir\\file1.txt"));

            // OutputStream out = new FileOutputStream("C:\\temp\\output3.txt");
            // BufferedOutputStream bos = new BufferedOutputStream(out);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\temp\\output2.txt"));

            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = bis.read()) != -1) {
                bos.write(bytes);
            }

            // in.close();
            bos.flush();
            bos.close();
            // out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
