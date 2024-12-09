package PraktikumPBO.Sesi10.Pegawai;

public class Manajer extends Pegawai {

    @Override
    public void menampilkan() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + id_pegawai);
        System.out.println("Gaji       : " + gaji);
    }

    public void tugas() {
        System.out.println("Tugas      : Manager bertugas mengelola perusahaan.");
        System.out.println("-----------------------------------------------------");
    }
}
