package day0609;

// 사용자로부터 나이를 입력받아서
// 5세 이하 : 영아
// 13세 이하 : 어린이
// ~18세 이하 : 청소년
// 그외 : 성인

import java.util.Scanner;

public class Ex05AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please type your age");
        int age = scanner.nextInt();

        if ( age > 0 && age <= 5) {
            System.out.println("infant");
        }else if ( age > 5 && age <= 13) {
            System.out.println("child");
        }else if ( age > 13 && age <= 18) {
            System.out.println("teenager");
        }else if ( age > 18) {
            System.out.println("adult");
        }

        scanner.close();
    }
}
