package com.sinau.bareng;

import com.sinau.bareng.services.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        System.out.println("Silakan pilih menu:");
//        try (Scanner sc = new Scanner(System.in)) {
//
//        } catch (Exception e) {
//
//        }
        System.out.println("Silakan masukkan soal:");
        Scanner sc = new Scanner(System.in);
        String[] arrays = sc.nextLine().split(" ");
        String input = arrays[1];
        PerhitunganAbstract mode = null;
        switch (input) {
            case "+":
                mode = new Pertambahan();
                break;
            case "-":
                mode = new Pengurangan();
                break;
            case ":":
            case "/":
                mode = new Pembagian();
                break;
            default:
                mode = new Perkalian();
                break;
        }
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
//                String[] tes = new String[] {"cls", "scr"};
//                Runtime.getRuntime().exec("cls");
//                System.out.println("\\033[H\\033[2J");
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
        mode.setNumA(Integer.parseInt(arrays[0]));
        mode.setNumB(Integer.parseInt(arrays[2]));
        mode.start();
    }
}
