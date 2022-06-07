package com.example.hitung;

import java.util.Scanner;

public class Segitiga {
    private static int alas ;
    private int tinggi ;
    static double ketetapan = 0.5;
    private int sisiMiring;
    private double luas ;
    private double keliling;

    public void setAlas(int a) {
       alas = a;
    }
    public void setTinggi(int t){
        tinggi= t;
    }
    public void setSisiMiring(int s){
        sisiMiring = s;
    }

    public double getLuas(){
        luas = ketetapan*alas*tinggi;
        return luas;
    }

    public double getKeliling(){
        keliling = alas+tinggi+sisiMiring;
        return keliling;
    }

    public static void main(String[] args){
        Segitiga segitiga = new Segitiga();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai alas segitiga :") ;
        int a = scanner.nextInt();

        System.out.print("Masukkan nilai tinggi segitiga:") ;
        int t = scanner.nextInt();

        System.out.print("Masukkan nilai sisi miring segitiga :") ;
        int s = scanner.nextInt();

        segitiga.setAlas(a);
        segitiga.setTinggi(t);
        segitiga.setSisiMiring(s);

        System.out.println("hasil keliling segitiga= "+ segitiga.getKeliling());
        System.out.println("hasil luas= "+ segitiga.getLuas());

    }



}

