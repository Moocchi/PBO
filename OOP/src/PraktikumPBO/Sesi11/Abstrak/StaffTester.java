package PraktikumPBO.Sesi11.Abstrak;

public class StaffTester {
    public static void main(String[] args) {
        Staff s= new Staff("Januar", "123456", "Keuangan");
        s.kirimEmail(" @test.com", "test", "test");
        System.out.println("NIP                 : " + s.getNIP());
        System.out.println("Nama                : " + s.getNama());
        System.out.println("Bagian              : " + s.getBagian());
    }
}
