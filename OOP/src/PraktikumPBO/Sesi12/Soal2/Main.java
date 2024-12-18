package PraktikumPBO.Sesi12.Soal2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Data Gojek ===");
        Gojek gojek = new Gojek();
        gojek.setData();
        gojek.tampil();

        System.out.println("\n=== Data Bayar ===");
        Bayar bayar = new Bayar(1002);
        bayar.setData();
        bayar.tampil();
    }
}
