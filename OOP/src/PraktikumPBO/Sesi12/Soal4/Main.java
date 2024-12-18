package PraktikumPBO.Sesi12.Soal4;

public class Main {
    public static void main(String[] args) {
        // Objek Mamalia
        Mamalia mamalia = new Mamalia("Singa");
        mamalia.setJenisMamalia("Karnivora");
        mamalia.setBisaJalan(true);
        mamalia.setJumlahKaki(4);
        mamalia.displayInfo();

        System.out.println();

        // Objek Ayam
        Ayam ayam = new Ayam("Ayam Bangkok", 2);
        ayam.setJenisAyam("Petarung");
        ayam.setBisaDiadu(true);
        ayam.setBisaTerbang(false);
        ayam.displayInfo();

        System.out.println();

        // Objek Merpati
        Merpati merpati = new Merpati("Merpati Pos", 1);
        merpati.setBisaTerbang(true);
        merpati.displayInfo();
    }
}
