package PraktikumPBO.Sesi11.LatihanSoal.Soal1;

public class OperasiPembagian extends OperasiBilangan {
    @Override
    public void tampil() {
        if (getB() != 0) {
            setC(getA() / getB());
            System.out.println("Hasil Pembagian   : " + getC());
        } else {
            System.out.println("Error: Pembagian oleh nol tidak diperbolehkan.");
        }
    }
}