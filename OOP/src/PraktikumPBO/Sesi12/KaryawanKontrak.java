package PraktikumPBO.Sesi12;

public class KaryawanKontrak extends Karyawan implements Bonus {
    
    private final double gajiPerJam;
    private final int jamKerja;

    public KaryawanKontrak(String nama, String id, double gajiPerJam, int jamKerja) {
        super(nama, id);
        this.gajiPerJam = gajiPerJam;
        this.jamKerja = jamKerja;
    }

    @Override
    public double hitungGaji() {
        return gajiPerJam * jamKerja;
    }

    @Override
    public double hitungBonus(double performanceScore) {
        return (gajiPerJam * jamKerja) * performanceScore * 0.05;
    }
}
