package PraktikumPBO.Sesi4.Looping;

public class PolaSegitigaTerbalik {
    public static void main(String[] args) {
        int tinggi = 5;

        // Looping untuk tiap baris
        for (int i = tinggi; i >= 1; i--) {
            // Looping untuk spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Looping untuk bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Pindah ke baris baru
            System.out.println();
        }
    }
}
