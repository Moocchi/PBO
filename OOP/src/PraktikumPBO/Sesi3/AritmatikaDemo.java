package PraktikumPBO.Sesi3;

public class AritmatikaDemo {
    public static void main(String[] args) {
        int i = 37;
        int j = 42;
        double x = 27.475;
        double y = 7.22;

        System.out.print("\033[H\033[2J");
        System.out.println("Variable values...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" x = " + x);
        System.out.println(" y = " + y);

        //penjumlahan angka
        System.out.println("Adding...");
        System.out.println(" i + j = " + (i + j));
        System.out.println(" x + y = " + (x + y));

        //pengurangan angka
        System.out.println("Subtracting...");
        System.out.println(" i - j = " + (i - j));
        System.out.println(" x - y = " + (x - y));

        //perkalian angka
        System.out.println("Multiplying...");
        System.out.println(" i * j = " + (i * j));
        System.out.println(" x * y = " + (x * y));

        //pembagi angka
        System.out.println("Dividing...");
        System.out.println(" i / j = " + (i / j));
        System.out.println(" x / y = " + (x / y));

        //menghitung hasil modulus dari pembagian
        System.out.println("Computing the remainder...");
        System.out.println(" i % j = " + (i % j));
        System.out.println(" x % y = " + (x % y));

        //tipe penggabungan
        System.out.println("Mixing types...");
        System.out.println(" j + y = " + (j + y));
        System.out.println(" i * x = " + (i * x));
    }
}