package PraktikumPBO.Sesi5;
import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas bawah: ");
        int bawah = input.nextInt();

        System.out.print("Masukkan batas atas: ");
        int atas = input.nextInt();

        System.out.println("Bilangan Genap:");
        for (int i = bawah; i <= atas; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("Bilangan Ganjil:");
        for (int i = bawah; i <= atas; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        input.close();

    }
}
