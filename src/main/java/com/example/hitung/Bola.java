package com.example.hitung;

import java.util.Scanner;

public class Bola {

    public static void main(String[] args){

    double phi = 3.14;
    double ketetapan = 1.33;

    //hanya mengubah jari-jari untuk menentukan luas dan volume bola
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan nilai jari jari :") ;
    int r = scanner.nextInt();


    //rumus luas bola 4 x π x r^2
    double luas = 4*phi*Math.pow(r,2);
    //rumus volume bola 4/3 x π x r^3
    double volume = ketetapan*phi*Math.pow(r,3);

    System.out.println("nilai luas Bola = " + luas);
    System.out.println("nilai volume Bola  = " + volume);

    }
}

