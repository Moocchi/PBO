package PraktikumPBO.Sesi7;

class Waktu {
    private int menitWaktu;

    // Constructor
    public Waktu(int menitWaktu) {
        this.menitWaktu = menitWaktu;
    }

    // Method untuk mengambil bagian jam dari menitWaktu
    public int getJam() {
        return menitWaktu / 60;
    }

    // Method untuk mengambil bagian menit dari menitWaktu
    public int getMenit() {
        return menitWaktu % 60;
    }

    // Method untuk mengubah bagian jam tanpa mengubah menit
    public void setJam(int j) {
        menitWaktu = (j * 60) + getMenit();
    }

    // Method untuk mengubah bagian menit tanpa mengubah jam
    public void setMenit(int m) {
        menitWaktu = (getJam() * 60) + m;
    }

    // Method untuk mengambil total menit
    public int getTotalMenit() {
        return menitWaktu;
    }

    // Method untuk menambahkan jam ke menitWaktu
    public void tambahJam(int j) {
        menitWaktu += j * 60;
    }

    // Method untuk menambahkan menit ke menitWaktu
    public void tambahMenit(int m) {
        menitWaktu += m;
    }

    // Method untuk menambahkan waktu (jam dan menit) ke menitWaktu
    public void tambahWaktu(int j, int m) {
        menitWaktu += (j * 60) + m;
    }

    // Method untuk menampilkan jam dan menit
    public void tampilWaktu() {
        System.out.println("Jam : " + getJam() + " Menit : " + getMenit());
    }
}

// Kelas utama untuk menjalankan program
public class WaktuTest {
    public static void main(String[] args) {
        Waktu waktu1 = new Waktu(150); // Contoh: 150 menit sejak 00:00
        
        // Clear the screen
        System.out.print("\033[H\033[2J");
        System.out.println("Jam Awal         : " + waktu1.getJam());
        System.out.println("Menit Awal       : " + waktu1.getMenit());
        System.out.println("Total Menit Awal : " + waktu1.getTotalMenit());

        waktu1.setJam(2);
        waktu1.setMenit(30);
        System.out.println("\nSetelah Set Jam dan Menit:");
        waktu1.tampilWaktu();

        waktu1.tambahJam(1);
        waktu1.tambahMenit(15);
        System.out.println("\nSetelah Menambah Jam dan Menit:");
        waktu1.tampilWaktu();

        waktu1.tambahWaktu(2, 45);
        System.out.println("\nSetelah Menambah Waktu (Jam dan Menit):");
        waktu1.tampilWaktu();
    }
}
