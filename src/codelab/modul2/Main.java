/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package codelab.modul2;


/**
 * Class Main - Deskripsi singkat mengenai kelas ini.
 */
public class Main {
    
    // Constructor
    public Main() {
        // Inisialisasi jika diperlukan
    }

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 10.2, 2);
        Library lib = new Library(book1, "Perpustakaan Kota");

        // Display initial information
        lib.showLibraryInfo();

        // Add more stock
        book1.adjustStock(5);

        // Display updated information
        lib.showLibraryInfo();
    }
}
