package PraktikumPBO.Sesi11.LatihanSoal.Soal2;

public class OperasiPenjumlahan extends OperasiBilangan {
    @Override
    public void tampil() {
        setC(getA() + getB());
        System.out.println("Hasil Penjumlahan : " + getC());
    }
}