package PraktikumPBO.Sesi3.Tugas;

import java.util.Scanner;

public class Kalkulator {

    public static void aritmatika(double a, double b, String operator) {
        switch (operator) {
            case "+" -> System.out.println("Hasil: " + (a + b));
            case "-" -> System.out.println("Hasil: " + (a - b));
            case "*" -> System.out.println("Hasil: " + (a * b));
            case "/" -> {
                if (b != 0) {
                    System.out.println("Hasil: " + (a / b));
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                }
            }
            default -> System.out.println("Operator tidak valid.");
        }
    }

    public static void logika(boolean a, boolean b, String operator) {
        switch (operator) {
            case "AND" -> System.out.println("Hasil: " + (a && b));
            case "OR" -> System.out.println("Hasil: " + (a || b));
            case "XOR" -> System.out.println("Hasil: " + (a ^ b));
            default -> System.out.println("Operator tidak valid.");
        }
    }

    public static void relasi(double a, double b, String operator) {
        switch (operator) {
            case "==" -> System.out.println("Hasil: " + (a == b));
            case "!=" -> System.out.println("Hasil: " + (a != b));
            case ">" -> System.out.println("Hasil: " + (a > b));
            case "<" -> System.out.println("Hasil: " + (a < b));
            case ">=" -> System.out.println("Hasil: " + (a >= b));
            case "<=" -> System.out.println("Hasil: " + (a <= b));
            default -> System.out.println("Operator tidak valid.");
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("\033[H\033[2J");
            System.out.println("Pilih operasi yang diinginkan:");
            System.out.println("1. Aritmatika (+, -, *, /)");
            System.out.println("2. Logika (AND, OR, XOR)");
            System.out.println("3. Relasi (==, !=, >, <, >=, <=)");

            System.out.print("\nPilihan: ");
            int pilihan = input.nextInt();
            

            switch (pilihan) {
                case 1 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.print("Masukkan angka pertama: ");
                    double angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka2 = input.nextDouble();
                    System.out.print("Masukkan operator (+, -, *, /): ");
                    String operator = input.next();
                    aritmatika(angka1, angka2, operator);
                }
                case 2 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.print("Masukkan nilai logika pertama (true/false): ");
                    boolean logika1 = input.nextBoolean();
                    System.out.print("Masukkan nilai logika kedua (true/false): ");
                    boolean logika2 = input.nextBoolean();
                    System.out.print("Masukkan operator logika (AND, OR, XOR): ");
                    String operator = input.next();
                    logika(logika1, logika2, operator);
                }
                case 3 -> {
                    System.out.print("\033[H\033[2J");
                    System.out.print("Masukkan angka pertama: ");
                    double angka1 = input.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double angka2 = input.nextDouble();
                    System.out.print("Masukkan operator relasi (==, !=, >, <, >=, <=): ");
                    String operator = input.next();
                    relasi(angka1, angka2, operator);
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
