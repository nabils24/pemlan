/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package codelab.modul1;
import java.util.Scanner;


/**
 * Class codelab2 - Deskripsi singkat mengenai kelas ini.
 */
public class codelab2 {

    public static void valUsia(int age) throws InvalidAgeException {
        if (age <= 0 || age >= 120) {
            throw new InvalidAgeException("Usia tidak valid. Usia harus lebih dari 0 dan kurang dari 120.");
        }
    }

    public static String valKondisi(int age) {
        if(age <= 17){
            return "Anak-Anak";
        }else if(age <= 25){
            return "Remaja";
        }else if(age <= 30){
            return "Muda";
        }else if(age <= 35){
            return "Tua";
        }else if(age <= 40 || age >= 50){
            return "Lansia";
        }

        return "Usia Tidak Valid";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan usia Anda: ");
            int userAge = scanner.nextInt();
            valUsia(userAge);

            System.out.println("Usia Anda valid: " + userAge + " tahun.");
            System.out.println("Kondisi Anda adalah : " + valKondisi(userAge));
        } catch (InvalidAgeException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Kesalahan: Input yang Anda masukkan bukan angka.");
        } finally {
            scanner.close();
        }
    }
}
