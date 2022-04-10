package com.sinau.bareng.services;

public class Pembagian extends PerhitunganAbstract {
    @Override
    public void hitung() {
        System.out.printf("Hasilnya adalah %d", (numA / numB));
    }
}
