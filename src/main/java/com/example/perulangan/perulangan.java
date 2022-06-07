package com.example.perulangan;



public class perulangan {
    public static void main(String[] args) {
        int a = 5;
        for (int b = 1; b <= a; b++) {
            for (int c = 4; c >= b; c--) {
                System.out.print(' ');
            }
            for (int d = 1; d <= b; d++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}