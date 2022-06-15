package day0613;

// 메소드
// 특정 여러줄의 코드를 매번 반복하여 처음부터 끝까지 실행시켜야 하는 경우
// 해당 코드를 전부 적어주는 것이 아니라
// 하나의 코드블락를 단축키로 묶어
// 단축키를 실행시키면 자동으로 해당 코드블락이 실행되도록 만들어주는 집합을 뜻한다.

// 메소드는 기본적으로 다음과 같은 구조를 가진다

// public static return타입 메소드이름(파라미터)

// 메소드 이름 : 캐멀표기법
// 파라미터 : 해당 메소드를 실행하는데 필요한 외부의 값을
// 변수처럼 사용할 수 있게 선언된 부분
// 만약 이 메소드를 실행시킬때 필요한 외부의 소스가 없다면 빈칸으로 기재

// public
// 접근 제한자 중 하나
// 해당 메소드 / 변수 / 상수를 외부 패키지의 어디서든 접근 가능하도록 설정해줌

// static
// 해당 메소드 혹은 변수/상수를 클래스 변수를 만들지 않고 직접 사용 가능하도록 만들어줌
// 단, 스태틱 메소드가 내부에서 다른 메수드 / 변수 / 상수를 호출 할 때에는
// 다른 메소드 / 변수 / 상수도 static 키워드가 붙어야 한다.

import java.util.Random;

public class Ex07Method {
    public static void main(String[] args) {
        // 1. 특정 코드만 실행시킬 경우
//        System.out.println("hello world!");
        sign();

        // 2. 외부의 값을 받아와서 내부에서 처리하여 실행시키는 경우
        int num = setRandomNum();
        double2(num);
//        if(num % 2 == 1) {
//            System.out.println("홀수");
//        }else {
//            System.out.println("짝수");
//        }
    }

    public static void sign() {
        System.out.println("hello world!");
    }

    public static void double2(int number) {
        if(number % 2 == 1) {
            System.out.println("홀수");
        }else {
            System.out.println("짝수");
        }
    }

    public static int setRandomNum() {
        Random random = new Random();
        int randomNum = random.nextInt();

        return randomNum;
    }
}
