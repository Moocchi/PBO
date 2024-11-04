package PraktikumPBO.Sesi7;

class Siswa {
    private String nama;
    private int nilaiujian;

    //constructor
    public Siswa(String nama, int nilaiujian){
        this.nama = nama;
        this.nilaiujian = nilaiujian;
    }

    //getter untuk nama
    public String getnama(){
        return nama;
    }

    //setter unutk nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //getter untuk nilai ujian
    public int getNilaiUjian(){
        return nilaiujian;
    }

    //setter untuk nilai ujian
    public void setNilaiUjian(int nilaiUjian){
        if(nilaiUjian >= 0 && nilaiUjian <= 100){
            this.nilaiujian = nilaiUjian;
        } else {
            System.out.println("\nNilai Ujian harus diantara 0 sampai 100");
        }
    }

    //method untuk informasis siswa
    public void tampilkanInfo(){
        System.out.println("Nama        : " + nama);
        System.out.println("Nilai Ujian : " + nilaiujian);
    }
}

    public class SiswaTest{
        public static void main(String[] args) {
            // membuat objek siswa
            System.out.print("\033[H\033[2J");
            Siswa siswa1 = new Siswa("Radith", 100);
            siswa1.tampilkanInfo();

            //menggunakan setter untuk mengubah nama dan nilai ujian
            siswa1.setNama("Radithya");
            siswa1.setNilaiUjian(90);

            //menampilkan informasi siswa setelah diubah
            System.out.println("");
            siswa1.tampilkanInfo();

            //menguji agar nilai ujian tidak melebihi 100
            siswa1.setNilaiUjian(900);

        }
    }

    