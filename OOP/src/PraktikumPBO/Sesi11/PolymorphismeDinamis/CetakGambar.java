package PraktikumPBO.Sesi11.PolymorphismeDinamis;

public class CetakGambar extends Bentuk {
    private void tampil(Bentuk[] obj){
        for (Bentuk bentuk : obj) {
            bentuk.gambar();
            bentuk.hapus();
            System.out.println("==================================");
        }
    }

    public static void main(String[] args) {
        Bentuk[] obj = {new Bentuk(), new Elips(), new Lingkaran()};

        CetakGambar cetak = new CetakGambar();

        cetak.gambar();
        cetak.hapus();
        System.out.println("==================================");

        cetak.tampil(obj);
    }
    
}
