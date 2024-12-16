package PraktikumPBO.Sesi11.LatihanSoal.Soal1;

public class Main {
    public static void main(String[] args) {
        double A = 10.5, B = 0.5;

        OperasiPenjumlahan penjumlahan = new OperasiPenjumlahan();
        OperasiPengurangan pengurangan = new OperasiPengurangan();
        OperasiPerkalian perkalian = new OperasiPerkalian();
        OperasiPembagian pembagian = new OperasiPembagian();
        OperasiBilanganCetak cetak = new OperasiBilanganCetak();

        System.out.println("Operasi Bilangan dengan A = " + A + " dan B = " + B + ":\n");

        cetak.cetakSemua(penjumlahan, A, B);
        cetak.cetakSemua(pengurangan, A, B);
        cetak.cetakSemua(perkalian, A, B);
        cetak.cetakSemua(pembagian, A, B);
    }
}
