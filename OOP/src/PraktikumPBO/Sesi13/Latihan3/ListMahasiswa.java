package PraktikumPBO.Sesi13.Latihan3;

import java.util.*;

class Mahasiswa implements Comparable<Mahasiswa> {
    String nrp;
    String nama;

    // Konstruktor untuk menginisialisasi NRP dan nama
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Mengimplementasikan method compareTo untuk membandingkan berdasarkan NRP
    @Override
    public int compareTo(Mahasiswa m) {
        return this.nrp.compareTo(m.nrp); // Mengurutkan berdasarkan NRP
    }

    @Override
    public String toString() {
        return "NRP: " + nrp + ", Nama: " + nama;
    }
}

public class ListMahasiswa {
    public static void main(String[] args) {
        // Membuat List Mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<>();

        // Menambahkan data Mahasiswa ke dalam list
        mahasiswaList.add(new Mahasiswa("12345", "Andi"));
        mahasiswaList.add(new Mahasiswa("67890", "Budi"));
        mahasiswaList.add(new Mahasiswa("23456", "Cici"));
        mahasiswaList.add(new Mahasiswa("34567", "Dedi"));
        mahasiswaList.add(new Mahasiswa("45678", "Eka"));

        // Tampilkan data yang terdapat pada list
        System.out.println("Data Mahasiswa Awal:");
        System.out.println(mahasiswaList);

        // Balikkan data yang terdapat pada list
        Collections.reverse(mahasiswaList);
        System.out.println("\nData Setelah Dibalik:");
        System.out.println(mahasiswaList);

        // Acak data tersebut
        Collections.shuffle(mahasiswaList);
        System.out.println("\nData Setelah Diacak:");
        System.out.println(mahasiswaList);

        // Urutkan data berdasarkan NRP
        Collections.sort(mahasiswaList);
        System.out.println("\nData Setelah Diurutkan Berdasarkan NRP:");
        System.out.println(mahasiswaList);
    }
}
