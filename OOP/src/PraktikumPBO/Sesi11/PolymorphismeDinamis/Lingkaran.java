package PraktikumPBO.Sesi11.PolymorphismeDinamis;

public class Lingkaran extends Bentuk {
    @Override
    protected void gambar() {
        System.out.println("subclass -> Menggambar lingkaran");
    }

    @Override
    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar lingkaran");
    }
    
}
