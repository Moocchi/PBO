package PraktikumPBO.Sesi12.Soal2;

public class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    @Override
    public void tampil() {
        System.out.println("ID: " + id);
        System.out.println("Harga: " + harga);
    }

    @Override
    public void setData() {
        this.id = 1001;
        this.harga = 50000;
    }

    @Override
    public int getId() {
        return id;
    }
}
