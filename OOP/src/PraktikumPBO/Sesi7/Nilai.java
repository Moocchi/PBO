package PraktikumPBO.Sesi7;

public class Nilai {
    private int Quiz;
    private int Uts;
    private int Uas;

    public int getQuiz() {
        return Quiz;
    }

    public void setQuiz(int quiz) {
        if (quiz < 0 || quiz > 100) {
            throw new IllegalArgumentException("Nilai Quiz harus antara 0 dan 100");
        }
        this.Quiz = quiz;
    }

    public int getUts() {
        return Uts;
    }

    public void setUts(int uts) {
        if (uts < 0 || uts > 100) {
            throw new IllegalArgumentException("Nilai Uts harus antara 0 dan 100");
        }
        this.Uts = uts;
    }

    public int getUas() {
        return Uas;
    }

    public void setUas(int uas) {
        if (uas < 0 || uas > 100) {
            throw new IllegalArgumentException("Nilai Uas harus antara 0 dan 100");
        }
        this.Uas = uas;
    }

    public double getNA() {
        return (0.2 * Quiz) + (0.3 * Uts) + (0.5 * Uas);
    }
}

class NilaiTester {
    public static void main(String[] args) {
        Nilai n = new Nilai();
        try {
            n.setQuiz(90);
            n.setUts(80);
            n.setUas(90); // Ubah nilai Uas menjadi dalam rentang yang wajar
            System.out.print("\033[H\033[2J");
            System.out.println("NA : " + n.getNA());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}