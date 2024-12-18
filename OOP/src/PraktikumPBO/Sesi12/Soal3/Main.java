package PraktikumPBO.Sesi12.Soal3;

public class Main {
    public static void main(String[] args) {
        // Objek phone dari berbagai merek
        Phone xiaomi = new Xiaomi();
        Phone iphone = new iPhone();
        Phone samsung = new Samsung();
        Phone oppo = new Oppo();

        // PhoneUser menggunakan Xiaomi
        System.out.println("=== Menggunakan Xiaomi ===");
        PhoneUser userXiaomi = new PhoneUser(xiaomi);
        userXiaomi.turnOnThePhone();
        userXiaomi.makePhoneLouder();
        userXiaomi.makePhoneLouder();
        userXiaomi.makePhoneSilent();
        userXiaomi.turnOffThePhone();

        // PhoneUser menggunakan iPhone
        System.out.println("\n=== Menggunakan iPhone ===");
        PhoneUser userIphone = new PhoneUser(iphone);
        userIphone.turnOnThePhone();
        userIphone.makePhoneLouder();
        userIphone.makePhoneSilent();
        userIphone.turnOffThePhone();

        // PhoneUser menggunakan Samsung
        System.out.println("\n=== Menggunakan Samsung ===");
        PhoneUser userSamsung = new PhoneUser(samsung);
        userSamsung.turnOnThePhone();
        userSamsung.makePhoneLouder();
        userSamsung.makePhoneSilent();
        userSamsung.turnOffThePhone();

        // PhoneUser menggunakan Oppo
        System.out.println("\n=== Menggunakan Oppo ===");
        PhoneUser userOppo = new PhoneUser(oppo);
        userOppo.turnOnThePhone();
        userOppo.makePhoneLouder();
        userOppo.makePhoneLouder();
        userOppo.makePhoneSilent();
        userOppo.turnOffThePhone();
    }
}
