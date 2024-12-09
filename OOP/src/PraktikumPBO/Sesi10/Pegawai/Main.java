package PraktikumPBO.Sesi10.Pegawai;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk setiap subclass
        Manajer manajer = new Manajer();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Mengisi data untuk setiap objek
        manajer.nama = "Sifa";
        manajer.id_pegawai = 1;
        manajer.gaji = "Rp. 10.000.000";

        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "Rp. 5.000.000";

        koki.nama = "Rizky";
        koki.id_pegawai = 3;
        koki.gaji = "Rp. 7.000.000";

        pelayan.nama = "Rizal";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "Rp. 6.000.000";

        satpam.nama = "Iqbal";
        satpam.id_pegawai = 5;
        satpam.gaji = "Rp. 4.000.000";

        // Memanggil metode untuk setiap objek
        manajer.menampilkan();
        manajer.tugas();

        kasir.menampilkan();
        kasir.tugas();

        koki.menampilkan();
        koki.tugas();

        pelayan.menampilkan();
        pelayan.tugas();

        satpam.menampilkan();
        satpam.tugas();
    }
}
