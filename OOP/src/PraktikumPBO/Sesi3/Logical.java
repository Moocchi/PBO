package PraktikumPBO.Sesi3;

public class Logical {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.print("\033[H\033[2J");
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}