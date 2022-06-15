package util;

// 배열을 다룰 때 도움이 되는 다양한 메소드를 정의한 ArrayUtil 클래스

public class ArrayUtil {
    // 1. int[]
    // 1.1 현재 배열의 길이를 리턴하는 size()
    public static int size(int[] arr) {
        return arr.length;
    }

    // 1.2 현재 배열이 비어있는지 체크하는 isEmpty();
    public static boolean isEmpty(int[] arr) {
        return size(arr) == 0;
    }

    // 1.3 현재 배열에 특정 인덱스에 저장된 값을 리턴하는 get()
    public static int get(int[] arr, int index) {
        return arr[index];
    }

    // 1.4 현재 배열에 특정 요소가 있는지 체크하는 contains()
    public static boolean contains(int[] arr, int element) {
        for(int i = 0 ; i < size(arr) ; i++) {
            if(get(arr, i) == element) {
                return true;
            }
        }

        return false;
    }

    // 1.5 현재 배열에서 특정 요소의 가장 낮은 인덱스를 리턴하는 indexOf()
    public static int indexOf(int[] arr, int element) {
        for(int i = 0 ; i < size(arr) ; i++) {
            if(get(arr, i) == element) {
                return i;
            }
        }

        return -1;
    }

    // 1.6 현재 배열에서 특정 요소의 가장 마지막에 등장하는 인덱스를 리턴하는 lastIndexOf()
    public static int lastIndexOf(int[] arr, int element) {
        for(int i = size(arr) - 1 ; i >= 0 ; i--) {
            if(get(arr, i) == element) {
                return i;
            }
        }

        return -1;
    }

    // 1.7 배열에 새로운 요소를 추가하여 크기가 증가된 배열을 리턴하는 add()
    public static int[] add(int[] arr, int element) {
        int[] newArr = new int[size(arr) + 1];

        for(int i = 0 ; i < size(arr) ; i++) {
            newArr[i] = get(arr, i);
        }

        newArr[size(arr)] = element;

        return newArr;
    }

    // 1.8 특정 인덱스에 새로운 요소를 추가하는 add()
    public static int[] add(int[] arr, int index, int element) {
        int[] newArr = new int[0];

        for(int i = 0 ; i < index ; i++) {
            newArr = add(newArr, get(arr, i));
            System.out.println(get(arr, i));
        }

        newArr = add(newArr, element);

        for(int i = index ; i < size(arr) ; i++) {
            newArr = add(newArr, get(arr, i));
            System.out.println(get(arr, i));
        }

//        int[] newArr = new int[size(arr) + 1];
//
//        for(int i = 0 ; i < index ; i++) {
//            newArr[i] = get(arr, i);
//        }
//        newArr[index] = element;
//        for(int i = index + 1 ; i < size(arr) ; i++) {
//            newArr[i] = get(arr, i-1)];
//        }

        return newArr;
    }

    // 1.9 특정 인덱스의 값을 새로운 값으로 바꾸는 set()
    // 단, 기존의 값은 다른곳에서 사용할 수도 있으므로 그 값을 호출된 곳으로 리턴해준다.
    public static int set(int[] arr, int index, int element) {
        int temp = get(arr, index);
        arr[index] = element;
        return temp;
    }

    // 1.10 배열의 특정 인덱스를 삭제해주는 removeByIndex()
    public static int[] removeByIndex(int[] arr, int index) {
        int[] newArr = new int[0];

        if(index < 0 || index >= size(arr)) {
            return arr;
        }

        for(int i = 0 ; i < arr.length ; i++) {
            if(i != index) {
                newArr = add(newArr, get(arr, i));
            }

//            if(i == index) {
//                continue;
//            }
//            newArr = add(newArr, get(arr, i));
        }

        return newArr;
    }

    // 1.11 배열의 특정 요소를 삭제해주는 removeByElement()
    public static int[] removeByElement(int[] arr, int element) {
        return removeByIndex(arr, indexOf(arr, element));
    }


    // 1. 배열의 요소를 출력해주는


    // 2. String[]
    // 2.1 현재 배열의 길이를 리턴하는 size()
    public static int size(String[] arr) {
        return arr.length;
    }

    // 2.2 현재 배열이 비어있는지 체크하는 isEmpty();
    public static boolean isEmpty(String[] arr) {
        return size(arr) == 0;
    }

    // 2.3 현재 배열에 특정 인덱스에 저장된 값을 리턴하는 get()
    public static String get(String[] arr, int index) {
        return arr[index];
    }

    // 2.4 현재 배열에 특정 요소가 있는지 체크하는 contains()
    public static boolean contains(String[] arr, String str) {
        for(int i = 0 ; i < size(arr) ; i++) {
            if(get(arr, i).equals(str)) {
                return true;
            }
        }

        return false;
    }

    // 2.5 현재 배열에서 특정 요소의 가장 낮은 인덱스를 리턴하는 indexOf()
    public static int indexOf(String[] arr, String str) {
        for(int i = 0 ; i < size(arr) ; i++) {
            if(get(arr, i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    // 2.6 현재 배열에서 특정 요소의 가장 마지막에 등장하는 인덱스를 리턴하는 lastIndexOf()
    public static int lastIndexOf(String[] arr, String str) {
        for(int i = size(arr) - 1 ; i >= 0 ; i--) {
            if(get(arr, i).equals(str)) {
                return i;
            }
        }

        return -1;
    }

    // 2.7 배열에 새로운 요소를 추가하여 크기가 증가된 배열을 리턴하는 add()
    public static String[] add(String[] arr, String str) {
        String[] newArr = new String[size(arr) + 1];

        for(int i = 0 ; i < size(arr) ; i++) {
            newArr[i] = get(arr, i);
        }
        newArr[size(arr)] = str;

        return newArr;
    }

    // 2.8 특정 인덱스에 새로운 요소를 추가하는 add()
    public static String[] add(String[] arr, int index, String str) {
        String[] newArr = new String[0];

        for(int i = 0 ; i < index ; i++) {
            newArr = add(newArr, get(arr, i));
        }
        newArr = add(newArr, str);
        for(int i = index ; i < size(arr) ; i++) {
            newArr = add(newArr, get(arr, i));
        }

        return newArr;
    }

    // 2.9 특정 인덱스의 값을 새로운 값으로 바꾸는 set()
    // 단, 기존의 값은 다른곳에서 사용할 수도 있으므로 그 값을 호출된 곳으로 리턴해준다.
    public static String set(String[] arr, int index, String str) {
        String temp = get(arr, index);
        arr[index] = str;
        return temp;
    }

    // 2.10 배열의 특정 인덱스를 삭제해주는 removeByIndex()
    public static String[] remove(String[] arr, int index) {
        String[] newArr = new String[0];

        if(index < 0 || index >= size(arr)) {
            return arr;
        }

        for(int i = 0 ; i < size(arr) ; i++) {
            if(i != index) {
                newArr = add(newArr, get(arr, i));
            }
        }

        return newArr;
    }

    // 2.11 배열의 특정 요소를 삭제해주는 removeByElement()
    public static String[] remove(String[] arr, String str) {
        return remove(arr, indexOf(arr, str));
    }

}
