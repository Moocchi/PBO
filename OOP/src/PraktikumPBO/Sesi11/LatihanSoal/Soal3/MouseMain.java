package PraktikumPBO.Sesi11.LatihanSoal.Soal3;

// Interfaces
interface Mouse {
    void klik_kanan();
    void klik_kiri();
}

interface Keyboard {
    void tekan_enter();
}

interface Printer {
    void cetak_data();
}

// Abstract Class
abstract class Komputer implements Mouse, Keyboard, Printer {
    public abstract void hidupkan_os();
    public abstract void matikan_os();
}

// PC Class
class PC extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("PC: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("PC: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("PC: Klik kanan dengan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("PC: Klik kiri dengan mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("PC: Tombol enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("PC: Data dicetak dengan printer");
    }
}

// Laptop Class
class Laptop extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Laptop: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("Laptop: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Laptop: Klik kanan dengan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Laptop: Klik kiri dengan mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Laptop: Tombol enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("Laptop: Data dicetak dengan printer");
    }
}

// Netbook Class
class Netbook extends Komputer {
    @Override
    public void hidupkan_os() {
        System.out.println("Netbook: OS dihidupkan");
    }

    @Override
    public void matikan_os() {
        System.out.println("Netbook: OS dimatikan");
    }

    @Override
    public void klik_kanan() {
        System.out.println("Netbook: Klik kanan dengan mouse");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Netbook: Klik kiri dengan mouse");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Netbook: Tombol enter ditekan");
    }

    @Override
    public void cetak_data() {
        System.out.println("Netbook: Data dicetak dengan printer");
    }
}

// Final Class
final class KomputerCetak {
    public void cetak(Komputer[] obj) {
        for (Komputer komputer : obj) {
            komputer.hidupkan_os();
            komputer.klik_kanan();
            komputer.klik_kiri();
            komputer.tekan_enter();
            komputer.cetak_data();
            komputer.matikan_os();
            System.out.println("---------------------");
        }
    }
}

// Main Class
public class MouseMain {
    public static void main(String[] args) {
        Komputer[] daftarKomputer = {
            new PC(),
            new Laptop(),
            new Netbook()
        };

        KomputerCetak cetak = new KomputerCetak();
        cetak.cetak(daftarKomputer);
    }
}