package com.example.perulangan;
import java.util.Scanner;

public class cobaIfElse {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input angka : ");
        int angka = scanner.nextInt();


        if(angka%2==0){
            System.out.println("bilangan genap");
        }else {
            System.out.println("bilangan ganjil");
        }
    }
}
