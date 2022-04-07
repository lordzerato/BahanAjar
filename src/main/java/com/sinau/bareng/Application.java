package com.sinau.bareng;

import com.sinau.bareng.service.calculator.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Silahkan pilih simbol awal (+,-,/,x)");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        PerhitunganAbstract hitung = null;
        switch (s){
            case "+":
                hitung= new Penambahan();
                break;
            case "-":
                hitung=new Pengurangan();
                break;
            case "/":
                hitung=new Pembagian();
                break;
            default:
                hitung=new Perkalian();
                break;
        }
        hitung.start();
    }
}
