package PraktikumPBO.Sesi3;

public class Relasi {
    public static void main(String[] args) {
    
    int i = 37;
    int j = 42;
    int k = 42;

    System.out.print("\033[H\033[2J");
    System.out.println("Nilai variabel...\n");
    System.out.println("i = " + i);
    System.out.println("j = " + j);
    System.out.println("k = " + k);
    
    System.out.println("Lebih besar...\n");
    System.out.println("i > j = " + (i > j));
    System.out.println("j > i = " + (j > i));
    System.out.println("k > j = " + (k > j));

    System.out.println("Lebih besar atau sama dengan...\n");
    System.out.println("i >= j = " + (i >= j));
    System.out.println("j >= i = " + (j >= i));
    System.out.println("k >= j = " + (k >= j));

    System.out.println("Lebih kecil...\n");
    System.out.println("i < j = " + (i < j));
    System.out.println("j < i = " + (j < i));
    System.out.println("k < j = " + (k < j));

    System.out.println("Lebih kecil atau sama dengan...\n");
    System.out.println("i <= j = " + (i <= j));
    System.out.println("j <= i = " + (j <= i));
    System.out.println("k <= j = " + (k <= j));

    System.out.println("Sama dengan...\n");
    System.out.println("i == j = " + (i == j));
    System.out.println("k == j = " + (k == j));
    System.out.println("k == k = " + (k == k));

    System.out.println("Tidak sama dengan...\n");
    System.out.println("i != j = " + (i != j));
    System.out.println("k != j = " + (k != j));
    System.out.println("k != k = " + (k != k));
    }
}