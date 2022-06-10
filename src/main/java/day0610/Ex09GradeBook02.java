package day0610;

// 학생의 정보를 입력받고 출력하는 프로그램을 작성하시오.
// 해당 프로그램은 다음과 같은 기능이 있습니다.
// 입력: 학생의 정보를 입력받는다.
// 출력: 가장 마지막으로 입력된 학생의 정보를 출력한다.
// 종료: 사용자가 종료를 선택하면 프로그램이 종료되지만
// 그 외에는 실행시킬 기능을 입력받아 해당 기능을 실행한다.

// 심화: 만약 아무런 입력 없이 출력을 선택할 경우
// "아직 정보가 입력된 학생이 존재하지 않습니다"가 출력되게
// 코드를 작성해 보시오.

// 3시50분까지

import java.util.Scanner;

public class Ex09GradeBook02 {
    public static void main(String[] args) {
        final int SCORE_MAX = 100;
        final int SCORE_MIN = 0;
        final int SUBJECT_SIZE = 3;

        int id = -1, kor = 0, eng = 0, math = 0, total = 0;
        double avg = 0.0;
        String name = "";

        Scanner scanner = new Scanner(System.in);

        while(true) {


            System.out.println("1. 입력 2. 출력 3. 종료");
            System.out.print("> ");
            int choice = scanner.nextInt();

            if(choice == 1) {

                while(true) {
                    System.out.println("번호를 입력해주세요");
                    System.out.print("> ");
                    id = scanner.nextInt();
                    if(id >= 0) {
                        break;
                    }
                }

                System.out.println("이름을 입력해주세요");
                System.out.print("> ");
                scanner.nextLine();
                name = scanner.nextLine();

                while(true) {
                    System.out.println("국어 점수를 입력해주세요");
                    System.out.print("> ");
                    kor = scanner.nextInt();

                    if (kor >= SCORE_MIN && kor <= SCORE_MAX) {
                        break;
                    }
                }

                while(true) {
                    System.out.println("영어 점수를 입력해주세요");
                    System.out.print("> ");

                    eng = scanner.nextInt();
                    if (eng >= SCORE_MIN && eng <= SCORE_MAX) {
                        break;
                    }
                }

                while(true) {
                    System.out.println("수학 점수를 입력해주세요");
                    System.out.print("> ");
                    math = scanner.nextInt();

                    if(math >= SCORE_MIN && math <= SCORE_MAX) {
                        break;
                    }
                }

                total = kor + eng + math;
                avg = total / (double)SUBJECT_SIZE;
            } else if(choice == 2) {
                if(id != -1) {
                    System.out.printf("번호 : %d, 이름 : %s\n", id, name);
                    System.out.printf("국어 : %03d 점, 영어 : %03d 점, 수학 : %03d 점\n", kor, eng, math);
                    System.out.printf("총점 : %03d 점, 평균 : %06.2f 점\n", total, avg);
                }else {
                    System.out.println("아직 정보가 입력된 학생이 없습니다.");
                }

            } else if(choice == 3) {
                break;
            }

        }
        scanner.close();
    }
}
