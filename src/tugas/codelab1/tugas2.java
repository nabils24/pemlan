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
 * Class tugas2 - Deskripsi singkat mengenai kelas ini.
 */
public class tugas2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka positif: ");
            int number = scanner.nextInt();

            // Validasi angka psitif
            if (number <= 0) {
                throw new InvalidNumberException("Error: Angka harus positif, bukan " + number);
            }

            System.out.println("Input valid! Angka yang dimasukkan adalah: " + number);

        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Input harus berupa angka!");
        } finally {
            scanner.close();
        }
    }
}
