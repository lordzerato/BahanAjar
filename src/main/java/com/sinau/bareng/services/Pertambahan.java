package com.sinau.bareng.services;

import java.awt.*;

public class Pertambahan extends PerhitunganAbstract {
    @Override
    public void hitung() {
        System.out.printf("Hasilnya adalah %d", (numA + numB));
    }
}
