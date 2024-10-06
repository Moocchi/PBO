# AritmatikaDemo

Program Java ini mendemonstrasikan operasi aritmatika dasar pada angka integer dan floating-point.

## Penjelasan Kode

Program ini melakukan operasi berikut:
- **Penjumlahan** (`+`)
- **Pengurangan** (`-`)
- **Perkalian** (`*`)
- **Pembagian** (`/`)
- **Modulus** (`%`)

### Struktur Program

1. **Package**: 
   - `Package PraktikumPBO.Sesi3` mendefinisikan bahwa kelas ini berada dalam package bernama `PraktikumPBO.Sesi3`. Package adalah cara untuk mengelompokkan kelas-kelas dalam Java agar lebih terorganisir. 
   - Dengan menggunakan package, kita bisa menghindari konflik nama antara kelas-kelas yang mungkin memiliki nama sama tetapi berada di package yang berbeda.

2. **Kelas `AritmatikaDemo`**:
   - `public class AritmatikaDemo` mendefinisikan sebuah kelas bernama `AritmatikaDemo`. 
   - Kata kunci **`public`** berarti kelas ini bisa diakses dari kelas lain di luar package-nya. 
   - **`class`** adalah kata kunci untuk mendefinisikan sebuah kelas, yang merupakan cetak biru (blueprint) dari objek.

3. **`public static void main(String[] args)`**:
   - Metode ini adalah **titik awal** eksekusi program di Java. 
   - **`public`**: Metode ini bisa diakses dari mana saja.
   - **`static`**: Metode ini milik kelas itu sendiri dan bisa dipanggil tanpa membuat objek dari kelas tersebut.
   - **`void`**: Metode ini tidak mengembalikan nilai apa pun.
   - **`main`**: Nama dari metode yang wajib ada di setiap program Java untuk memulai eksekusi.

4. **`System.out.print("\033[H\033[2J");`**:
   - Baris ini digunakan untuk membersihkan layar terminal atau console sebelum menampilkan hasil dari operasi aritmatika. 
   - **`\033[H\033[2J`** adalah escape sequence yang digunakan untuk mengatur tampilan di terminal. Secara spesifik, kombinasi ini bekerja seperti perintah untuk membersihkan layar pada banyak terminal yang mendukung kontrol ANSI escape.
   - **`System.out.print`** adalah perintah untuk mencetak teks ke layar tanpa pindah ke baris baru setelah mencetak.

### Variabel
- `i`, `j`: Variabel integer, diinisialisasi dengan nilai `37` dan `42`.
- `x`, `y`: Variabel floating-point (double), diinisialisasi dengan nilai `27.475` dan `7.22`.

### Operasi Aritmatika

1. **Penjumlahan**: Menambahkan dua angka.
   - `i + j` menambahkan integer `i` dan `j`.
   - `x + y` menambahkan angka floating-point `x` dan `y`.

2. **Pengurangan**: Mengurangkan angka kedua dari angka pertama.
   - `i - j` mengurangi `j` dari `i`.
   - `x - y` mengurangi `y` dari `x`.

3. **Perkalian**: Mengalikan dua angka.
   - `i * j` mengalikan integer `i` dan `j`.
   - `x * y` mengalikan angka floating-point `x` dan `y`.

4. **Pembagian**: Membagi angka pertama dengan angka kedua.
   - `i / j` membagi `i` dengan `j` (pembagian integer, hasilnya juga integer).
   - `x / y` membagi `x` dengan `y` (pembagian floating-point).

5. **Modulus**: Menghitung sisa dari pembagian.
   - `i % j` menghitung sisa pembagian `i` dengan `j`.
   - `x % y` menghitung sisa pembagian `x` dengan `y`.

6. **Penggabungan Tipe**:
   - Program ini juga menunjukkan penggabungan tipe data yang berbeda, misalnya `j + y` (integer + double) dan `i * x` (integer * double).

### Kesimpulan
Program ini menunjukkan bagaimana melakukan operasi aritmatika dasar (penjumlahan, pengurangan, perkalian, pembagian, dan modulus) pada tipe data `int` dan `double`, serta bagaimana Java menangani operasi antara dua tipe data yang berbeda.