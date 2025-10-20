/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab2.tugas2;


/**
 * Class Ticket - Deskripsi singkat mengenai kelas ini.
 */
public abstract class Ticket {

    public String passengerName;
    public String startLocation;
    public String destination;
    public double price;

    // Constructor
    public Ticket(String passengerName, String startLocation, String destination, double price) {
        // Inisialisasi jika diperlukan
        this.passengerName = passengerName;
        this.startLocation = startLocation;
        this.destination = destination;
        this.price = price;
    }

    /**
     * Metode utama yang dijalankan saat program dimulai.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // Method to display basic info passenger and trip
    public abstract void displayInfo();
}
