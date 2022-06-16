package day0615;

// Student 데이터타입의 배열을 사용하여
// 다섯명의 학생을 관리하는 프로그램을 작성하시오
// 동적할당 X

// 심화 : ArrayUtil에 Student타입 배열을 동적할당하는 메소드 구현

import struct.Student;
import util.ArrayUtil;
import util.ScannerUtil;

import java.util.Scanner;

public class Ex02GradeBook01 {
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;
    public static final int SUBJECT_SIZE = 3;
    public static int nextId;
    public static Student[] studentList;

    static Scanner scanner;
    static String msg;


    public static void main(String[] args) {
        init();

        System.out.println("학생 관리 프로그램을 실행합니다.");
        while(true) {
            msg = "원하시는 메뉴를 선택해주세요.\n1.학생 정보 입력  2.학생 정보 출력  3.학생 정보 찾기  4.프로그램 종료";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            if(userChoice == 1) {
                studentList = ArrayUtil.add(studentList, createStudentInfo());
            }else if(userChoice == 2) {
                printStudent(studentList);
            }else if(userChoice == 3) {
                System.out.println("서비스 준비중입니다.");
            }else if(userChoice == 4) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("존재하지 않는 메뉴입니다.");
            }
        }

        scanner.close();
    }

    public static void init() {
        nextId = 1;
        scanner = new Scanner(System.in);
        studentList = new Student[0];
    }

    public static Student createStudentInfo() {
        Student s1 = new Student();

        msg = "학번을 입력해주세요.";
        int studentNum = ScannerUtil.nextInt(scanner, msg);
        s1.id = studentNum;

        msg = "이름을 입력해주세요.";
        String studentName = ScannerUtil.nextLine(scanner, msg);
        s1.name = studentName;

        msg = "국어 성적을 입력해주세요.";
        int studentKor = ScannerUtil.nextInt(scanner, msg, SCORE_MIN, SCORE_MAX);
        s1.kor = studentKor;

        msg = "영어 성적을 입력해주세요";
        int studentEng = ScannerUtil.nextInt(scanner, msg, SCORE_MIN, SCORE_MAX);
        s1.eng = studentEng;

        msg = "수학 점수를 입력해주세요.";
        int studentMath = ScannerUtil.nextInt(scanner, msg, SCORE_MIN, SCORE_MAX);
        s1.math = studentMath;

        return s1;
    }

    public static void printStudent(Student[] arr) {
        if(ArrayUtil.size(arr) != 0) {
            System.out.println("====================================");
            System.out.println("학생 리스트");
//            for(int i = 0 ; i < ArrayUtil.size(arr) ; i++) {
//                // 이런식으로 사용도 가능!
//                // Student s = arr[i];
//
//                int sum = arr[i].kor + arr[i].eng + arr[i].math;
//                double avg = (double)sum/SUBJECT_SIZE;
//                System.out.println("------------------------------------");
//                System.out.printf("학변 : %d 이름 : %s\n", arr[i].id, arr[i].name);
//                System.out.printf("국어 : %03d 점 영어 : %03d 점 수학 : %03d 점\n", arr[i].kor, arr[i].eng, arr[i].math);
//                System.out.printf("총점 : %03d 점 평균 : %06.2f 점\n", sum, avg);
//            }

            for(Student s : arr) {
                int sum = s.kor + s.eng + s.math;
                double avg = (double)sum/SUBJECT_SIZE;
                System.out.println("------------------------------------");
                System.out.printf("학변 : %d 이름 : %s\n", s.id, s.name);
                System.out.printf("국어 : %03d 점 영어 : %03d 점 수학 : %03d 점\n", s.kor, s.eng, s.math);
                System.out.printf("총점 : %03d 점 평균 : %06.2f 점\n", sum, avg);
            }
            System.out.println("====================================");


        }else {
            System.out.println("아직 입력된 학생정보가 없습니다.");
        }
    }
}
