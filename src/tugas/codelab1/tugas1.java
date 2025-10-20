/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab1;

import java.util.Scanner;

/**
 * Class tugas1 - Deskripsi singkat mengenai kelas ini.
 */
public class tugas1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = scanner.nextInt();

        int[] angka = new int[n];
        System.out.println("Masukkan angka-angka:");
        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }

        int total = 0;
        //kesalahan terdapat disini yang dimana seharusnya looping dimulai dari awal dari 0 karena array dimulai dari 0
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }

        double rataRata = (double) total / n;
        System.out.println("Rata-rata adalah: " + rataRata);

        scanner.close();
    }

}
