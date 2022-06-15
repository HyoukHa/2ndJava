package homework.util;

import java.util.Random;
import java.util.Scanner;

public class LottoUtil {
    public static int nextIntAfterText(Scanner scanner, String string) {
        System.out.print(string);
        int temp = scanner.nextInt();

        return temp;
    }

    public static int autoCreateNum(Random random, int size, int startNum) {
        int temp = random.nextInt(size) + startNum;
        return temp;
    }

    public static int[] sortArray(int[] array) {
        for(int i = 0 ; i < array.length - 1 ; i++) {
            if(array[i] > array[i+1]) {
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i = -1;
            }
        }
        return array;
    }

    public static void printArray(String string, int[] array) {
        System.out.print(string);
        for(int i = 0 ; i < array.length ; i++) {
            System.out.printf("%3d", array[i]);
        }
    }

    public static void printArrayWithIndex(String string, int index, int[] array) {

    }
}
