package day0614;


import util.ScannerUtil;

import java.util.Scanner;

public class Ex09ScannerUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = ScannerUtil.nextLine(scanner, "이름을 입력해주세요.");
        System.out.println(name);

        int num = ScannerUtil.nextInt(scanner, "점수를 입력해주세요.");

        name = ScannerUtil.nextLine(scanner, "이름을 입력해주세요.");
        System.out.println(name);

        num = ScannerUtil.nextInt(scanner, "1~100 사이의 숫자를 입력해주세요", 1, 100);
        System.out.println(num);

        scanner.close();
    }
}

// 2차원 배열을 이용하여 로또 게임수 지정하고, 각 게임마다 자동 / 수동 입력받아서 출력
// 해당 게임 메소드화