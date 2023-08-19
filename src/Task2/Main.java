package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите переменную a: ");
            int a = scanner.nextInt();
            System.out.print("Введите переменную b: ");
            int b = scanner.nextInt();
            castling(a, b);
        }
    }


    public static void castling(int a, int b) {

        //XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
