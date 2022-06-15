package util;

// 1. 스캐너 버그를 미리 해결한 nextLine() 메소드

import java.util.Scanner;

public class ScannerUtil {
    public static void printMessage(String message) {
        System.out.println(message);
        System.out.print("> ");
    }
    public static String nextLine(Scanner scanner, String message) {
        printMessage(message);
        String temp = scanner.nextLine();
        // String 변수 / 상수 혹은 값의 경우
        // isEmpty() 메소드를 실행시키면
        // 아무런 값도 들어있지 않다면 true, 아니면 false 를 리턴시켜준다.

        if(temp.isEmpty()) {
            temp = scanner.nextLine();
        }

        return temp;
    }

    public static int nextInt(Scanner scanner, String message) {
        printMessage(message);
        int temp = scanner.nextInt();

        return temp;
    }

    // 3. 특정 범위안의 int를 리턴하는 nextInt()
    public static int nextInt(Scanner scanner, String message, int min, int max) {
        int temp = nextInt(scanner, message);
        while(temp < min || temp > max) {
            System.out.println("잘못입력하셨습니다.");
            nextInt(scanner, message);
        }
        return temp;
    }


}
