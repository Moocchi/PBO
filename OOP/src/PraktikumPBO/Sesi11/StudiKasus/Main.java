package PraktikumPBO.Sesi11.StudiKasus;

final public class Main {
    public static void main(String[] args) {
        // Membuat objek karyawan tetap
        Karyawan karyawanTetap = new KaryawanTetap("Jarez", "T001", 5000000);
        // Membuat objek karyawan kontrak
        Karyawan karyawanKontrak = new KaryawanKontrak("Rikka", "C001", 5000, 160);

        // Menampilkan informasi karyawan tetap
        karyawanTetap.tampilkanInfo();
        System.out.println("Gaji        : " + karyawanTetap.hitungGaji());
        System.out.println("Bonus       : " + ((Bonus) karyawanTetap).hitungBonus(0.8));
        System.out.println();

        // Menampilkan informasi karyawan kontrak
        karyawanKontrak.tampilkanInfo();
        System.out.println("Gaji        : " + karyawanKontrak.hitungGaji());
        System.out.println("Bonus       : " + ((Bonus) karyawanKontrak).hitungBonus(0.9));
    }
}
