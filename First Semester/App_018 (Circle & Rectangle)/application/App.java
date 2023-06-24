package application;

import entities.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many of these two shapes do you want? (Circle / Rectangle): ");
        int count = scanner.nextInt();
        System.out.println("Okay, " + count + " then.");

        for (int i = 0; i < count; i++) {
            System.out.println("Shape " + (i + 1));
            System.out.print("Enter shape type (C for Circle / R for Rectangle): ");
            String shapeType = scanner.next();

            if (shapeType.equalsIgnoreCase("C")) {
                System.out.print("Enter circle radius: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(Color.BLACK, radius);
                System.out.println("Area: " + circle.area());
            } else if (shapeType.equalsIgnoreCase("R")) {
                System.out.print("Enter rectangle height: ");
                double height = scanner.nextDouble();
                System.out.print("Enter rectangle length: ");
                double length = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(Color.BLACK, height, length);
                System.out.println("Area: " + rectangle.area());
            } else {
                System.out.println("Invalid shape type. Skipping shape.");
            }
        }

        scanner.close();
    }
}
