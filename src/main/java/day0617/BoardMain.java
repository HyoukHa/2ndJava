package day0617;

import util.ScannerUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
    // 전역 변수
    private static int nextBoardId = 1;
    private static int nextReplyId = 1;
    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Board> boardArrayList = new ArrayList<>();
    private static ArrayList<Reply> replyArrayList = new ArrayList<>();
    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        System.out.println("프로그램을 실행합니다.");
        while(true) {
            String msg = "1.게시글 작성  2.게시글 목록  3.종료";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            if(userChoice == 1) {
                writeBoard();
            }else if(userChoice == 2) {
                printBoardList();
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    private static void writeBoard() {
        Board temp = new Board();
        temp.setId(nextBoardId++);

        String msg = "제목을 입력해주세요.";
        temp.setTitle(ScannerUtil.nextLine(scanner, msg));

        msg = "작성자를 입력해주세요.";
        temp.setWriter(ScannerUtil.nextLine(scanner, msg));

        msg = "내용을 입력해주세요.";
        temp.setContent(ScannerUtil.nextLine(scanner, msg));

        boardArrayList.add(temp);
    }

    private static void printBoardList() {
        if (!boardArrayList.isEmpty()) {
            for (Board b : boardArrayList) {
                System.out.printf("%d. %s", b.getId(), b.getTitle());
            }

            String msg = "조회하실 게시글 번호를 입력해주세요.(0: 뒤로가기)";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            while (userChoice != 0 && selectOne(userChoice) == null) {
                System.out.println("유효하지 않은 입력입니다.");
                userChoice = ScannerUtil.nextInt(scanner, msg);
            }

            if (userChoice != 0) {
                printBoardOne(userChoice);
            }

        } else {
            System.out.println("아직 작성된 글이 없습니다.");
        }
    }

    private static Board selectOne(int boardId) {
        Board temp = new Board(boardId);

        if(boardArrayList.contains(temp)) {
            return boardArrayList.get(boardArrayList.indexOf(temp));
        }

        return null;
    }

    private static void printBoardOne(int boardId) {
        Board temp = selectOne(boardId);

        temp.print();

        System.out.println("-----------------------------------");
        System.out.println("\t\t댓글");
        System.out.println("-----------------------------------");
        for(Reply r : replyArrayList) {
            if(r.getBoardId() == boardId) {
                r.print();
            }
        }
        System.out.println("-----------------------------------");

        String msg = "1.수정  2.삭제  3.댓글달기  4.뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, msg);

        if(userChoice == 1) {
            update(boardId);
        }else if(userChoice == 2) {
            delete(boardId);
        }else if(userChoice == 3) {
            writeReply(boardId);
        }else if(userChoice == 4) {
            printBoardList();
        }
    }

    private static void update(int boardId) {
        Board temp = new Board();
        Board original = selectOne(boardId);

        System.out.println("기존 제목: " + original.getTitle());
        String msg = "새로운 제목을 입력해주세요.";
        temp.setTitle(ScannerUtil.nextLine(scanner, msg));

        System.out.println("-----------------------------------");

        System.out.println("기존 내용: " + original.getContent());
        msg = "새로운 내용을 입력해주세요.";
        temp.setContent(ScannerUtil.nextLine(scanner, msg));

        msg = "정말로 수정하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, msg);

        if(yesNo.equalsIgnoreCase("Y")) {
            original.setTitle(temp.getTitle());
            original.setContent(temp.getContent());
        }

        printBoardOne(boardId);
    }

    private static void delete(int boardId) {
        String msg = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, msg);

        if(yesNo.equalsIgnoreCase("Y")) {
            boardArrayList.remove(new Board(boardId));
            printBoardList();
//            boardArrayList.remove(boardArrayList.get(boardId));
        }else {
            printBoardOne(boardId);
        }
    }

    private static void writeReply(int boardId) {
        Reply temp = new Reply();
        temp.setBoardId(boardId);
        temp.setId(nextReplyId++);

        String msg = "댓글을 입력해주세요.";
        temp.setComment(ScannerUtil.nextLine(scanner, msg));

        replyArrayList.add(temp);

        printBoardOne(boardId);
    }
}
































