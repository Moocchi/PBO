package PraktikumPBO.Sesi13.Tugas1;

import java.util.*;

public class HapusWarna {
    public static void main(String[] args) {
        // Membuat dua objek List warna dan warnaDihapus
        List<String> warna = new ArrayList<>();
        List<String> warnaDihapus = new ArrayList<>();
        
        // Menambahkan warna ke list warna
        warna.add("MAGENTA");
        warna.add("RED");
        warna.add("WHITE");
        warna.add("BLUE");
        warna.add("CYAN");
        
        // Menambahkan warna ke list warnaDihapus
        warnaDihapus.add("RED");
        warnaDihapus.add("WHITE");
        warnaDihapus.add("BLUE");
        
        // Menampilkan warna awal
        System.out.println("Warna Sebelum Dihapus: " + warna);
        
        // Menghapus warna yang ada di warnaDihapus dari list warna
        warna.removeAll(warnaDihapus);
        
        // Menampilkan warna setelah penghapusan
        System.out.println("Warna Setelah Dihapus: " + warna);
    }
}
