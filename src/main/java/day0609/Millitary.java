package day0609;

import java.util.Scanner;

public class Millitary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please type your gender(1. male  2. female) : ");
        int gender = scanner.nextInt();

        if( gender == 1 ) {
            System.out.print("please type your age : ");
            int age = scanner.nextInt();
            if (age > 19) {
                System.out.print("please type your physical rating");
                int pr = scanner.nextInt();

                if(pr < 4) {
                    System.out.println("Congratulations!");
                }else {
                    System.out.println("RIP");
                }
            } else {
                System.out.println("children doesn't have any duty of national defence");
            }
        }else {
            System.out.println("male doesn't have any duty of national defence");
        }
    }
}
