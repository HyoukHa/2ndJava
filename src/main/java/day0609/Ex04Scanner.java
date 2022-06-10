package day0609;

import java.util.Scanner;

public class Ex04Scanner {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("please input any int type number");
        System.out.print("> ");
        int number = scanner.nextInt();

        System.out.println("int type number : " + number);

        System.out.println("please input any double type number");
        System.out.print("> ");
        double d = scanner.nextDouble();

        System.out.println("double type number : " + d);

        System.out.println("please input ur name");
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.printf("useName : [%s]", name);


        scanner.close();
    }

}
