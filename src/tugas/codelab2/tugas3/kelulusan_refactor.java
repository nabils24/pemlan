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

public class kelulusan_refactor {

    public static final int nilai_batas_bawah = 60;
    public static final int nilai_batas_atas = 80;

    public static void main(String[] args) {
        // Membuat Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta input nilai
        System.out.print("Masukkan nilai Anda: ");

        // Mengecek kelulusan berdasarkan nilai
        cekNilai(input.nextDouble());

        // Menutup input
        input.close();
    }

    private static void cekNilai(double nilai) {
        if (kondisi1(nilai)) {
            System.out.println("Selamat! Anda Lulus.");
            System.out.println("Nilai Anda sangat baik! Terus pertahankan.");
        } else if (kondisi2(nilai)) {
            System.out.println("Anda Lulus, namun perlu lebih berusaha.");
        } else {
            System.out.println("Maaf, Anda Tidak Lulus. Jangan putus asa, coba lagi.");
        }
    }

    private static boolean kondisi2(double nilai) {
        return nilai >= nilai_batas_bawah;
    }

    private static boolean kondisi1(double nilai) {
        return nilai > nilai_batas_atas;
    }
}

