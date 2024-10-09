package PraktikumPBO.Sesi4;

import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        //Membuat Variabel dan Scanner
        String lampu;
        try (Scanner scan = new Scanner(System.in)) {
            //Mengambil Input
            System.out.print("Inputkan Nama Warna: ");
            lampu = scan.nextLine();

            switch (lampu) {
                case "merah" -> System.out.println("Lampu merah, berhenti!");
                case "kuning" -> System.out.println("Lampu kuning, harap hati-hati!");
                case "hijau" -> System.out.println("Lampu hijau, Silakan Jalan!");
                default -> System.out.println("Warna Lampu Salah");
            }
        }
    }
}
