package PraktikumPBO.Sesi4.Looping;

public class JumlahMatriks {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int jumlah = 0;

        // Looping untuk menghitung jumlah elemen dalam matriks
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                jumlah += elemen;
            }
        }

        System.out.println("Jumlah elemen dalam matriks: " + jumlah);
    }
}
