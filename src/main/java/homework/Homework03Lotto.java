package homework;


import java.util.Random;
import java.util.Scanner;
import homework.util.LottoUtil;

public class Homework03Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 사용자가 실행할 게임 수 입력단
        String startString = "로또번호 생성기를 실행합니다.\n총 구매할 로또 세트수를 입력해주세요.\n> ";
        int times = LottoUtil.nextIntAfterText(scanner, startString);

//        System.out.println("로또번호 생성기를 실행합니다.");
//        System.out.println("총 구매할 로또 세트수를 입력해주세요.");
//        System.out.print("> ");
//        int times = scanner.nextInt();

        // 사용자 게임수에 따른 동적 2중배열 선언부
        int[][] userNumbers = new int[times][];
        // 컴퓨터가 만든 번호를 저장할 배열 선언부
        int[] lottoNumbers = new int[6];

        // 로또번호 생성 코드 단
        for(int i = 0 ; i < lottoNumbers.length ;) {
            int randomNumber = random.nextInt(45) + 1;
            boolean numSwitch = true;

            for(int j = 0 ; j < i ; j++) {
                if(randomNumber == lottoNumbers[j]) {
                    numSwitch = false;
                }
            }
            if(numSwitch) {
                lottoNumbers[i] = randomNumber;
                i++;
            }
        }

        // 로또번호 정렬 단
        for(int i = 0 ; i < lottoNumbers.length - 1 ; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;
                i = -1;
            }
        }

        // 사용자 게임수만큼 반복
        for(int a = 0 ; a < times ; a++) {
            System.out.println("로또 번호생성기를 실행합니다. 모드를 선택해주세요.");
            System.out.println("1.자동 2.수동");
            System.out.print("> ");
            int userStep = scanner.nextInt();
            int userNumber[] = new int[6];

            if(userStep == 1) {
                for(int i = 0 ; i < userNumber.length ;) {
                    int randomNumber = random.nextInt(45) + 1;
                    boolean numSwitch = true;

                    for(int j = 0 ; j < i ; j++) {
                        if(randomNumber == userNumber[j]) {
                            numSwitch = false;
                        }
                    }
                    if(numSwitch) {
                        userNumber[i] = randomNumber;
                        i++;
                    }
                }
            }else if(userStep == 2) {
                for(int i = 0 ; i < lottoNumbers.length ;) {
                    boolean numSwitch = true;
                    System.out.printf("%d번째 숫자를 입력해주세요.\n", i+1);
                    System.out.print("> ");
                    int randomNumber = scanner.nextInt();


                    for(int j = 0 ; j < i ; j++) {
                        if(randomNumber == userNumber[j]) {
                            System.out.println("같은 숫자를 이미 입력하셨습니다.");
                            numSwitch = false;
                        }else if(randomNumber < 1 || randomNumber > 45) {
                            System.out.println("1과 45사이의 숫자를 입력해주세요.");
                            numSwitch = false;
                        }
                    }
                    if(numSwitch) {
                        userNumber[i] = randomNumber;
                        i++;
                    }
                }
            }


            userNumber = LottoUtil.sortArray(userNumber);

//            for(int i = 0 ; i < userNumber.length - 1 ; i++) {
//                if(userNumber[i] > userNumber[i+1]) {
//                    int temp = userNumber[i];
//                    userNumber[i] = userNumber[i+1];
//                    userNumber[i+1] = temp;
//                    i = -1;
//                }
//            }
            userNumbers[a] = userNumber;
        }

        LottoUtil.printArray("당첨 번호 : ", lottoNumbers);
        System.out.println();
//        System.out.print(" 당첨 번호 :");
//        for(int i = 0 ; i < lottoNumbers.length ; i++) {
//            System.out.printf("%2d ", lottoNumbers[i]);
//        }
//        System.out.println();



        for(int i = 0 ; i < userNumbers.length ; i++) {
            int count = 0;
            for(int j = 0 ; j < userNumbers[i].length ; j++) {
                for(int k = 0 ; k < lottoNumbers.length ; k++) {
                    if(userNumbers[i][j] == lottoNumbers[k]) {
                        count++;
                        break;
                    }
                }
            }

            System.out.printf("%d번째 번호 :", i);
            for(int j = 0 ; j < userNumbers[i].length ; j++) {
                System.out.printf("%3d", userNumbers[i][j]);
            }
            System.out.printf(", 당첨 개수 : %d개\n", count);

        }
    }
}
