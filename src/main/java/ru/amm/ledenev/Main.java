package ru.amm.ledenev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("./test.txt"));

            Student student = new Student();
            student.firstName = scanner.next();
            student.lastname = scanner.next();
            student.fathername = scanner.next();
            student.group = scanner.nextInt();
            student.course = scanner.nextInt();

            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}