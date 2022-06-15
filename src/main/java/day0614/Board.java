package day0614;

// 게시판 프로그램
// 게시글에는 글 번호, 글 제목, 글 내용, 글 작성자 정보가 들어가야 한다.
// 지금까지 배운것들을 활용해서 자유롭게 풀되,
// 글 번호 자동배정은 주어진 코드를 이용한다.

import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Board {
    static String[] titleArray;
    static String[] contentArray;
    static String[] writerArray;
    static int[] idArray;
    static int nextId;
    static Scanner scanner;

    // 1. 메인 메소드
    public static void main(String[] args) {
        // 전역 변수 초기화
        titleArray = new String[0];
        contentArray = new String[0];
        writerArray = new String[0];
        idArray = new int[0];
        nextId = 1;
        scanner = new Scanner(System.in);

        printMenu();

        scanner.close();
    }

    // 2. 메뉴 출력 메소드
    public static void printMenu() {
        while(true) {
            String message = "1. 새글 작성  2. 글보기  3. 종료";
            int userChoice = ScannerUtil.nextInt(scanner, message);

            if(userChoice == 1) {
                writeBoard();
            }else if(userChoice == 2) {
                printBoard();
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    // 3. 글 작성 메소드
    public static void writeBoard() {
        String message;

        // 글 번호 지정
        int id = nextId++;

        // 글 제목 입력
        message = "제목을 입력해주세요.";
        String title = ScannerUtil.nextLine(scanner, message);

        // 글 작성자 입력
        message = "작성자를 입력해주세요.";
        String writer = ScannerUtil.nextLine(scanner, message);

        // 글 내용 입력
        message = "내용을 입력해주세요";
        String content = ScannerUtil.nextLine(scanner, message);

        // 각 내용을 배열에 추가
        idArray = ArrayUtil.add(idArray, id);
        titleArray = ArrayUtil.add(titleArray, title);
        writerArray = ArrayUtil.add(writerArray, writer);
        contentArray = ArrayUtil.add(contentArray, content);
    }

    // 4. 글 출력 메소드
    public static void printBoard() {
        if(ArrayUtil.isEmpty(idArray)){
            System.out.println("\n----------------------");
            System.out.println("아직 작성된 글이 없습니다.");
            System.out.println("----------------------\n");
        }else {
            for(int i = 0 ; i < ArrayUtil.size(idArray) ; i++) {
                System.out.println("\n====================================================");
                System.out.println("글 번호 : " + ArrayUtil.get(idArray, i));
                System.out.println("제목 : " + ArrayUtil.get(titleArray, i));
                System.out.println("작성자 : " + ArrayUtil.get(writerArray, i));
                System.out.println("-----------------------------------------------------");
                System.out.println("내용");
                System.out.println("-----------------------------------------------------");
                System.out.println(ArrayUtil.get(contentArray, i));
                System.out.println("====================================================\n");
            }
        }

    }
}
