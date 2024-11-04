package PraktikumPBO.Sesi7;

class Mobil {
    public String merek;
    protected int tahunProduksi;
    private double harga;

    //constructor
    public Mobil(String merek, int tahunProduksi, double harga) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    //getter untuk atribut Private harga
    public double getHarga() {
        return harga;
    }

    //setter untuk atribut Private harga
    public void setHarga(double hargaBaru) {
        if (hargaBaru >= 0) {
            this.harga = hargaBaru;
        } else {
            System.out.println("\nHarga tidak boleh negatif");
        }
    }

    public void tampilkanInfoMobil() {
        System.out.println("");
        System.out.println("Merek Mobil    : " + merek);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.printf("Harga          : %.0f%n", harga);
    }
}

//kelas utama untuk menjalankan program
public class Mobilcek {
    public static void main(String[] args) {
        //membuat objek mobil
        System.out.print("\033[H\033[2J");
        Mobil mobil1 = new Mobil("Toyota", 2020, 200000000);

        //mengakses atribut public
        System.out.println("Merk Mobil     : " + mobil1.merek);

        //mengaksess atribut protected
        System.out.println("Tahun Produksi : " + mobil1.tahunProduksi);

        //mengakses atribut private
        System.out.printf("Harga Mobil    : %.0f%n", mobil1.getHarga());

        //mengubah harga mobil
        mobil1.setHarga(250000000);
        System.out.printf("\nHarga Mobil Setelah diubah : %.0f%n", mobil1.getHarga());

        //menampilkan informasi mobil
        mobil1.tampilkanInfoMobil();
    }
}