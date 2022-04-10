package com.sinau.bareng.services;

public class Perkalian extends PerhitunganAbstract {
    @Override
    public void hitung() {
        System.out.printf("= %d", (numA * numB));
    }
}
