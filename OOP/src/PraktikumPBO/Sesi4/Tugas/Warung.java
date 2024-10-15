package PraktikumPBO.Sesi4.Tugas;

import java.util.Scanner;

public class Warung {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Deklarasi dan inisialisasi tipe data
            String[] menu = {"Nasi Goreng", "Mie Ayam", "Sate Ayam"};
            double[] harga = {15000, 12000, 20000};
            int pilihan, jumlah;
            double total = 0;
            double diskon = 0;

            System.out.print("\033[H\033[2J");
            System.out.println("=== Menu Warung ===");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
            }

            // Memilih menu menggunakan switch
            while (true) {
                System.out.print("Pilih menu (1-3) atau 0 untuk selesai: ");
                pilihan = scanner.nextInt();

                if (pilihan == 0) {
                    break;
                }

                double hargaPilihan;
                switch (pilihan) {
                    case 1 -> {
                        System.out.println("Anda memilih " + menu[0]);
                        hargaPilihan = harga[0];
                    }
                    case 2 -> {
                        System.out.println("Anda memilih " + menu[1]);
                        hargaPilihan = harga[1];
                    }
                    case 3 -> {
                        System.out.println("Anda memilih " + menu[2]);
                        hargaPilihan = harga[2];
                    }
                    default -> {
                        System.out.println("Pilihan tidak valid.");
                        continue;
                    }
                }

                // Meminta jumlah pesanan menggunakan if
                System.out.print("Masukkan jumlah pesanan: ");
                jumlah = scanner.nextInt();
                if (jumlah > 0) {
                    total += hargaPilihan * jumlah;
                } else {
                    System.out.println("Jumlah pesanan tidak valid.");
                }
            }

            // Menghitung total harga dengan diskon
            if (total > 50000) {
                System.out.println("Anda mendapatkan diskon 10%.");
                diskon = total * 0.1;
            }

            // Menampilkan total harga
            System.out.println("Harga Awal: Rp " + total);
            System.out.println("Total harga: Rp " + (total - diskon));

            // Melakukan konfirmasi pembelian menggunakan do-while
            String konfirmasi;
            do {
                System.out.print("Apakah Anda ingin melanjutkan pembelian (ya/tidak)? ");
                konfirmasi = scanner.next();
            } while (!konfirmasi.equalsIgnoreCase("ya") && !konfirmasi.equalsIgnoreCase("tidak"));

            if (konfirmasi.equalsIgnoreCase("ya")) {
                System.out.println("Terima kasih telah berbelanja di Warung Kronjo!");
            } else {
                System.out.println("Pembelian dibatalkan.");
            }
        }
    }
}
