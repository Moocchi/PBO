package PraktikumPBO.Sesi12.Soal2;

public class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar() {
        this.jarak = 0;
        this.total = 0;
        this.nama = "";
    }

    public Bayar(int id) {
        this.id = id;
    }

    @Override
    public void setData() {
        super.setData();
        this.jarak = 15; // contoh jarak
        this.nama = "Jarez";
        this.total = harga * jarak;
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Bayar: " + total);
    }

    @Override
    public int getId() {
        return id;
    }
}
