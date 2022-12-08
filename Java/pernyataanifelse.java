package Java;

import java.util.Scanner;

public class pernyataanifelse {

    public static void main(String[] args) {
    
    // Membuat variabel dengan scanner
        int nilai;
        String nama;
        try (Scanner scan = new Scanner(System.in)) {
            // Mengambil input
            System.out.print("nama : ");
            nama = scan.nextLine();
            System.out.print("nilai : ");
            nilai = scan.nextInt();
        }

        // cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda tidak lulus!");
        }
    }
}