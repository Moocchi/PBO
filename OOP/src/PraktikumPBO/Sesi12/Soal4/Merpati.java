package PraktikumPBO.Sesi12.Soal4;


// Class Merpati (Turunan Aves)
public class Merpati extends Aves {
    // Constructor
    public Merpati(String nama, int ukuran) {
        super(nama, ukuran);
    }

    @Override
    public void displayInfo() {
        System.out.println("Merpati: " + getNama());
        System.out.println("Bisa Terbang: " + getBisaTerbang());
    }
}
