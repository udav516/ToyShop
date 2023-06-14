package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
    public static void writeResults(String fileName, String[] results) {
        try {
            PrintWriter writer = new PrintWriter(new File(fileName));
            for (String result : results) {
                writer.println(result);
            }
            writer.close();
            System.out.println("Результаты записаны в файл " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл " + fileName);
        }
    }
}