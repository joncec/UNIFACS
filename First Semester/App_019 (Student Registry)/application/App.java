package application;

import entities.*;
import java.util.Scanner;
import java.util.ArrayList;

public class App {

public static void main(String[] args) {
    int selection;

    for (int i = 0; i < 1; i++) {
        selection = menu();
        ArrayList<Student> students = new ArrayList<Student>();

        switch (selection) {
            case 1:
                System.out.println("Student registry:");
                System.out.println("************************");
                System.out.println("Insert the number of students to register:");
                Scanner scan = new Scanner(System.in);
                int amount = scan.nextInt();
                for (int j = 0; j < amount; j++) {
                    System.out.println("Enter student type (1 for College / 2 for High School):");
                    int studentType = scan.nextInt();
                    scan.nextLine(); 

                    System.out.println("Enter student registration number:");
                    int reg = scan.nextInt();
                    scan.nextLine(); 

                    System.out.println("Enter student name:");
                    String name = scan.nextLine();

                    if (studentType == 1) {
                        System.out.println("Enter student discipline:");
                        String discipline = scan.nextLine();
                        students.add(new ColStudent(reg, name, discipline));
                    } else if (studentType == 2) {
                        System.out.println("Enter student year:");
                        int year = scan.nextInt();
                        students.add(new HiScStudent(reg, name, year));
                    } else {
                        System.out.println("Invalid student type. Skipping student.");
                    }
                }
                scan.close();

                boolean c1opt = cont();
                if (c1opt) {
                    i--;
                } else {
                    break;
                }
                break;

            case 2:
                System.out.println("List of all students:");
                for (Student student : students) {
                    System.out.println(student);
                }
                boolean c2opt = cont();
                if (c2opt) {
                    i--;
                } else {
                    break;
                }
                break;

            case 3:
                break;

            default:
                System.out.println("Invalid Input");
                i--;
        }
    }
}

public static int menu() {
    Scanner scan = new Scanner(System.in);

    System.out.println("************************");
    System.out.println("   SELECT AN OPTION:");
    System.out.println("************************");
    System.out.println("[1] Register Student");
    System.out.println("[2] List Students");
    System.out.println("[3] Exit");
    System.out.println("************************");

    int selection = scan.nextInt();
    scan.nextLine();
    scan.close(); 
    return selection;
}

public static boolean cont() {
    Scanner scan = new Scanner(System.in);

    System.out.println("Do you wish to continue?");
    System.out.println("(Press [1] to Confirm, [2] to Exit.)");
    int x = scan.nextInt();
    scan.nextLine(); 

    scan.close();

    return (x != 1);
}
}
