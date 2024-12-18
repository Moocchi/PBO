package PraktikumPBO.Sesi12.Soal1;

public class Rektor extends Dosen {
    private int tahunMasuk;

    public Rektor(String nik, String nama, int tahunMasuk) {
        super(nik, nama);
        this.tahunMasuk = tahunMasuk;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public void viewRektor() {
        super.view();
        System.out.println("Tahun Masuk: " + tahunMasuk);
    }
}
