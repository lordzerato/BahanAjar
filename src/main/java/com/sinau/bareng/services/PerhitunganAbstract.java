package com.sinau.bareng.services;

import java.util.Scanner;

public abstract class PerhitunganAbstract implements PerhitunganInterface {
    protected int numA;
    protected int numB;

    public void start() {
//        System.out.println("Masukkan angka pertama:");
//        Scanner sc = new Scanner(System.in);
//        this.numA = sc.nextInt();
//        System.out.println("Masukkan angka kedua:");
//        this.numB = sc.nextInt();
        hitung();
    }
    public void setNumA(int val) {
        this.numA = val;
    }
    public void setNumB(int val) {
        this.numB = val;
    }
}
