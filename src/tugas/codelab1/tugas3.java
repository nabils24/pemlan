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
 * Class tugas3 - Deskripsi singkat mengenai kelas ini.
 */
public class tugas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan nilai ujian akhir: ");
        int nilai = scanner.nextInt();

        // Tentukan status kelulusan
        String status;
        if (nilai >= 60) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }

        // Output hasil
        System.out.println("Nama: " + nama);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
