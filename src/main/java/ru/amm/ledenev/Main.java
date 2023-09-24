package ru.amm.ledenev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("/Users/aleksandrledenev/Desktop/Лаба1/test.txt"));

            Student student = new Student();
            student.FirstName = scanner.nextLine();
            student.LastName = scanner.nextLine();
            student.FatherName = scanner.nextLine();
            student.Group = Integer.parseInt(scanner.nextLine());
            student.Course = Integer.parseInt(scanner.nextLine());

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}