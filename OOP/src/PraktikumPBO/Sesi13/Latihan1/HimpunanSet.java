package PraktikumPBO.Sesi13.Latihan1;

import java.util.HashSet;
import java.util.Set;

public class HimpunanSet {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        
        // Menambahkan elemen ke himpunan A dan B
        A.add(1); A.add(2); A.add(3); A.add(4); A.add(5);
        B.add(5); B.add(6); B.add(7); B.add(8); B.add(9); B.add(10);

        // A - B (Himpunan A tanpa elemen yang ada di B)
        Set<Integer> A_minus_B = new HashSet<>(A);
        A_minus_B.removeAll(B);
        System.out.println("A - B: " + A_minus_B);

        // A ∩ B (Irisan antara A dan B)
        Set<Integer> A_intersection_B = new HashSet<>(A);
        A_intersection_B.retainAll(B);
        System.out.println("A ∩ B: " + A_intersection_B);

        // A U B (Gabungan antara A dan B)
        Set<Integer> A_union_B = new HashSet<>(A);
        A_union_B.addAll(B);
        System.out.println("A U B: " + A_union_B);

        // A ⊆ B (A adalah subset dari B?)
        boolean A_isSubsetOf_B = B.containsAll(A);
        System.out.println("A ⊆ B: " + A_isSubsetOf_B);
    }
}
