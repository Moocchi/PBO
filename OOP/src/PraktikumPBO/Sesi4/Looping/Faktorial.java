package PraktikumPBO.Sesi4.Looping;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah angka: ");
            int angka = input.nextInt();

            int faktorial = 1;

            // Looping untuk menghitung faktorial
            while (angka > 0) {
                faktorial *= angka; // Kalikan nilai dengan nilai saat ini
                angka--; // Kurangi dengan satu
            }

            System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
        }
    }
}
