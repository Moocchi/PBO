package PraktikumPBO.Sesi12.Soal4;

// Class Mamalia (Turunan Animal)
public class Mamalia extends Animal {
    //private String jalan;
    private String jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    // Constructor
    public Mamalia() {
    }

    public Mamalia(String nama) {
        setNama(nama);
    }

    // Setter dan Getter
    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }

    @Override
    public void displayInfo() {
        System.out.println("Mamalia: " + getNama());
        System.out.println("Jenis Mamalia: " + jenisMamalia);
        System.out.println("Bisa Jalan: " + bisaJalan);
        System.out.println("Jumlah Kaki: " + jumlahKaki);
    }
}

