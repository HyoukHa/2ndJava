package day0613;

// 배열
// 배열이란 같은 데이터타입, 같은 목적을 가진 변수가 여러개 필요할때
// 굳이 각각의 변수를 만드는 것이 아니라
// 하나의 이름으로 묶어서 제어할 수 있게 만들어주는 데이터타입이다.

// 배열은 우리가 사용할 때 반드시 총 몇개의 변수(=길이)를 저장할지를 명시해주어야하고,
// 똑같은 데이터타입만 묶어줄 수 있다.

// 배열의 선언과 초기화
// 데이터타입[] 배열이름 = new 데이터타입[길이]

// 기본형 데이터타입의 배열은 각 칸이 0으로 초기화된다.
// 참조형 데이터타입의 배열은 각 칸이 null 로 초기화된다.

// 배열을 흔히 표라고 생각하면 편함!

// null 이란? --> 정확한 개념이 무엇인지 확인 필요

import java.util.Random;

public class Ex01Array {
    public static void main(String[] args) {
        Random random = new Random();

        int lottoNum1 = 1;
        int lottoNum2 = 2;
        int lottoNum3 = 3;
        int lottoNum4 = 4;
        int lottoNum5 = 5;
        int lottoNum6 = 6;

        int temp = random.nextInt(45) + 1;
        lottoNum1 = temp;

        while(temp == lottoNum1) {
            temp = random.nextInt(45) + 1;
        }

        lottoNum2 = temp;

        while(temp == lottoNum1 || temp == lottoNum2) {
            temp = random.nextInt(45) + 1;
        }

        lottoNum3 = temp;

        while(temp == lottoNum1 || temp == lottoNum2 || temp == lottoNum3) {
            temp = random.nextInt(45) + 1;
        }

        lottoNum4 = temp;

        while(temp == lottoNum1 || temp == lottoNum2 || temp == lottoNum3 || temp == lottoNum4) {
            temp = random.nextInt(45) + 1;
        }

        lottoNum5 = temp;

        while(temp == lottoNum1 || temp == lottoNum2 || temp == lottoNum3 || temp == lottoNum4 || temp == lottoNum5) {
            temp = random.nextInt(45) + 1;
        }

        lottoNum6 = temp;

        while(temp == lottoNum1 || temp == lottoNum2 || temp == lottoNum3 || temp == lottoNum4 || temp == lottoNum5 || temp == lottoNum6) {
            temp = random.nextInt(45) + 1;
        }

        System.out.printf("%d %d %d %d %d %d", lottoNum1, lottoNum2, lottoNum3, lottoNum4, lottoNum5, lottoNum6);

        int sortedNum1 = 0;
        int sortedNum2 = 0;
        int sortedNum3 = 0;
        int sortedNum4 = 0;
        int sortedNum5 = 0;
        int sortedNum6 = 0;

        temp = lottoNum1;

    }
}
