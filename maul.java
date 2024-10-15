package PBO;
import java.util.Scanner;

public class maul {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

        // Tipe Data
        int number;
        String operation;
        
        // Input Data
        System.out.print("Masukkan sebuah angka: ");
        number = scanner.nextInt();

        // If Statement
        if (number % 2 == 0) {
            System.out.println(number + " adalah bilangan genap.");
        } else {
            System.out.println(number + " adalah bilangan ganjil.");
        }

        // Switch Statement
        System.out.print("Masukkan operasi (tambah, kurang, kali, bagi): ");
        operation = scanner.next();

        System.out.print("Masukkan angka kedua: ");
        int secondNumber = scanner.nextInt();

        switch (operation) {
            case "tambah" -> System.out.println("Hasil: " + (number + secondNumber));
            case "kurang" -> System.out.println("Hasil: " + (number - secondNumber));
            case "kali" -> System.out.println("Hasil: " + (number * secondNumber));
            case "bagi" -> {
                if (secondNumber != 0) {
                    System.out.println("Hasil: " + (number / secondNumber));
                } else {
                    System.out.println("Tidak dapat membagi dengan nol.");
                }
            }
            default -> System.out.println("Operasi tidak dikenali.");
        }

        // For Loop
        System.out.println("\nMenghitung dari 1 sampai 5 menggunakan for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop
        System.out.println("\nMenghitung mundur dari 5 menggunakan while loop:");
        int count = 5;
        while (count > 0) {
            System.out.println(count);
            count--;
        }

        // Do-While Loop
        System.out.println("\nMenghitung dari 1 sampai 3 menggunakan do-while loop:");
        int doWhileCount = 1;
        do {
            System.out.println(doWhileCount);
            doWhileCount++;
        } while (doWhileCount <= 3);

        // scanner is automatically closed by try-with-resources
        }
    }
}

