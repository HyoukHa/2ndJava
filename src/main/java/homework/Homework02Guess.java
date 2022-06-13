package homework;

// 숫자 맞추기 게임(업다운게임)
// 컴퓨터가 뽑은 1~100 안의 랜덤한 숫자를 맞추는 게임

// "DOWN" "UP"

// 사용자가 숫자를 입력할때마다 현재 점수가 1점씩 오른다.
// 만약 숫자를 맞췄을 경우, 간단하게 축하하고
// 최고기록을 출력해준다.
// 단, 현재 기록이 최고기록을 갱신할 경우 현재 기록이 새로운 최고 기록이 됨을 알려준다. (최소치가 최고기록)
// 현재 최고 기록 보기:
// 현재 최고 점수를 보여준다. 단, 플레이 기록이 없을경우
// 경고 메시지를 출력해준다.

import java.util.Random;
import java.util.Scanner;

public class Homework02Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int best_score = 1000000;

        while(true) {
            int max_num = 100, min_num = 1;

            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. 플레이, 2. 최고점수 확인, 3. 종료");
            System.out.print("> ");
            int userStep = scanner.nextInt();

            if(userStep == 1) {
                int comNum = random.nextInt(100) + 1;
                int score = 0;

                while(true) {
                    System.out.println("숫자를 유추해주세요 : ");
                    System.out.print("> ");
                    int userNum = scanner.nextInt();
                    if(userNum == comNum) {
                        System.out.printf("컴퓨터가 고른 숫자 : %d\n", comNum);
                        score++;
                        if(best_score > score) {
                            best_score = score;
                        }
                        System.out.printf("최종점수 : %d\n", best_score);

                        break;
                    }
                    if(userNum > min_num && userNum < max_num) {
                        if(userNum < comNum) {
                            min_num = userNum + 1;
                            System.out.println("UP");
                        }else {
                            max_num = userNum - 1;
                            System.out.println("DOWN");
                        }
                        score++;
                        System.out.printf("현재 점수 : %d\n", score);
                    }else {
                        System.out.println("올바르지 않은 범위입니다.");
                        System.out.printf("현재 점수 : %d\n", score);
                        System.out.printf("%d 이상 %d 이하의 숫자를 입력해주세요.\n", min_num, max_num);
                        System.out.print("> ");
                        continue;
                    }

                }
            }else if(userStep == 2) {
                if(best_score == 1000000) {
                    System.out.println("플레이 기록이 없습니다.");
                    continue;
                }
                System.out.printf("현재 최고기록 : %d\n", best_score);
            }else if(userStep == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("올바르지 않은 메뉴입니다. 다시 입력해주세요.");
            }
        }
    }
}
