package PraktikumPBO.Sesi10.Pegawai;

public class Koki extends Pegawai {
    
    @Override
    public void menampilkan() {
        System.out.println("Nama       : " + nama);
        System.out.println("ID Pegawai : " + id_pegawai);
        System.out.println("Gaji       : " + gaji);
    }
    
    public void tugas(){
        System.out.println("Tugas      : Memasak makanan dan Membuat Minuman");
        System.out.println("-----------------------------------------------------");
    }
}
