package PraktikumPBO.Sesi5;
import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
        } while(angka != 0);
        System.out.println("Keluar");
    input.close();
    }

}
