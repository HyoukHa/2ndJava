package homework;

// Rock Scissor Paper
// 컴퓨터를 상대로 하는 가위 바위 보 게임을 만들어보시오.
// 단 플에이와 현재 기록보기 기능이 분리되어있으며
// 플레이 시에는
// 1: 가위, 2: 바위, 3: 보 가 입력되어서
// 승리, 패배, 무승부가 기록됩니다.
// 현재 기록을 출력하게되면
// 총 ###전 ###승 ###무 ###패(승률: ##.##%)
//

import java.util.Scanner;
import java.util.Random;

public class Homework01RSP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userStep = 0;
        int win = 0, draw = 0, lose = 0;
        int userChoice;
        int comChoice;

        while(true) {
            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 플레이, 2. 전적 보기, 3. 종료");
            System.out.print("> ");
            userStep = scanner.nextInt();

            if(userStep == 1) {
                comChoice = random.nextInt(3);
                System.out.println("1. 가위, 2. 바위, 3. 보");
                System.out.print("> ");
                userChoice = scanner.nextInt();

                if(userChoice == 1) {
                    System.out.println("사용자 : 가위");
                }else if(userChoice == 2) {
                    System.out.println("사용자 : 바위");
                }else if(userChoice == 3) {
                    System.out.println("사용자 : 보");
                }else {
                    System.out.println("올바른 선택을 해주세요");
                    continue;
                }

                if(comChoice == 1) {
                    System.out.println("컴퓨터 : 가위");
                }else if(comChoice == 2) {
                    System.out.println("컴퓨터 : 바위");
                }else if(comChoice == 3) {
                    System.out.println("컴퓨터 : 보");
                }

                if(userChoice == comChoice) {
                    System.out.println("비겼습니다.");
                    draw++;
                }else if(
                    userChoice == 1 && comChoice == 2 ||
                    userChoice == 2 && comChoice == 3 ||
                    userChoice == 3 && comChoice == 1
                ) {
                    System.out.println("패배하였습니다.");
                    lose++;
                }else {
                    System.out.println("승리하였습니다.");
                    win++;
                }
            }else if(userStep == 2) {
                int total = win + draw + lose;
                double winRate = (double)win / total * 100;
                System.out.printf("총 %d전 %d승 %d무 %d패(승률: %5.2f%%)", total, win, draw, lose, winRate);
            }else if(userStep == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }
}
