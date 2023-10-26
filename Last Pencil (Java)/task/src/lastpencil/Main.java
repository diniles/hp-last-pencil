package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pencilsQty;
        String name;
        System.out.println("How many pencils would you like to use:");
        pencilsQty = scanner.nextInt();
        System.out.println("Who will be the first (John, Jack):");
        name = scanner.next();
        printPencils(pencilsQty);
        System.out.printf("%s is going first!", name);
    }

    private static void printPencils(int qty) {
        for (int i = 0; i < qty; i++) {
            System.out.print("|");
        }
        System.out.println();
    }
}
