package PraktikumPBO.Sesi11.StudiKasus;

public class KaryawanTetap extends Karyawan implements Bonus {
    
    private final double gajiBulanan;

    public KaryawanTetap(String nama, String id, double gajiBulanan) {
        super(nama, id);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan;
    }

    @Override
    public double hitungBonus(double performanceScore) {
        return gajiBulanan * performanceScore * 0.1;
    }
}
