package com.example.perulangan;
import java.util.Scanner;


public class contoh4IfElse {



    public static void main(String[] args) {
        System.out.println("======== Pengkategorian Suhu ========");
        System.out.println("===================================================");

        Scanner input = new Scanner(System.in);
        System.out.print("Input suhu  : ");
        int suhu = input.nextInt();

        String category = new contoh4IfElse() .getCategory(suhu);

        switch (category) {
            case "Beku":
                System.out.println("Kategori suhu : " + suhu + ", Suhu kategori beku dengan range suhu <= 0 derajat celcius");
                break;
            case "Dingin":
                System.out.println("Kategori suhu : " + suhu + ", Suhu kategori dingin dengan range suhu 1-10 derajat celcius");
                break;
            case "Sejuk":
                System.out.println("Kategori suhu : " + suhu + ", Suhu kategori sejuk  dengan range suhu 11-20 derajat celcius");
                break;
            case "Sedang":
                System.out.println("Kategori suhu : " + suhu + ", Suhu kategori sedang dengan range suhu 21-25 derajat celcius");
                break;
            case "Panas":
                System.out.println("Kategori suhu : " + suhu + ", Suhu kategori panas dengan range suhu 26-99 derajat celcius");
                break;
            case "Mendidih":
                System.out.println("Kategori suhu : " + suhu + ", Suhu kategori mendidih dengan range suhu >= 100 derajat celcius");
                break;
            default:
                System.out.println("Suhu yang anda masukkan salah");
                break;
        }
    }
    public String getCategory(int suhu) {

        if (suhu >= -200 && suhu <= 0)
            return "Beku";
        else if (suhu >= 1 && suhu <= 10)
            return "Dingin";
        else if (suhu >= 11 && suhu <= 20)
            return "Sejuk";
        else if (suhu >= 21 && suhu <= 25)
            return "Sedang";
        else if (suhu >= 26 && suhu <= 99)
            return "Panas";
        else if (suhu >= 100) {
            return "Mendidih";
        } else
            return "Invalid";
    }
}


