/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package codelab.modul1;


/**
 * Class codelab1 - Deskripsi singkat mengenai kelas ini.
 */
public class codelab1 {
        /**
         * Metode utama yang dijalankan saat program dimulai.
         *
         * @param args Argumen baris perintah
         */
        public static void main(String[] args) {
            String[] nama = {"Heri", "Clara", "Nabil", "Mis", "Bila"};
            String[] semuaNamaTerpanjang = cariSemuaNamaTerpanjang(nama);

            System.out.println("Nama-nama terpanjang adalah:");
            for (String s : semuaNamaTerpanjang) {
                if (s != null) {
                    System.out.println("- " + s);
                }
            }
        }

        /**
         * Mencari dan mengumpulkan semua nama terpanjang dari sebuah array.
         *
         * @param array Array dari String yang akan diperiksa
         * @return Array String berisi semua nama terpanjang
         */
        public static String[] cariSemuaNamaTerpanjang(String[] array) {
            if (array == null || array.length == 0) {
                return new String[0];
            }

            // Cari panjang maksimum
            int panjangMaksimum = 0;
            for (String s : array) {
                if (s.length() > panjangMaksimum) {
                    panjangMaksimum = s.length();
                }
            }

            String[] hasil = new String[array.length];
            int id = 0;

            // Kumpulkan smua nama dengan panjang array
            for (String s : array) {
                if (s.length() == panjangMaksimum) {
                    hasil[id] = s;
                    id++;
                }
            }
            //kembali dalam bentuk array
            return hasil;
        }
    }

