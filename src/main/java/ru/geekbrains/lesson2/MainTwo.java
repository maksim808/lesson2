package ru.geekbrains.lesson2;

import java.util.Arrays;

public class MainTwo<ma> {
    public static void main(String[] args) {
    maxiMan();
    maxiManTwo();
    maxiManThree();
    maxiManFour();
    maxiManFive();
    maxiManSix();
    maxiManSeven();



    }

    public static void maxiMan() {
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 0, 1, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                } else {
                    arr[i] = 0;
                }
            }
            System.out.println(Arrays.toString(arr));
    }

    public static void maxiManTwo() {
        int[] arr2 = new int[8];
        for (int i = 1, b = 0; i < arr2.length; i++)
            arr2[i] = b +=3;
            System.out.println(Arrays.toString(arr2));

    }

    public static void maxiManThree() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void maxiManFour() {
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0, j2 = arr4[i].length; j < 5; j++, j2--){
                if (i == j || i == (j2 -1)) {
                    arr4[i][j] = 1;

                }

            }
        }

        System.out.println(Arrays.deepToString(arr4));
    }

    public static void  maxiManFive() {
        int[] arr5 = {1, 5, 7, 2, 11, 4, 5, 2, 4, 8, 9, 13};
        int maximal = arr5[0], minimal = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > maximal) {
                maximal = arr5[i];
            }
            if (arr5[i] < minimal) {
                minimal = arr5[i];
            }
        }
        System.out.println("Максимальный элемент массива равен " + maximal);
        System.out.println("Минимальный элемент массива равен " + minimal);
    }

    private static boolean maxiManSix() {
        int[] arr6 = {6, 10, 55, 13, 4, 34, 20, 11, 5, 8, 27};
        int rtSum, ltSum;
        for (int i = 0; i < arr6.length; i++) {
            rtSum = 0;
            ltSum = 0;
            for (int j = 0; j <= i; j++) {
                ltSum += arr6[j];
            }
            for (int x = i + 1; x < arr6.length; x++) {
                rtSum += arr6[x];
            }
            if (rtSum == ltSum) return true;
        }
        return false;
    }

    private static void maxiManSeven(int[] arr7, int n) {
        for(int i : arr7);
        if (n > 0) {
            for (int b = 0; b < n; b++) {
                int vr = arr7[arr7.length - 1];
                if (arr7.length - 1 >= 0);
                arr7[0] = vr;
            }
        }

    }

}
