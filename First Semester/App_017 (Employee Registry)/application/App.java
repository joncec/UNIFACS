package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("| START |");

        System.out.println("Number of employees:");
        int k = scan.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            System.out.println("Worker Data:");
            System.out.println("Outsourced? (y/n)");
            scan.nextLine(); // Consume the new line character
            char j = scan.nextLine().charAt(0);
            System.out.println("Worker " + (i + 1) + "'s name:");
            String name = scan.nextLine();
            System.out.println("Worker " + (i + 1) + "'s hours worked:");
            double hours = scan.nextDouble();
            System.out.println("Worker " + (i + 1) + "'s hourly rate:");
            double hourlyRate = scan.nextDouble();

            if (j == 'y' || j == 'Y') {
                employees.add(new OutsourcedEmployee(name, hours, hourlyRate));
            } else {
                employees.add(new Employee(name, hours, hourlyRate));
            }
        }

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - R$" + String.format("%.2f", employee.payment()));
        }

        System.out.println("| END |");
        scan.close();
    }
}
