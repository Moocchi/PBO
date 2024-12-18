package PraktikumPBO.Sesi12.Soal4;


// Abstract Class Animal
public abstract class Animal implements Behavior {
    private String nama;
    private String sifat;
    private int ukuran;

    // Setter dan Getter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getSifat() {
        return sifat;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        return ukuran;
    }

    // Abstract method
    public abstract void displayInfo();
}
