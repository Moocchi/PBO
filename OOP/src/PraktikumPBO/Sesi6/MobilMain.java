package PraktikumPBO.Sesi6;

class Mobil{
    String aktifitas;
    String warna;
    int kecepatan;

    public Mobil (String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan(){
        if(kecepatan==0){
            aktifitas = "parkir";
        }else{
            aktifitas = "jalan";
        }
    }

    void cetakAtribut(){
        System.out.println("Aktifitas: "+aktifitas);
        System.out.println("Warna: "+warna);
        System.out.println("Kecepatan: "+kecepatan);
    }
}

public class MobilMain {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        Mobil m = new Mobil("parkir", "Merah", 0);
        m.cekKecepatan();
        m.cetakAtribut();
    }
}