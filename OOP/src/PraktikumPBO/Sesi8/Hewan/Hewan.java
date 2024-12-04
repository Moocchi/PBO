package PraktikumPBO.Sesi8.Hewan;

public class Hewan {
    protected String suara;

    public Hewan() {
        this.suara = "Suara";
    }

    public void cetakSuara() {
        System.out.println("Hewan Bersuara: " + suara);
    }
}    

class Mamalia extends Hewan {
    protected String berkembangbiak;

    public Mamalia() {
        this.berkembangbiak = "beranak";
    }

    public void cetak() {
        System.out.println("Mamalia berkembang biak dengan cara " + berkembangbiak);
    }
}

class Sapi extends Mamalia {
    protected String nama;
    protected String umur;

    public Sapi() {
        suara = "Moo";
        berkembangbiak = "beranak";
        this.nama = "Sapi";
        this.umur = "10 tahun";
    }

    @Override
    public void cetak() {
        System.out.println("=============================================");
        System.out.println("Suara                   : " + suara);
        System.out.println("Berkembang biak         : " + berkembangbiak);
        System.out.println("Nama                    : " + nama);
        System.out.println("Umur                    : " + umur);
    }
}

class Kambing extends Mamalia {
    protected String nama;
    protected String umur;

    public Kambing() {
        suara = "Mbee";
        berkembangbiak = "beranak";
        this.nama = "Kambing";
        this.umur = "5 tahun";
    }

    @Override
    public void cetak() {
        System.out.println("=============================================");
        System.out.println("Suara                   : " + suara);
        System.out.println("Berkembang biak         : " + berkembangbiak);
        System.out.println("Nama                    : " + nama);
        System.out.println("Umur                    : " + umur);
    }
}

class Unggas extends Hewan {
    protected String berkembangbiak;

    public Unggas() {
        this.berkembangbiak = "bertelur";
    }

    public void cetak() {
        System.out.println("Unggas berkembang biak dengan cara " + berkembangbiak);
    }
}

class Burung extends Unggas {
    private final String jenis;
    private final String ciri;

    public Burung() {
        suara = "Pakong";
        berkembangbiak = "bertelur";
        this.jenis = "Gagak";
        this.ciri = "Bulu Hitam";
    }

    @Override
    public void cetak() {
        System.out.println("=============================================");
        System.out.println("Suara                   : " + suara);
        System.out.println("Berkembang biak         : " + berkembangbiak);
        System.out.println("Jenis                   : " + jenis);
        System.out.println("Ciri                    : " + ciri);
    }
}

class Ayam extends Unggas {
    private final String jenis;
    private final String ciri;

    public Ayam() {
        suara = "Petok Petok";
        berkembangbiak = "bertelur";
        this.jenis = "Ayam";
        this.ciri = "Bulu Putih";
    }

    @Override
    public void cetak() {
        System.out.println("=============================================");
        System.out.println("Suara                   : " + suara);
        System.out.println("Berkembang biak         : " + berkembangbiak);
        System.out.println("Jenis                   : " + jenis);
        System.out.println("Ciri                    : " + ciri);
    }
}

class Ikan extends Hewan {
    protected String napas;

    public Ikan() {
        this.napas = "Insang";
    }

    public void cetak() {
        System.out.println("Ikan bernapas dengan " + napas);
    }
}

class Gurami extends Ikan {
    private final String ciri;
    private final String berat;

    public Gurami() {
        suara = "Glub Glub";
        napas = "Insang";
        this.ciri = "Hitam";
        this.berat = "10 kg";
    }

    @Override
    public void cetak() {
        System.out.println("=============================================");
        System.out.println("Suara                   : " + suara);
        System.out.println("Bernapas                : " + napas);
        System.out.println("Ciri                    : " + ciri);
        System.out.println("Berat                   : " + berat);
    }
}

class Lele extends Ikan {
    private final String ciri;
    private final String berat;

    public Lele() {
        suara = "Glub Glub";
        napas = "Insang";
        this.ciri = "Putih";
        this.berat = "5 kg";
    }

    @Override
    public void cetak() {
        System.out.println("=============================================");
        System.out.println("Suara                   : " + suara);
        System.out.println("Bernapas                : " + napas);
        System.out.println("Ciri                    : " + ciri);
        System.out.println("Berat                   : " + berat);
    }
}

class Pewarisan {
    public static void main(String[] args) {
        Sapi sp1 = new Sapi();
        sp1.cetak();
        System.out.println();

        Kambing kmb1 = new Kambing();
        kmb1.cetak();
        System.out.println();

        Burung br1 = new Burung();
        br1.cetak();
        System.out.println();

        Ayam ay1 = new Ayam();
        ay1.cetak();
        System.out.println();

        Gurami gr1 = new Gurami();
        gr1.cetak();
        System.out.println();

        Lele l1 = new Lele();
        l1.cetak();
    }
}
