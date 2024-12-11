package PraktikumPBO.Sesi11.Abstrak;

public class Staff extends Pegawai{
    private String bagian;

    public Staff(String nama, String NIP, String bagian) {
        super(nama, NIP);
        this.bagian = bagian;
    }

    public void setBagian(String namabagian) {
        bagian = namabagian;
    }

    public String getBagian() {
        return bagian;
    }
}