package com.example.perulangan;

import java.util.Scanner;

public class perulangan2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("alas segitiga  : ");
        int alas = input.nextInt();
        boolean isGenap = (alas%2==0);
        int nilaiTengah = (isGenap) ? alas/2 : alas/2+1;

        int baris = nilaiTengah;
        System.out.print(nilaiTengah);



    }
}
