package com.javaIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ApplicationJavaIo {
    public static void main(String[] args) throws IOException {

        File file = new File("test-ch.txt");

        System.out.println("file.length : " + file.length());

//        System.out.println(file.createNewFile());

        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("\nvahid\n");
        fileWriter.write("aliani");
//        fileWriter.flush();
        fileWriter.close();
        System.out.println("file.length : " + file.length());

        /*System.out.println("isFile : "+file.isFile());
        System.out.println("isFile : "+file.isDirectory());
        System.out.println("isFile : "+file.isHidden());
        System.out.println("isFile : "+file.getName());
        System.out.println("isFile : "+file.getAbsolutePath());*/
    }
}
