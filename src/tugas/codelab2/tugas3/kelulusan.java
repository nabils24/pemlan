/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab2.tugas3;
import java.util.Scanner;


/**
 * Class kelulusan - Deskripsi singkat mengenai kelas ini.
 */

public class kelulusan {

    public static void main(String[] args) {
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input nilai
        System.out.print("Masukkan nilai Anda: ");
        double nilai = scanner.nextDouble();

        // Mengecek kelulusan berdasarkan nilai
        if (nilai > 80) {
            System.out.println("Selamat! Anda Lulus.");
            System.out.println("Nilai Anda sangat baik! Terus pertahankan.");
        } else if (nilai >= 60) {
            System.out.println("Anda Lulus, namun perlu lebih berusaha.");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus. Jangan putus asa, coba lagi.");
        }

        // Menutup scanner
        scanner.close();
    }
}

