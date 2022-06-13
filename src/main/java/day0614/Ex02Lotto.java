package day0614;

// 로또 번호 추첨기
// 배열 적용

import java.util.Random;

public class Ex02Lotto {
    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNumbers = new int[6];

        // for 문을 사용하여 lottoNumbers 에 숫자를 저장
        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            lottoNumbers[i] = random.nextInt(45) + 1;
        }

        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            System.out.println(lottoNumbers[i]);
        }
        System.out.println();

        // for 문을 사용하여 i번째 인덱스에 중복된 숫자를 찾으면
        // 새로운 값을 저장하고 다시 체크하는 2중 for 문
        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            for(int j = 0 ; j < lottoNumbers.length ; j++) {
                if(i != j && lottoNumbers[i] == lottoNumbers[j]) {

                    // 이후 실행되는 문장이 증감문이기 때문에 j=-1로 만들어주면
                    lottoNumbers[j] = random.nextInt(45) + 1;
                    j = -1;
                }
            }
        }

        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            System.out.println(lottoNumbers[i]);
        }
        System.out.println();

        for(int i = 0 ; i < lottoNumbers.length - 1 ; i++) {
            if(lottoNumbers[i] > lottoNumbers[i+1]) {
                int temp = lottoNumbers[i];
                lottoNumbers[i] = lottoNumbers[i+1];
                lottoNumbers[i+1] = temp;

                i = -1;
            }
        }

        for(int i = 0 ; i < lottoNumbers.length ; i++) {
            System.out.println(lottoNumbers[i]);
        }
        System.out.println();
    }
}
