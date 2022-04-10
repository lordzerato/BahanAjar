package com.sinau.bareng.services;

public class Pengurangan extends PerhitunganAbstract {
    @Override
    public void hitung() {
        System.out.printf("Hasilnya adalah %d", (numA - numB));
    }
}
