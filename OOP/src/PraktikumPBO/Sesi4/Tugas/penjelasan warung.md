# Warung Program

## Deklarasi Paket dan Import
Program ini menggunakan paket `PraktikumPBO.Sesi4.Tugas` dan mengimpor kelas `Scanner` dari pustaka `java.util.Scanner`. Scanner digunakan untuk membaca input dari pengguna, seperti pilihan menu dan jumlah pesanan.

## Struktur Program
Program memiliki kelas utama bernama `Warung` yang mengandung fungsi `main`. Fungsi ini berperan sebagai titik awal dari eksekusi program dan berisi seluruh logika untuk:
- Menampilkan menu warung
- Mengelola pilihan pengguna
- Menghitung total harga pesanan dan diskon
- Mengonfirmasi pembelian

## Variabel yang Digunakan
Program menggunakan beberapa variabel untuk menyimpan data dan menjalankan proses:
- `menu`: Array string yang berisi nama-nama makanan yang tersedia di warung.
- `harga`: Array double yang menyimpan harga masing-masing makanan.
- `pilihan`: Integer untuk menyimpan input pilihan menu dari pengguna.
- `jumlah`: Integer untuk menyimpan jumlah pesanan dari pengguna.
- `total`: Double untuk menghitung total harga pesanan.
- `diskon`: Double untuk menghitung diskon jika pesanan memenuhi syarat.

## Fitur Utama Program

### a. Menampilkan Menu
Program menggunakan loop `for` untuk menampilkan daftar menu yang tersedia dengan harga masing-masing:
```java
for (int i = 0; i < menu.length; i++) {
    System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
}
```
## b. Memilih Menu
Pengguna diminta untuk memilih menu dengan memasukkan angka sesuai nomor menu. Pilihan ini ditangani menggunakan struktur switch:

```java
switch (pilihan) {
    case 1 -> hargaPilihan = harga[0];
    case 2 -> hargaPilihan = harga[1];
    case 3 -> hargaPilihan = harga[2];
    default -> System.out.println("Pilihan tidak valid.");
}
```
## c. Memasukkan Jumlah Pesanan
Setelah memilih menu, pengguna memasukkan jumlah pesanan. Jika jumlah yang dimasukkan valid, harga akan ditambahkan ke total harga

```java
if (jumlah > 0) {
    total += hargaPilihan * jumlah;
} else {
    System.out.println("Jumlah pesanan tidak valid.");
}

```

## d.Menghitung Diskon
Jika total harga melebihi Rp 50.000, program memberikan diskon 10%
```java
if (total > 50000) {
    diskon = total * 0.1;
}
```

## e.Konfirmasi Pembelian
Setelah menampilkan total harga, program meminta konfirmasi pembelian dari pengguna menggunakan loop do-while:
```java
do {
    System.out.print("Apakah Anda ingin melanjutkan pembelian (ya/tidak)? ");
    konfirmasi = scanner.next();
} while (!konfirmasi.equalsIgnoreCase("ya") && !konfirmasi.equalsIgnoreCase("tidak"));
```