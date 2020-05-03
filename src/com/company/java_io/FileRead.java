package com.company.java_io;

import java.io.*;
import java.util.Scanner;

public class FileRead {


    public static void main(String[] args) throws IOException {
        try {
            //Önceden acilmis dosyaya  ekleme yapmak icin
            BufferedWriter out = new BufferedWriter(new FileWriter("/home/cc/IdeaProjects/deneme/src/file.txt", true));
            out.write(" This is appendText");
            out.newLine();
            out.close();
            // Bir text dosyasinin icerigini okumak
            File myObj=new File("/home/cc/IdeaProjects/deneme/src/file.txt");
            Scanner myReader;
            myReader = new Scanner(myObj);
            //Bütün satirlari sonuna kadar okumak icin
            while(myReader.hasNextLine()){
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
