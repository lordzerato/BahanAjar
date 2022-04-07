package com.sinau.bareng.service.calculator;

public class Penambahan extends PerhitunganAbstract{
    @Override
    public void hitung() {
        System.out.printf("Hasil hitung : %d ",(a+b));
    }
}
