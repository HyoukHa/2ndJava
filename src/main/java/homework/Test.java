package homework;

// 출력하기를
// 목록 간단하게 출력하기 -> 개별 학생 상세보기 -> 수정/삭제
// 로 업그레이드한 학생 정보 관리 프로그램


import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;
import struct.Student;

public class Test {
    // 전역 상수 선언부
    public static final int SUBJECT_SIZE = 3;
    public static final int SCORE_MIN = 0;
    public static final int SCORE_MAX = 100;

    // 전역 변수 선언부
    public static Scanner scanner;
    public static Student[] arr;
    public static int nextId;

    // main 실행 메소드
    public static void main(String[] args) {
        init();

        showMenu();
    }

    // 전역 변수를 초기화하는 init() 메소드
    public static void init(){
        scanner = new Scanner(System.in);
        arr = new Student[0];
        nextId = 1;
    }

    // showMenu()
    public static void showMenu() {
        System.out.println("학생관리 프로그램을 실행합니다.");
        while(true) {
            String msg = "1.학생 정보 입력  2.학생 정보 출력  3.종료";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            if(userChoice == 1) {
                insert();
            }else if(userChoice == 2) {
                printAll();
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("존재하지 않는 메뉴입니다.");
            }
        }
    }

    // insert()
    public static void insert() {
        Student temp = new Student();

        temp.id = nextId++;

        String msg = "학생의 이름을 입력해주세요";
        temp.name = ScannerUtil.nextLine(scanner, msg);

        msg = "학생의 국어 점수를 입력해주세요";
        temp.kor = ScannerUtil.nextInt(scanner, msg);

        msg = "학생의 영어 점수를 입력해주세요";
        temp.eng = ScannerUtil.nextInt(scanner, msg);

        msg = "학생의 수학 점수를 입력해주세요";
        temp.math = ScannerUtil.nextInt(scanner, msg);

        arr = ArrayUtil.add(arr, temp);
    }

    // printAll()
    public static void printAll() {
        if(!ArrayUtil.isEmpty(arr)){

            for(Student s : arr) {
                System.out.printf("%d. %s\n", s.id, s.name);
            }

            String msg = "상세정보를 확인할 학생의 번호를 입력해주세요.(0 : 뒤로가기)";
            int userChoice = ScannerUtil.nextInt(scanner, msg);

            Student temp = new Student();
            temp.id = userChoice;

            while(userChoice != 0 && !ArrayUtil.contains(arr, temp)) {
                msg = "잘못된 입력입니다.";
                userChoice = ScannerUtil.nextInt(scanner, msg);
                temp.id = userChoice;
            }

            if(userChoice != 0) {
                printOne(userChoice);
            }
        } else {
            System.out.println("입력된 학생 정보가 없습니다.");
        }
    }

    // printOne()
    public static void printOne(int id) {
        Student temp = selectOne(id);

        int sum = temp.kor + temp.eng + temp.math;
        double avg = (double)sum/SUBJECT_SIZE;

        System.out.println("-------------------------------");
        System.out.printf("학번 : %d  이름 : %s\n", temp.id, temp.name);
        System.out.printf("국어 : %03d 점  영어 : %03d 점  수학 : %03d 점\n", temp.kor, temp.eng, temp.math);
        System.out.printf("총점 : %03d 점  평균 : %06.2f 점\n", sum, avg);

        String msg = "1.수정  2.삭제  3.뒤로가기";
        int userChoice = ScannerUtil.nextInt(scanner, msg);

        if(userChoice == 1) {
            update(id);
        }else if(userChoice == 2) {
            delete(id);
        }else if(userChoice == 3) {

        }else {
            System.out.println("존재하지 않는 메뉴입니다.");
        }
    }

    // selectOne()
    public static Student selectOne(int id) {
        Student result = null;

        Student temp = new Student();
        temp.id = id;
        if(ArrayUtil.contains(arr, temp)) {
            result = ArrayUtil.get(arr, ArrayUtil.indexOf(arr, temp));
        }

        return result;
    }

    // update()
    public static void update(int id) {
        Student temp = selectOne(id);

        String msg = "새로운 이름을 입력해주세요.";
        temp.name = ScannerUtil.nextLine(scanner, msg);

        msg = "새로운 국어 점수를 입력해주세요";
        temp.kor = ScannerUtil.nextInt(scanner, msg);

        msg = "새로운 영어 점수를 입력해주세요";
        temp.eng = ScannerUtil.nextInt(scanner, msg);

        msg = "새로운 수학 점수를 입력해주세요";
        temp.math = ScannerUtil.nextInt(scanner, msg);

        printOne(id);
    }

    // delete()
    public static void delete(int id) {
        Student temp = new Student();
        temp.id = id;

        String msg = "정말로 삭제하시겠습니까? Y/N";
        String yesNo = ScannerUtil.nextLine(scanner, msg);

        if(yesNo.equalsIgnoreCase("y")){
            arr = ArrayUtil.remove(arr, temp);
            printAll();
        }else {
            printOne(id);
        }
    }
}


























