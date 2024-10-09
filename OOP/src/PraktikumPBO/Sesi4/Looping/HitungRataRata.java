package PraktikumPBO.Sesi4.Looping;

import java.util.Scanner;

public class HitungRataRata {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahNilai = 0;
            double totalNilai = 0;
            char lanjut;

            do {
                System.out.print("Masukkan nilai: ");
                double nilai = input.nextDouble();
                totalNilai += nilai;
                jumlahNilai++;

                System.out.print("Apakah Anda ingin memasukkan nilai lain? (Y/N): ");
                lanjut = input.next().charAt(0);
            } while (lanjut != 'n' && lanjut != 'N');

            double rataRata = totalNilai / jumlahNilai;

            System.out.println("Total Nilai: " + totalNilai);
            System.out.println("Rata-rata Nilai: " + rataRata);
        }
    }
}
