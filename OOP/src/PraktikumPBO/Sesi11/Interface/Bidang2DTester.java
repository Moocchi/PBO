package PraktikumPBO.Sesi11.Interface;

public class Bidang2DTester {
    public static void main(String[] s) {
        Lingkaran l = new Lingkaran();
        PersegiPanjang p = new PersegiPanjang();
        l.radius = 10;

        System.out.println("Lingkaran Dengan Radius         : " + l.radius);
        System.out.println("Luas                            : " + l.getLuas());
        System.out.println("Keliling                        : " + l.getKeliling());

        p.panjang = 5;
        p.lebar = 6;

        System.out.println("Persegi Panjang Dengan Panjang  : " + p.panjang );
        System.out.println("Lebar                           : " + p.lebar);
        System.out.println("Luas                            : " + p.getLuas());
    }
}
