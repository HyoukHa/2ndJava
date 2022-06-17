package homework;

import java.util.ArrayList;

import struct.Board;
import util.ScannerUtil;
import java.util.Scanner;

public class HomeworkBoard {
    private static Scanner scanner;
    private static ArrayList<Board> list;
    private static int nextId;


    public static void main(String[] args) {
        init();
        showMenu();
        scanner.close();
    }

    private static void init() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        nextId = 1;
    }

    private static void showMenu() {
        System.out.println("프로그램을 실행합니다.");
        while(true) {
            String msg = "1.게시글 작성  2.게시글 목록 보기  3.종료";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            if(userChoice == 1) {
                insert();
            }else if(userChoice == 2) {
                showBoardList();
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    private static void insert() {
        String msg = "제목을 입력해주세요.";
        String title = ScannerUtil.nextLine(scanner, msg);

        msg = "작성자를 입력해주세요.";
        String writer = ScannerUtil.nextLine(scanner, msg);

        msg = "내용을 입력해주세요.";
        String content = ScannerUtil.nextLine(scanner, msg);

        list.add(new Board(nextId++, title, writer, content));
    }

    private static void showBoardList() {
        if(!list.isEmpty()) {
            System.out.println("====================================");
            System.out.println("             게시글 목록               ");
            for(Board temp : list) {
                temp.showList();
            }
            System.out.println("====================================");

            String msg = "내용을 보실 게시글의 번호를 입력해주세요.(0은 뒤로가기)";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            Board b = new Board(userChoice, "", "", "");

            while(userChoice != 0 && !list.contains(b)) {
                msg = "잘못된 입력입니다.\n내용을 보실 게시글의 번호를 입력해주세요.(0은 뒤로가기)";
                userChoice = ScannerUtil.nextInt(scanner, msg);
                b.setId(userChoice);
            }

            if(userChoice != 0) {
                showBoardDetail(userChoice);
            }
        }else {
            System.out.println("아직 게시판이 비어있어요!");
        }
    }

    private static void showBoardDetail(int id) {
        Board temp = createBoard(id);
        System.out.println(list.get(list.indexOf(temp)));

        String msg = "1.게시글 수정  2.게시글 삭제  3.게시글 목록 보기";
        int userChoice = ScannerUtil.nextInt(scanner, msg);

        if(userChoice == 1) {
            boardUpdate(id);
        }else if(userChoice == 2) {
            boardDelete(id);
        }else if(userChoice == 3){
            showBoardList();
        }
    }

    private static Board createBoard(int id) {
        Board temp = new Board(id, "", "", "");
        return temp;
    }

    private static void boardUpdate(int id) {
        Board b = createBoard(id);
        int index = list.indexOf(b);

        String msg = "제목을 입력해주세요.";
        String title = ScannerUtil.nextLine(scanner, msg);

        msg = "작성자를 입력해주세요.";
        String writer = ScannerUtil.nextLine(scanner, msg);

        msg = "내용을 입력해주세요.";
        String content = ScannerUtil.nextLine(scanner, msg);

        Board temp = new Board(id, title, writer, content);

        list.set(index, temp);

        showBoardDetail(id);
    }

    private static void boardDelete(int id) {
        Board b = createBoard(id);
        Board temp = list.get(list.indexOf(b));

        list.remove(temp);
        showBoardList();
    }
}