package PraktikumPBO.Sesi13.Tugas2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Mahasiswa implements Comparable<Mahasiswa> {
    String nrp;
    String nama;
    float nilai;

    // Konstruktor untuk menginisialisasi Mahasiswa
    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    // Mengimplementasikan compareTo untuk membandingkan berdasarkan nilai (terurut dari yang tertinggi)
    @Override
    public int compareTo(Mahasiswa m) {
        return Float.compare(m.nilai, this.nilai); // Membalikkan urutan perbandingan untuk urutan tertinggi
    }

    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama + ", Nilai: " + nilai;
    }
}

public class PengurutanMahasiswa {
    public static void main(String[] args) {
        // Membuat Queue untuk menyimpan Mahasiswa
        Queue<Mahasiswa> mahasiswaQueue = new PriorityQueue<>();

        // Daftar nama mahasiswa
        String[] namaMahasiswa = {"Andi", "Budi", "Cici", "Dedi", "Rikka", "Fani", "Gita", "Hendra", "Indra", "Joko"};

        // Menambahkan 10 mahasiswa dengan nilai random antara 60-100
        for (int i = 0; i < 10; i++) {
            String nrp = String.format("%05d", i + 1);  // Format NRP dengan 5 digit
            String nama = namaMahasiswa[i];
            float nilai = ThreadLocalRandom.current().nextFloat() * (100 - 60) + 60; // Nilai random antara 60 dan 100
            mahasiswaQueue.add(new Mahasiswa(nrp, nama, nilai));
        }

        // Menampilkan data mahasiswa yang telah diurutkan berdasarkan nilai dari tertinggi ke terendah
        System.out.println("Data Mahasiswa Setelah Diurutkan Berdasarkan Nilai (Tertinggi ke Terendah):");
        while (!mahasiswaQueue.isEmpty()) {
            System.out.println(mahasiswaQueue.poll());
        }
    }
}
