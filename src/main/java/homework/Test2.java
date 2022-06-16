package homework;

import java.util.Scanner;
import struct.Student;
import util.ArrayUtil;
import util.ScannerUtil;

public class Test2 {
    public static int nextId;
    public static Student[] arr;
    public static Scanner scanner;

    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        init();
        showMenu();
    }

    public static void init() {
        scanner = new Scanner(System.in);
        arr = new Student[0];
        nextId = 1;
    }

    public static void showMenu() {
        System.out.println("학생관리 프로그램을 실행합니다.");
        while(true) {
            String msg = "1.학생정보 입력  2.학생정보 출력  3.종료";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            if(userChoice == 1) {
                inputStudentData();
            }else if(userChoice == 2) {
                printAllStudentData();
            }else if(userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("존재하지 않는 메뉴입니다.");
            }
        }
    }

    public static void inputStudentData() {
        Student temp = new Student();

        temp.id = nextId++;

        String msg = "학생의 이름을 입력해주세요.";
        temp.name = ScannerUtil.nextLine(scanner, msg);

        msg = "국어 점수를 입력해주세요.";
        temp.kor = ScannerUtil.nextInt(scanner, msg);

        msg = "영어 점수를 입력해주세요.";
        temp.eng = ScannerUtil.nextInt(scanner, msg);

        msg = "수학 점수를 입력해주세요.";
        temp.math = ScannerUtil.nextInt(scanner, msg);

        arr = ArrayUtil.add(arr, temp);
    }

    public static void printAllStudentData() {

        if(!ArrayUtil.isEmpty(arr)){
            System.out.println("==================================");
            for(Student temp : arr) {
                System.out.printf("%d. %s\n", temp.id, temp.name);
            }
            System.out.println("==================================");

            Student temp = new Student();

            String msg = "상세보기할 학생의 번호를 입력해주세요.(0은 뒤로가기)";
            int userChoice = ScannerUtil.nextInt(scanner, msg);
            temp.id = userChoice;

            while(userChoice != 0 && !ArrayUtil.contains(arr, temp)) {
                msg = "유효하지않은 숫자입니다. 다시 입력해주세요.";
                userChoice = ScannerUtil.nextInt(scanner, msg);
                temp.id = userChoice;
            }

            if(ArrayUtil.contains(arr, temp)) {
                printSpecificStudent(userChoice);
            }
        }else {
            System.out.println("아직 입력된 학생정보가 없습니다.");
        }
    }

    public static void printSpecificStudent(int id) {
        Student s = new Student();

        s.id = id;

        Student temp = ArrayUtil.get(arr, ArrayUtil.indexOf(arr, s));

        printDetail(temp);

        String msg = "1.수정  2.삭제  3.뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, msg);

        if(userChoice == 1) {
            updateStudent(id);
        }else if(userChoice == 2) {

        }else if(userChoice == 3) {
            printAllStudentData();
        }
    }

    public static void printDetail(Student s) {
        int sum = s.kor + s.eng + s.math;
        double avg = (double)sum/SUBJECT_SIZE;
        System.out.println("=====================================");
        System.out.printf("학번: %d  이름: %s", s.id, s.name);
        System.out.printf("국어: %03d점  영어: %03d점  수학: %03d점", s.kor, s.eng, s.math);
        System.out.printf("총점: %03d점  평균: %06.2f점", sum, avg);
        System.out.println("=====================================");

    }

    public static void updateStudent(int id) {
        Student s = new Student();

        s.id = id;

        Student temp = ArrayUtil.get(arr, ArrayUtil.indexOf(arr, s));

        String msg = "학생의 이름을 입력해주세요.";
        temp.name = ScannerUtil.nextLine(scanner, msg);

        msg = "국어 점수를 입력해주세요.";
        temp.kor = ScannerUtil.nextInt(scanner, msg);

        msg = "영어 점수를 입력해주세요.";
        temp.eng = ScannerUtil.nextInt(scanner, msg);

        msg = "수학 점수를 입력해주세요.";
        temp.math = ScannerUtil.nextInt(scanner, msg);
    }


//    public static Student selectStudent(int id) {
//        Student
//    }
}





























