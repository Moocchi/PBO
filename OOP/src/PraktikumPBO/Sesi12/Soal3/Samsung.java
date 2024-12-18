package PraktikumPBO.Sesi12.Soal3;

public class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Nyalakan dulu Samsung.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Nyalakan dulu Samsung.");
        }
    }

    public int getVolume() {
        return volume;
    }
}
