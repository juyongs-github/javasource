package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileEx2 {
    public static void main(String[] args) {
        File currentDir = new File("C:\\temp");

        File[] files = currentDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        if (currentDir.exists()) {
            currentDir.mkdir();
        }

        File dir = new File("C:\\temp\\dir");
        File file1 = new File("C:\\temp\\dir\\file1.txt");
        File file2 = new File("C:\\temp\\file2.txt");
        File file3 = new File("C:\\temp\\file3.txt");

        if (!dir.exists()) {
            dir.mkdir();
        }

        try {
            if (!file1.exists()) {
                file1.createNewFile();
            }
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (!file3.exists()) {
                file3.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        files = currentDir.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss");

        System.out.println("날짜\t\t시간\t\t형태\t크기\t이름");
        System.out.println("=================================================================");
        for (File file : files) {
            System.out.print(sdf.format(file.lastModified()));
            if (file.isDirectory()) {
                System.out.print("\t<DIR>\t\t" + file.getName());
            } else {
                System.out.print("\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
