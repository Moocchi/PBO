package PraktikumPBO.Sesi11.Abstrak;

public abstract class Pegawai {
    private final String NIP; 
    private final String Nama;

    public Pegawai (String NIP, String Nama) {
        this.NIP = NIP;
        this.Nama = Nama;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIP() {
        return NIP;
    }

    public void kirimEmail(String to, String Subjek, String isi) {
        System.out.println("Email terkirim ke   : " + to );
        System.out.println("Subjek              : " + Subjek);
        System.out.println("Isi                 : " + isi);
    }
}