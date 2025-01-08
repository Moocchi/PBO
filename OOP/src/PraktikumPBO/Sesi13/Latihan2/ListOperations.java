package PraktikumPBO.Sesi13.Latihan2;

import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        // Membuat List dengan data bertipe String
        List<String> data = new ArrayList<>();
        data.add("Apel");
        data.add("Pisang");
        data.add("Mangga");
        data.add("Jeruk");
        data.add("Strawberry");

        // Tampilkan data yang terdapat pada list
        System.out.println("Data Awal: " + data);

        // Balikkan data yang terdapat pada list
        Collections.reverse(data);
        System.out.println("Data Setelah Dibalik: " + data);

        // Acak data tersebut
        Collections.shuffle(data);
        System.out.println("Data Setelah Diacak: " + data);

        // Urutkan data tersebut
        Collections.sort(data);
        System.out.println("Data Setelah Diurutkan: " + data);
    }
}
