package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in the number of products to register:");
        int productTotal = sc.nextInt();
        List<Product> products = new ArrayList<>();

        for (int x = 0; x < productTotal; x++) {
            System.out.println("Registering product #" + (x + 1));
            System.out.print("| Common [ c ] / Used [ u ] / Imported [ i ] |");
            char type = sc.next().charAt(0);
            sc.nextLine();

            Product product;
            switch (type) {
                case 'c':
                    product = createCommonProduct(sc);
                    break;

                case 'u':
                    product = createUsedProduct(sc);
                    break;

                case 'i':
                    product = createImportedProduct(sc);
                    break;

                default:
                    System.out.println("Invalid type. Skipping product registration.");
                    continue;
            }

            products.add(product);
        }

        sc.close();

        for (Product product : products) {
            System.out.println(product.getLabel());
        }
    }

    public static Product createCommonProduct(Scanner sc) {
        System.out.print("Product name:");
        String name = sc.nextLine();
        System.out.print("Product price:");
        double price = sc.nextDouble();
        sc.nextLine();
        return new Product(name, price);
    }

    public static Product createUsedProduct(Scanner sc) {
        Product commonProduct = createCommonProduct(sc);
        return new UsedProduct(commonProduct.getName(), commonProduct.getPrice());
    }

    public static Product createImportedProduct(Scanner sc) {
        Product commonProduct = createCommonProduct(sc);
        System.out.print("Product tax:");
        double tax = sc.nextDouble();
        sc.nextLine();
        return new ImportedProduct(commonProduct.getName(), commonProduct.getPrice(), tax);
    }
}
