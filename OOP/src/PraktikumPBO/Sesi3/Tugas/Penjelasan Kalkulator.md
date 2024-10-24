# Dokumentasi Program Kalkulator

Program Java ini mengimplementasikan kalkulator sederhana yang melakukan operasi aritmatika, logika, dan relasi berdasarkan input pengguna. Program ini terstruktur menggunakan metode untuk setiap jenis operasi dan memanfaatkan kelas `Scanner` dari Java untuk input.

## Deklarasi Paket
```java
package PraktikumPBO.Sesi3;
```
Kata kunci `package` digunakan untuk mendeklarasikan sebuah paket, yang merupakan ruang nama yang mengorganisir sekumpulan kelas dan antarmuka yang saling terkait. Dalam kasus ini, program merupakan bagian dari paket `PraktikumPBO.Sesi3`, yang menunjukkan bahwa ia termasuk dalam proyek atau modul tertentu yang berkaitan dengan sesi praktikum Pemrograman Berorientasi Objek (PBO).

## Pernyataan Import
```java
import java.util.Scanner;
```
Pernyataan `import` memungkinkan program untuk menggunakan kelas dari paket lain. Di sini, kelas `Scanner` dari paket `java.util` diimpor, yang sangat penting untuk membaca input pengguna dari konsol. Ini memungkinkan program untuk menangkap berbagai tipe data seperti integer, double, dan boolean.

## Kode Membersihkan Layar untuk Linux
```java
System.out.print("\033[H\033[2J");
```
Baris kode ini digunakan untuk membersihkan layar konsol di terminal Linux. Ia mengirimkan urutan pelarian tertentu ke terminal:

- `\033[H` memindahkan kursor ke sudut kiri atas layar.
- `\033[2J` membersihkan seluruh layar.

Fitur ini meningkatkan pengalaman pengguna dengan memberikan antarmuka yang bersih untuk setiap prompt operasi.

## Switch Case di Java 21
Program ini memanfaatkan pernyataan `switch` untuk menangani beberapa kondisi berdasarkan input pengguna. Berikut adalah cara strukturnya:

### Contoh Switch Case
```java
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
```
### Penjelasan
- **Sintaks**: Ekspresi switch dapat mengevaluasi berbagai kasus, dan operator `->` digunakan dalam Java 21 untuk mendefinisikan tindakan untuk setiap kasus dengan cara yang lebih ringkas.
- **Fall-through**: Dalam implementasi ini, setiap kasus bersifat independen, dan tidak ada fall-through, berarti sekali sebuah kasus cocok, program akan menjalankan bloknya dan keluar dari pernyataan switch.
- **Kasus Default**: Kasus `default` menangani input apa pun yang tidak cocok dengan kasus yang ditentukan, memastikan bahwa program dapat memberikan umpan balik tentang input yang tidak valid.

## Struktur Program
Berikut adalah keseluruhan kode dari program kalkulator:

```java
package PraktikumPBO.Sesi3;

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
```

## Kesimpulan
Program `Kalkulator` secara efektif menunjukkan cara memanfaatkan sistem paket Java, penanganan input dengan kelas `Scanner`, manipulasi konsol untuk antarmuka pengguna yang lebih baik, dan struktur switch-case untuk pengambilan keputusan yang jelas dan terorganisir. Struktur ini memungkinkan untuk perluasan dan pemeliharaan kode yang mudah saat fitur atau operasi tambahan dapat ditambahkan dengan mulus.