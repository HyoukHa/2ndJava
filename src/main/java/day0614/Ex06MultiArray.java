package day0614;

// 다중배열
// 배열도 하나의 데이터타입이기에
// 다른 배열안에 포함될 수 있다.
// 다중 배열의 경우, 해당 배열이 총 몇개의 배열이 모여있는지 반드시 적어줘야한다.
public class Ex06MultiArray {
    public static void main(String[] args) {
        int[][] array = new int[4][3];

        // 위와같이 각 1차원 배열의 길이가 고정된 것이 아니라
        // 서로 다른 길이의 1차월 배열이 모여있을때는
        // 다음과 같은 초기화를 거쳐야 한다.

        // 1. 1차원 배열이 총 몇개 모여있는지를 결정하여 초기화해준다.
        array = new int[4][];

        // 해당 2차원 배열의 0번째 배열부터 차례대로 몇칸짜리 1차원 배열인지 명시해준다.
        array[0] = new int[3];
        array[1] = new int[4];
        array[2] = new int[2];
        array[3] = new int[6];

        for(int i = 0 ; i < array.length ; i++) {
            for(int j = 0 ; j < array[i].length ; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
