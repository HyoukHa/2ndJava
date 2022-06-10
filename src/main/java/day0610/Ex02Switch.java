package day0610;

public class Ex02Switch {
    public static void main(String[] args) {
        int number = 2;

        // 정수, 연산식, 문자열타입 가능
        switch(number){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default :
                System.out.println("예외!");
                break;
        }

    }
}
