package day0609;

public class EX03Compare {
    // 참조형 데이터타입에 대한 값 비교를 할때 주의할 점

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = str1;

        System.out.printf("str1 : [%s]\n", str1);
        System.out.printf("str1 : [%s]\n", str2);
        System.out.printf("str1 : [%s]\n", str3);
        System.out.printf("str1 : [%s]\n", str4);

        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str2 == str3); // false
        System.out.println(str2 == str4); // true
        System.out.println(str3 == str4); // false

        System.out.println(str1.getClass().getName());
        System.out.println(str2.getClass().getName());
        System.out.println(str3.getClass().getName());
        System.out.println(str4.getClass().getName());

        // 클래스 메서드 사용하기
        // .메서드를 이용하여 사용

        System.out.println("str1.equals(str3) : " + str1.equals(str3));

    }
}
