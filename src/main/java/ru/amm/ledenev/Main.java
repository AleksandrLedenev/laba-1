package ru.amm.ledenev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("./test.txt"));

            // Следующее улучшение - попробуй прочитать студента, который записан в одну строку (помогут функции scanner.nextInt() и scanner.next())
            Student student = new Student();
            student.firstName = scanner.nextLine();
            student.lastname = scanner.nextLine();
            student.fathername = scanner.nextLine();
            student.group = Integer.parseInt(scanner.nextLine());
            student.course = Integer.parseInt(scanner.nextLine());

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}