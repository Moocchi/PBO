package PraktikumPBO.Sesi11.PolymorphismeDinamis;

public class Elips extends Bentuk {
    
    @Override
    protected void gambar() {
        System.out.println("subclass -> Menggambar elips");
    }

    @Override
    protected void hapus() {
        System.out.println("subclass -> Menghapus Gambar elips");
    }
    
}
