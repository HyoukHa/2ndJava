package day0613;

// 다섯명의 학생의 성적을 관리하는 프로그램을 작성하시오.
// 단, 해당 프로그램은 입력과 출력이 분리되어있고,
// 만약 다섯명을 초과하여 입력하려고 할 경우 경고메시지만 출력되고
// 한명도 입력하지않고 출력을 한다면 경고메시지가 출력되게
// 코드를 작성하시오.

import java.util.Scanner;

public class Ex05GradeBook03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int ARRAY_SIZE = 5;
        final int SUBJECT_SIZE = 3;
        final int SCORE_MIN = 0;
        final int SCORE_MAX = 100;

        int[] ids = new int[ARRAY_SIZE];
        String[] names = new String[ARRAY_SIZE];
        int[] kors = new int[ARRAY_SIZE];
        int[] engs = new int[ARRAY_SIZE];
        int[] maths = new int[ARRAY_SIZE];

        int steps = 0;

        while(true) {
            System.out.println("1.학생 정보 입력  2.학생 정보 출력  3.프로그램 종료  4.학생정보 찾기");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if(userChoice == 1) {
                if(steps == 5) {
                    System.out.println("더 이상 학생정보를 입력할 수 없습니다.");
                    continue;
                }

                while(true){
                    boolean switcher = true;
                    System.out.println("학생의 학번을 입력해주세요.");
                    System.out.print("> ");
                    ids[steps] = scanner.nextInt();

                    for(int i = 0 ; i < steps ; i++) {
                        if(ids[steps] == ids[i]) {
                            System.out.println("이미 존재하는 학생 번호입니다.");
                            switcher = false;
                        }
                    }

                    if(switcher) {
                        break;
                    }
                }


                System.out.println("학생의 이름을 입력해주세요.");
                System.out.print("> ");
                scanner.nextLine();
                names[steps] = scanner.nextLine();

                System.out.println("학생의 국어 점수를 입력해주세요.");
                System.out.print("> ");
                kors[steps] = scanner.nextInt();

                System.out.println("학생의 영어 점수를 입력해주세요.");
                System.out.print("> ");
                engs[steps] = scanner.nextInt();

                System.out.println("학생의 수학 성적을 입력해주세요.");
                System.out.print("> ");
                maths[steps] = scanner.nextInt();

                steps++;
            } else if (userChoice == 2) {
                if(steps == 0) {
                    System.out.println("아직 입력된 학생의 정보가 없습니다.");
                    System.out.println("입력 후 다시 이용해주세요.");
                    continue;
                }
                System.out.println("---------------------");
                for (int i = 0; i < steps; i++) {
                    System.out.printf("%d 번째 학생 정보 :\n", i);
                    System.out.println("학생 번호 : " + ids[i]);
                    System.out.println("학생 이름 : " + names[i]);
                    System.out.println("국어 성적 : " + kors[i]);
                    System.out.println("영어 성적 : " + engs[i]);
                    System.out.println("수학 성적 : " + maths[i]);
                    System.out.println("---------------------");
                }
            }else if(userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }else if(userChoice == 4) {
                System.out.println("찾고싶은 학생의 번호를 입력해주세요.");
                System.out.print("> ");
                int findNum = scanner.nextInt();
                int findIdx = -1;
                for (int i = 0; i < steps; i++) {
                    if(findNum == ids[i]) {
                        findIdx = i;
                    }
                }

                if(findIdx == -1) {
                    System.out.println("해당하는 번호의 학생이 존재하지 않습니다.");
                }else {
                    System.out.println("찾고자 하는 학생의 정보입니다.");
                    System.out.println("---------------------");
                    System.out.println("학생 번호 : " + ids[findIdx]);
                    System.out.println("학생 이름 : " + names[findIdx]);
                    System.out.println("국어 성적 : " + kors[findIdx]);
                    System.out.println("영어 성적 : " + engs[findIdx]);
                    System.out.println("수학 성적 : " + maths[findIdx]);
                    System.out.println("---------------------");
                }


            }
        }
    }
}
