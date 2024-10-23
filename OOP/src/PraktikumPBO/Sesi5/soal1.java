package PraktikumPBO.Sesi5;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if(angka >= 1) {
            System.out.println("Angka yang dimasukkan adalah bilangan positif");
        } else if(angka <= -1) {
            System.out.println("Angka yang dimasukkan adalah bilangan negatif");
        } else if(angka == 0) {
            System.out.println("Angka yang dimasukkan adalah nol");
        } else {
            System.out.println("Angka yang dimasukkan bukan angka");
            input.close();
        }
    }
}
