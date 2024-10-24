package PraktikumPBO.Sesi6;

class Pesawat {
    String status;
    String jenis;
    int kecepatan;

    public Pesawat(String status, String jenis, int kecepatan) {
        this.status = status;
        this.jenis = jenis;
        this.kecepatan = kecepatan;
    }

    void cekStatus() {
        if (kecepatan == 0) {
            status = "di landasan";
        } else {
            status = "terbang";
        }
    }

    void cetakAtribut() {
        System.out.println("Status          : " + status);
        System.out.println("Jenis Pesawat   : " + jenis);
        System.out.println("Kecepatan       : " + kecepatan + " km/h");
    }
}

public class PesawatMain {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Pesawat p = new Pesawat("di landasan", "Komersial", 0);
        p.cekStatus();
        p.cetakAtribut();
    }
}
