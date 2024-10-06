package PraktikumPBO.Sesi3;
public class AritmatikaJava {
    public static void main(String[] args) {
        int angka1 = 37;
        int angka2 = 42;
        
        double x = 27.475;
        double y = 7.22;

        int hasilTambahInt = angka1 + angka2;
        double hasilTambahDouble = x + y;
        System.out.print("\033[H\033[2J");
        System.out.println("Hasil Penjumlahan (int): " + angka1 + " + " + angka2 + " = " + hasilTambahInt);
        System.out.println("Hasil Penjumlahan (double): " + x + " + " + y + " = " + hasilTambahDouble);

        int hasilKurangInt = angka1 - angka2;
        double hasilKurangDouble = x - y;
        System.out.println("Hasil Pengurangan (int): " + angka1 + " - " + angka2 + " = " + hasilKurangInt);
        System.out.println("Hasil Pengurangan (double): " + x + " - " + y + " = " + hasilKurangDouble);

        int hasilKaliInt = angka1 * angka2;
        double hasilKaliDouble = x * y;
        System.out.println("Hasil Perkalian (int): " + angka1 + " * " + angka2 + " = " + hasilKaliInt);
        System.out.println("Hasil Perkalian (double): " + x + " * " + y + " = " + hasilKaliDouble);

        int hasilBagiInt = angka1 / angka2;
        double hasilBagiDouble = x / y;
        System.out.println("Hasil Pembagian (int): " + angka1 + " : " + angka2 + " = " + hasilBagiInt);
        System.out.println("Hasil Pembagian (double): " + x + " : " + y + " = " + hasilBagiDouble);

        int hasilModulusInt = angka1 % angka2;
        double hasilModulusDouble = x % y;
        System.out.println("Hasil Modulus (int): " + angka1 + " % " + angka2 + " = " + hasilModulusInt);
        System.out.println("Hasil Modulus (double): " + x + " % " + y + " = " + hasilModulusDouble);
    }
}