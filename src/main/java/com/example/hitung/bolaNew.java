package com.example.hitung;

import java.util.Scanner;

public class bolaNew {
    static double phi =3.14;
    private int jariJari;
    static double ketetapan = 1.33;
    private double luas ;
    private double volume;

    public  void setJariJari(int r){
        jariJari = r;
    }

    public double getluas(){
        luas = 4*phi*Math.pow(jariJari,2);
        return luas;
    }

    public double getVolume() {
        volume = ketetapan*phi*Math.pow(jariJari,3);
        return volume;
    }

    public static void main(String[] args){

        bolaNew bola =  new bolaNew();
        //fungsi untuk mendapatkan nilai jari-jari menggunakan scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai jari jari :") ;
        int r = scanner.nextInt();

        //untuk mengambil fungsi parameter yang diatas

        bola.setJariJari(r);


        System.out.println("nilai luas Bola = " + bola.getluas());
        System.out.println("nilai volume Bola  = " + bola.getVolume());

    }
}


