package day0614;

// 1. 자동 2. 수동 입력가능한 로또추첨기

import java.util.Random;
import java.util.Scanner;

public class Ex04Lotto {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] lottoNumbers = new int[6];
        int[] userNumbers = new int[6];

        for(int i = 0 ; i < lottoNumbers.length ;) {
            int randomNumber = random.nextInt(45) + 1;
            boolean numSwitch = true;

            for(int j = 0 ; j < i ; j++) {
                if(randomNumber == lottoNumbers[j]) {
                    numSwitch = false;
                    userNumbers = userNumbers;
                }
            }
            if(numSwitch) {
                lottoNumbers[i] = randomNumber;
                i++;
            }
        }

        for(int i = 0 ; i < lottoNumbers.length - 1 ; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                i = -1;
            }
        }

        System.out.println("로또 번호생성기를 실행합니다. 모드를 선택해주세요.");
        System.out.println("1.자동 2.수동");
        System.out.print("> ");
        int userStep = scanner.nextInt();

        if(userStep == 1) {
            for(int i = 0 ; i < userNumbers.length ;) {
                int randomNumber = random.nextInt(45) + 1;
                boolean numSwitch = true;

                for(int j = 0 ; j < i ; j++) {
                    if(randomNumber == userNumbers[j]) {
                        numSwitch = false;
                    }
                }
                if(numSwitch) {
                    userNumbers[i] = randomNumber;
                    i++;
                }
            }
        }else if(userStep == 2) {
            for(int i = 0 ; i < lottoNumbers.length ;) {
                boolean numSwitch = true;
                System.out.printf("%d번째 숫자를 입력해주세요.\n", i+1);
                System.out.print("> ");
                int userNumber = scanner.nextInt();


                for(int j = 0 ; j < i ; j++) {
                    if(userNumber == userNumbers[j]) {
                        System.out.println("같은 숫자를 이미 입력하셨습니다.");
                        numSwitch = false;
                    }else if(userNumber < 1 || userNumber > 45) {
                        System.out.println("1과 45사이의 숫자를 입력해주세요.");
                        numSwitch = false;
                    }
                }
                if(numSwitch) {
                    userNumbers[i] = userNumber;
                    i++;
                }
            }
        }

        for(int i = 0 ; i < userNumbers.length - 1 ; i++) {
            if(userNumbers[i] > userNumbers[i+1]) {
                int temp = userNumbers[i];
                userNumbers[i] = userNumbers[i+1];
                userNumbers[i+1] = temp;
                i = -1;
            }
        }

        System.out.print("당첨 번호 :");
        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            System.out.printf("%2d ", lottoNumbers[i]);
        }
        System.out.println();

        System.out.print("선택 번호 :");
        for(int i = 0 ; i < userNumbers.length ; i++) {
            System.out.printf("%2d ", userNumbers[i]);
        }
        System.out.println();

        int count = 0;

        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            for(int j = 0 ; j < userNumbers.length ; j++) {
                if(lottoNumbers[i] == userNumbers[j]){
                    count++;
                    break;
                }
            }
        }

        System.out.printf("맞은 숫자 : %d개", count);
    }
}
