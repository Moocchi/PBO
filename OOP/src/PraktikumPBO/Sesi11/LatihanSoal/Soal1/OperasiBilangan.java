package PraktikumPBO.Sesi11.LatihanSoal.Soal1;

public abstract class OperasiBilangan {
    protected double a, b, c;

    protected void setA(double a) { this.a = a; }
    protected void setB(double b) { this.b = b; }
    protected void setC(double c) { this.c = c; }

    protected double getA() { return a; }
    protected double getB() { return b; }
    protected double getC() { return c; }

    public abstract void tampil();
}