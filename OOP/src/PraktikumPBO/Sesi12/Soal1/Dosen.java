package PraktikumPBO.Sesi12.Soal1;

public class Dosen {
    private String nik;
    private String nama;

    public Dosen(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public void view() {
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
    }
}
