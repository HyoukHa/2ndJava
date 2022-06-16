package day0615;
// 구조체 사용

import struct.Student;

public class Ex01Struct {
    public static void main(String[] args) {
        // 우리가 만든 데이터타입의 변수를 만들때에는
        // Random 변소를 만들때와 똑같은 형태를 가지게 된다.
        Student s = new Student();

        s.id = 3;
        s.name = "권혁하";
        s.kor = 80;
        s.eng = 80;
        s.math = 81;

        // 마찬가지로 현재 해당곤간 내부의 공간 값을 호출할 때도 똑같이 적어준다.
        System.out.println("s.id : " + s.id);
        System.out.println("s.name : " + s.name);
        System.out.println("s.kor : " + s.kor);
        System.out.println("s.eng : " + s.eng);
        System.out.println("s.math : " + s.math);
        int sum = s.kor + s.eng + s.math;
        double avg = sum / 3.0;
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);

        // 또 다른 Student 변수 생성
        Student s2 = new Student();

        s2.id = 1;
        s2.name = "읭읭";
        s2.kor = 90;
        s2.eng = 91;
        s2.math = 91;
        System.out.println("s2.id : " + s2.id);
        System.out.println("s2.name : " + s2.name);
        System.out.println("s2.kor : " + s2.kor);
        System.out.println("s2.eng : " + s2.eng);
        System.out.println("s2.math : " + s2.math);
        int sum2 = s2.kor + s2.eng + s2.math;
        double avg2 = sum2 / 3.0;
        System.out.println("총점 : " + sum2);
        System.out.println("평균 : " + avg2);

        // 똑같은 데이터타입의 변수가 모여있는 배열을 만들수도 있다
        Student[] arr = new Student[3];

        // 각 칸은 개별적으로 초기화 필요.
        arr[0] = new Student();
        // 초기화 >> 기본형 : 0, 참조형 : NULL
        System.out.println("arr[0].id : " + arr[0].id);
        System.out.println("arr[0].name : " + arr[0].name);

        // 주의할 점
        // 참조형 데이터타입의 공간끼리 실제 값 비교를 할 때에는
        // equals()를 사용해야 정확한 결과를 얻을 수 있다고 학습했지만
        // 아직은 우리가 만든 데이터타입의 equals()는 쓸모가 없다.

        // s2와 같은값을 가지는 s3
        Student s3 = new Student();

        s3.id = 1;
        s3.name = "읭읭";
        s3.kor = 90;
        s3.eng = 91;
        s3.math = 91;

        System.out.println("s2.equals(s3) : " + s2.equals(s3));

        // 따라서 직접 필요할때 equals를 만들어주거나
        // 아니면 두 공간의 특정값들을 직접 비교하게 코드를 작성해야한다.
        System.out.println("s2 == s3" + (s2 == s3));

        System.out.println("s2.id == s3.id : " + (s2.id == s3.id));
    }
}
