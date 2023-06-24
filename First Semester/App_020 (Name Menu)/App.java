import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ArrayList<String> nameList = new ArrayList<String>();

        boolean x = true;
        while (x) {
            int selection = menu();
            switch (selection) {
                case 1:
                    while (true) {
                        System.out.println("Student registry:");
                        System.out.println("************************");
                        System.out.println("Insert Amount of Names:");
                        int amount = scan.nextInt();
                        for (int j = 0; j < amount; j++) {
                            System.out.println("Insert Name " + (j + 1) + ":");
                            String name = scan.next();
                            nameList.add(name);
                        }
                        if (!cont()) {
                            break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        removeName(nameList);
                        if (!cont()) {
                            break;
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        System.out.println("List of Names:");
                        for (String s : nameList) {
                            System.out.println(s);
                        }
                        if (!cont()) {
                            break;
                        }
                    }
                    break;
                case 4:
                    x = false;
                    break;
                default:
                    System.out.println("!! Invalid Input !!");
            }
        }
    }

    public static void clearDuplicates(ArrayList<String> list) {
        HashSet<String> uniqueNames = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueNames);
    }

    public static int menu() {
        int selection;

        System.out.println("************************");
        System.out.println("   SELECT AN OPTION:");
        System.out.println("************************");
        System.out.println("[1] Add Name");
        System.out.println("[2] Remove Name");
        System.out.println("[3] List Names");
        System.out.println("[4] Exit");
        System.out.println("************************");
        selection = scan.nextInt();

        return selection;
    }

    public static boolean cont() {
        int x;

        System.out.println("Do you wish to continue?");
        System.out.println("(Press [1] to Confirm, [2] to Exit.)");
        x = scan.nextInt();

        return (x != 1);
    }

    public static void removeName(ArrayList<String> list) {
        System.out.println("Name Removal:");
        System.out.println("************************");
        System.out.println("Insert name to remove:");
        String name = scan.next();
        list.remove(name);
    }
}
