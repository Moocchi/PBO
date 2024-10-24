package PraktikumPBO.Sesi4.IF;

import java.util.Scanner;

public class HitungGrade {
    public static void main(String[] args) {
        //Membuat variabel dan scanner
        int nilai;
        String grade;
        try (Scanner scan = new Scanner(System.in)) {
            //mengambil input
            System.out.print("Inputkan Nilai: ");
            nilai = scan.nextInt();
            //menghitung gradenya
            if (nilai >= 90) {
                grade = "A";
            } else if (nilai >= 80) {
                grade = "B+";
            } else if (nilai >= 70) {
                grade = "B";
            } else if (nilai >= 60) {
                grade = "C+";
            } else if (nilai >= 50) {
                grade = "C";
            } else if (nilai >= 40) {
                grade = "D";
            } else {
                grade = "E";
            }
            //cetak hasilnya
            System.out.println("Grade: " + grade);
        }
    }
}
