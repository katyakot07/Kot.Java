package com.company;
public class Arr {
    public static void main(String[] args) {
        int[] arrl = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 };
        for (int i = 1; i < 21; i++) {
            if (arrl[i] % 3 == 0) {
                System.out.println(arrl[i]) ;
                i++;
            }
        }
    }
}