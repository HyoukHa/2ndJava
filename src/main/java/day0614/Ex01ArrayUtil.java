package day0614;

import util.ArrayUtil;

public class Ex01ArrayUtil {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 20;
        arr[1] = 4;
        arr[2] = 20;
        arr[3] = 15;
        arr[4] = 1;

        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));

        System.out.println("ArrayUtil.isEmpty(arr) : " + ArrayUtil.isEmpty(arr));

        System.out.println("ArrayUtil.get(arr, 1) : " + ArrayUtil.get(arr, 1));

        System.out.println("ArrayUtil.contains(arr, 1) : " + ArrayUtil.contains(arr, 1));

        System.out.println("ArrayUtil.indexOf(arr, 20) : " + ArrayUtil.indexOf(arr, 20));
        System.out.println("ArrayUtil.indexOf(arr, 30) : " + ArrayUtil.indexOf(arr, 30));

        System.out.println("ArrayUtil.lastIndexOf(arr, 20) : " + ArrayUtil.lastIndexOf(arr, 20));
        System.out.println("ArrayUtil.lastIndexOf(arr, 30) : " + ArrayUtil.lastIndexOf(arr, 30));

        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.contains(arr, 50) : " + ArrayUtil.contains(arr, 50));
        arr = ArrayUtil.add(arr, 50);
        System.out.println("arr = ArrayUtil.add(arr, 50)");
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.contains(arr, 50) : " + ArrayUtil.contains(arr, 50));

        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.get(arr, 2) : " + ArrayUtil.get(arr, 2));
        arr = ArrayUtil.add(arr, 2, 30);
        System.out.println("arr = ArrayUtil.add(arr, 2, 30)");
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.get(arr, 2) : " + ArrayUtil.get(arr, 2));

        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.indexOf(arr, 88) : " + ArrayUtil.indexOf(arr, 15));
        arr = ArrayUtil.removeByIndex(arr, 4);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.indexOf(arr, 88) : " + ArrayUtil.indexOf(arr, 15));

        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.indexOf(arr, 30) : " + ArrayUtil.indexOf(arr, 30));
        arr = ArrayUtil.removeByElement(arr, 30);
        System.out.println("ArrayUtil.size(arr) : " + ArrayUtil.size(arr));
        System.out.println("ArrayUtil.indexOf(arr, 30) : " + ArrayUtil.indexOf(arr, 30));

//        ArrayUtil.abc(arr);

    }
}

    // 2. String[]
    // 2.1 현재 배열의 길이를 리턴하는 size()
    // 2.2 현재 배열이 비어있는지 체크하는 isEmpty()
    // 2.3 현재 배열에 특정 인덱스에 저장된 값을 리턴하는 get()
    // 2.4 현재 배열에 특정 요소가 있는지 체크하는 contains()
    // 2.5 현재 배열에서 특정 요소의 가장 낮은 인덱스를 리턴하는 indexOf()
    // 2.6 현재 배열에서 특정 요소의 가장 마지막에 등장하는 인덱스를 리턴하는 lastIndexOf()
    // 2.7 배열에 새로운 요소를 추가하여 크기가 증가된 배열을 리턴하는 add()
    // 2.8 특정 인덱스에 새로운 요소를 추가하는 add()
    // 2.9 특정 인덱스의 값을 새로운 값으로 바꾸는 set()
    // 단, 기존의 값은 다른곳에서 사용할 수도 있으므로 그 값을 호출된 곳으로 리턴해준다.
    // 2.10 배열의 특정 인덱스를 삭제해주는 removeByIndex()
    // 2.11 배열의 특정 요소를 삭제해주는 removeByElement()