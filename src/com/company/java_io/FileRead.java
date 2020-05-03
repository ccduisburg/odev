package com.company.java_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileRead {
    Reader fileReader;

    {
        try {
            fileReader = new FileReader("\\src\\text.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    int data;

    {
        try {
            data = fileReader.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
