package PraktikumPBO.Sesi11.LatihanSoal.Soal1;

public class OperasiPengurangan extends OperasiBilangan {
    @Override
    public void tampil() {
        setC(getA() - getB());
        System.out.println("Hasil Pengurangan : " + getC());
    }
}