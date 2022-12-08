package Java;

import java.util.Scanner;

public class pernyataanif {

    public static void main(String[] args) {
        int belanja = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("total belanjaan rp. ");
            belanja = scan.nextInt();
        }

        if (belanja > 100000) {
            System.out.println("selamat, anda mendapatkan hadiah");
        }

        System.out.println("terima kasih.....");
    }
}