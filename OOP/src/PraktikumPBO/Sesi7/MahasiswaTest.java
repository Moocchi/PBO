package PraktikumPBO.Sesi7;

class Mahasiswa{
    public String nama;
    protected int usia;
    private String jurusan;

    //constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    //Getter untuk atribut Private jurusan
    public String getJurusan() {
        return jurusan;
    }

    //Setter untuk atribut Private jurusan
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    //Method menampilkan informasi

    public void tampilkanInfo() {
        System.out.println("");
        System.out.println("Nama    : " + nama);
        System.out.println("Usia    : " + usia);
        System.out.println("Jurusan : " + jurusan);
    }
}

    //kelas utama untuk menjalankan program

    public class MahasiswaTest{
        public static void main(String[] args) {

            System.out.print("\033[H\033[2J");
            Mahasiswa mahasiswa1 = new Mahasiswa("Budi", 20, "Teknik Informatika");
            
            System.out.println("Nama Mahasiswa                    :"+ mahasiswa1.nama);
            System.out.println("Usia Mahasiswa                    :"+ mahasiswa1.usia);
            System.out.println("Jurusan Mahasiswa                 :"+ mahasiswa1.getJurusan());

            mahasiswa1.setJurusan("Teknik Mesin");
            System.out.println("\nJurusan Mahasiswa Setelah diubah  :"+ mahasiswa1.getJurusan());

            mahasiswa1.tampilkanInfo();
        }
    }
