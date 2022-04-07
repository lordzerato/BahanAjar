package com.sinau.bareng.service.calculator;

import java.util.Scanner;

public abstract class PerhitunganAbstract implements PerhitunganInterface {
    protected int a;
    protected int b;
    public void start(){
        System.out.println("Silahkan input angka pertama dan di akhiri dengan enter");
        Scanner sc = new Scanner(System.in);
        this.a = sc.nextInt();
        System.out.println("Silahkan input angka kedua dan di akhiri dengan enter");
        this.b=sc.nextInt();
        hitung();
    }
}
