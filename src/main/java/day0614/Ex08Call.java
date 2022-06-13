package day0614;

// Call By Value vs Call By Reference

// Call By Value
// 메소드의 파라미터로 기본형 데이터타입을 설정할 경우
// 특정 값을 넘겨줄때 스택 영역에서 복사가 일어나 값이 전달되기 때문에
// 실제 데이터가 복사되어 넘어가기 때문에
// 해당 메소드에서 데이터를 변경시키더라도, 원 데이터는 변경되지 않는다.

// Call By Reference
// 메소드의 파라미터로 참조형 데이터타입을 설정할 경우
// 특정 데이터이 아닌 저장된 주소값이 전달되기 때문에
// 해당 메소드에서 데이터를 변경시키게 되면, 해당 주소값에 저장된 값이 변경되기 때문에
// 원 데이터가 변경되게 된다.

public class Ex08Call {
    public static void main(String[] args) {
        int number = 1;
        String str = new String("123");
        System.out.println(str);
        strChange(str);
        System.out.println(str);
        System.out.println(number);

        int[] numberArray = new int[3];

    }

    public static void increaseVal(int num) {
        num++;
    }

    public static void strChange(String str) {
        str = "1";
    }

//    public static void increaesVal(int[] arr) {
//        for(int i = 0 ; i < arr.length ; i++) {
//            arr[i]++;
//        }
//    }
}
