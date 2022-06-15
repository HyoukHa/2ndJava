package day0614;

// 사용자로부터 총 몇게임할지 입력받아서
// 각 게임마다 자동/수동 입력 받아서
// 결과까지 보여주는 프로그램을 작성하시오

// 조건1. ScannerUtil, ArrayUtil 사용하기
// 조건2. 자동 숫자 부여를 별개의 메소드로 만들기
// 조건3. 정렬을 별개의 메소드로 만들기
// 조건4. 결과 비교를 별개의 메소드로 만들기

import util.ArrayUtil;
import util.ScannerUtil;
import java.util.Scanner;
import java.util.Random;

public class Ex02Lotto {
    static final int NUMBER_MIN = 1;
    static final int NUMBER_MAX = 45;
    static final int SIZE_MAX = 6;

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] lottoNumber = new int[0];

        String msg1 = "로또 번호 생성기를 실행합니다.\n구매하실 총 개수를 입력해주세요.";
        int totalGameCount = ScannerUtil.nextInt(scanner, msg1);
        int[][] userNumbers = new int[totalGameCount][];

        for(int i = 0 ; i < userNumbers.length ; i++) {
            String msg2 = "로또 번호 생성방법을 선택해주세요\n1. 자동   2. 수동";
            int wayToCreate = ScannerUtil.nextInt(scanner, msg2, 1, 2);

            if(wayToCreate == 1) {
                userNumbers[i] = setAutoNum();
            }else if(wayToCreate == 2) {
                userNumbers[i] = setManualNum();
            }
        }

        // 로또번호를 랜덤으로 만들어주는 createLottoNum()
        lottoNumber = setAutoNum();

        System.out.println("---------------------");
        System.out.println("컴퓨터의 숫자");
        System.out.println("---------------------");
        printArray(lottoNumber);
        System.out.println("---------------------");
        System.out.println("사용자의 숫자");
        System.out.println("---------------------");
        for(int i = 0 ; i < userNumbers.length ; i++) {
            printArray(userNumbers[i]);
            System.out.println("- 총 맞은 갯수 : " + countSame(lottoNumber, userNumbers[i]));
        }

        scanner.close();
    }

    public static int[] setAutoNum() {
        Random random = new Random();

        int[] newArr = new int[0];

        while(ArrayUtil.size(newArr) < SIZE_MAX) {
            int randomNumber = random.nextInt(NUMBER_MAX) + NUMBER_MIN;
            if(!ArrayUtil.contains(newArr, randomNumber)) {
                newArr = ArrayUtil.add(newArr, randomNumber);
            }
        }

        sort(newArr);

        return newArr;
    }

    public static int[] setManualNum() {
        int[] newArr = new int[0];
        while(ArrayUtil.size(newArr) < SIZE_MAX) {
            String message = "1부터 45사이의 숫자를 입력해주세요.";
            int userInput = ScannerUtil.nextInt(scanner, message, NUMBER_MIN, NUMBER_MAX);
            if(ArrayUtil.contains(newArr, userInput)) {
                System.out.println("중복된 숫자입니다.");
            }else {
                newArr = ArrayUtil.add(newArr, userInput);
            }
        }

        sort(newArr);

        return newArr;
    }

    public static void sort(int[] arr) {
        for(int i = 0 ; i < ArrayUtil.size(arr) - 1 ; i++) {
            if(ArrayUtil.get(arr, i) > ArrayUtil.get(arr, i+1)) {
                int temp = ArrayUtil.set(arr, i+1, ArrayUtil.get(arr, i));
                ArrayUtil.set(arr, i, temp);
                i = -1;
            }
        }
    }


    public static void printArray(int[] arr) {
        System.out.print("[");
        for(int i = 0 ; i < ArrayUtil.size(arr) ; i++) {
            System.out.printf("%2d", ArrayUtil.get(arr, i));
            if(i != ArrayUtil.size(arr)-1) {
                System.out.print(" ");
            }

        }
        System.out.println("]");
    }

    public static int countSame(int[] arr1, int[] arr2) {
        int count = 0;

        for(int i = 0 ; i < ArrayUtil.size(arr1) ; i++) {
            if(ArrayUtil.contains(arr2, ArrayUtil.get(arr1, i))) {
                count++;
            }
        }

        return count;
    }
}
