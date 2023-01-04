/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Alfan Miftachul
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
       
        System.out.print("Masukkan pilihan menghitung luas bangundatar: ");
        int bangun = input.nextInt();

       
        switch (bangun) {
            case 1: //luas Persegi
                System.out.print("Masukkan sisi: ");
                double sisi = input.nextDouble();
                double luasPersegi = sisi * sisi;

                System.out.println("Luas persegi: " + luasPersegi);

                break;
            case 2: //luas Persegi Panjang
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                double luasPersegiPanjang = panjang * lebar;

                System.out.println("Luas persegi panjang: " + luasPersegiPanjang);

                break;
            case 3: // luas Segitiga
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
               
                double luasSegitiga = 0.5 * alas * tinggi;

                System.out.println("Luas segitiga: " + luasSegitiga);

                break;
                
            case 4 :
                System.out.println("error bangun datar tidak di temukan");
                break;

        }
    }

}
