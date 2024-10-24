package PraktikumPBO.Sesi6;

class BintangFilm{
    private final String nama;
    private final Boolean pria;

    BintangFilm(String nama, Boolean pria){
        this.nama = nama;
        this.pria = pria;
    }

    String ProlehNama(){
        return(nama);
    }

    String ProlehJenisKelamin(){
        if(pria){
            return("pria");
        }else{
            return("wanita");
        }
    }
}

public class ClassBintangFilm {
    public static void main(String[] args){
        BintangFilm siA = new BintangFilm("Iqbal",true);
        BintangFilm siB = new BintangFilm("Bima", true);

        System.out.println("Nama : " + siA.ProlehNama() + "\tJenis Kelamin : " + siA.ProlehJenisKelamin());
        System.out.println("Nama : " + siB.ProlehNama() + "\tJenis Kelamin : " + siB.ProlehJenisKelamin());
    }
}
