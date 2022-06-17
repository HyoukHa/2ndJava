package day0616;

// 5명의 학생을 Student2 객체로 관리하는 프로그램
// 메뉴 출력, 학생 입력, 학생 출력은 static 메소드로 분리하여 만드시오
// 단, 학생 출력의 경우 목록보기, 개별보기 등의 기능은 필요하지 않습니다.

import util.ScannerUtil;

import java.util.Scanner;

public class GradeBook01 {
    public static Scanner scanner;
    public static Student2[] arr;
    public static int currentIndex;

    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MAX = 100;
    public static final int SCORE_MIN = 0;

    public static void main(String[] args) {
        init();
        showMenu();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        arr = new Student2[5];
        currentIndex = 0;
    }

    public static void showMenu() {
        System.out.println("프로그램을 실행합니다.");
        while(true) {
            String msg = "1.학생정보 입력  2.학생정보 출력  3.종료";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            if(userChoice == 1) {
                insert();
            }else if(userChoice == 2) {
                printAll();
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }
    }

    public static void insert() {
        String msg = "번호를 입력해주세요.";
        int id = ScannerUtil.nextInt(scanner, msg);

        msg = "이름을 입력해주세요.";
        String name = ScannerUtil.nextLine(scanner, msg);

        msg = "국어 성적을 입력해주세요.";
        int kor = ScannerUtil.nextInt(scanner, msg);

        msg = "영어 성적을 입력해주세요.";
        int eng = ScannerUtil.nextInt(scanner, msg);

        msg = "수학 성적을 입력해주세요.";
        int math = ScannerUtil.nextInt(scanner, msg);

        arr[currentIndex] = new Student2(id, name, kor, eng, math);

        currentIndex++;
    }

    public static void printAll() {
        if(currentIndex != 0) {
            System.out.println("==================================");
            for(int i = 0 ; i < currentIndex ; i++) {
                Student2 temp = arr[i];
                temp.printInfo();
                if(i != currentIndex - 1) {
                    System.out.println("-----------------------------------");
                }
            }
            System.out.println("==================================");

            String msg = "";

        }else {
            System.out.println("아직 입력된 학생정보가 존재하지 않습니다.");
        }

    }
}








































