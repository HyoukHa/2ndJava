package day0616;

public class Ex02Student {
    public static void main(String[] args) {
//        Student s1 = new Student();
        Student s1 = new Student(1, "권혁하", 80, 80, 81);

        Student2 s3 = new Student2(2, "권혁하", 50, 50, 51);
        // 캡슐화가 적용되었을 경우
        // 필드에 값을 저장할때에는 우리가 해당 객체의 setter 메소드를 통하여 값을 저장하게 된다.
        s3.setId(3);
        s3.setName("홍길동");
        s3.setKor(90);
        s3.setEng(91);
        s3.setMath(93);

        // 특정 필드에 저장되어있는 값을 호출할때에는 getter 메소드를 사용한다.
        System.out.println("s3의 이름 : " + s3.getName());

        // 만약 외부가 접근 가능한 메소드라면?
        // 기존의 방법처럼 호출하면 된다.
        s3.printInfo();

        System.out.println(s3);

    }
}
