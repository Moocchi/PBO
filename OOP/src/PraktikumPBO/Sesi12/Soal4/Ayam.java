package PraktikumPBO.Sesi12.Soal4;


// Class Ayam (Turunan Aves)
public class Ayam extends Aves {
    private String jenisAyam;
    private boolean bisaDiadu;

    // Constructor
    public Ayam() {
    }

    public Ayam(String nama, int ukuran) {
        super(nama, ukuran);
    }

    // Setter dan Getter
    public void setJenisAyam(String jenisAyam) {
        this.jenisAyam = jenisAyam;
    }

    public String getJenisAyam() {
        return jenisAyam;
    }

    public void setBisaDiadu(boolean bisaDiadu) {
        this.bisaDiadu = bisaDiadu;
    }

    public boolean getBisaDiadu() {
        return bisaDiadu;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ayam: " + getNama());
        System.out.println("Jenis Ayam: " + jenisAyam);
        System.out.println("Bisa Diadu: " + bisaDiadu);
    }
}
