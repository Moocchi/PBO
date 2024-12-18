package PraktikumPBO.Sesi12.Soal1;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("D001", "Budi Santoso");
        dosen.view();

        System.out.println("\n=== Rektor ===");
        Rektor rektor = new Rektor("R001", "Dr. Siti Aminah", 2015);
        rektor.viewRektor();

        System.out.println("\n=== Dekan ===");
        Dekan dekan = new Dekan("DE001", "Prof. Bambang", "Teknik");
        dekan.viewDekan();
    }
}
