package Overriding;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    @Override
    float luas() {
        float luas =   (alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }
}