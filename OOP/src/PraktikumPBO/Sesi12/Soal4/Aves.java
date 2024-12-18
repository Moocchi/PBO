package PraktikumPBO.Sesi12.Soal4;

// Class Aves (Turunan Animal)
public class Aves extends Animal {
    private String jenisAves;
    private boolean bisaTerbang;

    // Constructor
    public Aves() {
    }

    public Aves(String nama, int ukuran) {
        setNama(nama);
        setUkuran(ukuran);
    }

    // Setter dan Getter
    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }

    @Override
    public void displayInfo() {
        System.out.println("Aves: " + getNama());
        System.out.println("Jenis Aves: " + jenisAves);
        System.out.println("Bisa Terbang: " + bisaTerbang);
    }
}

