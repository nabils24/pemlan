/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab2.tugas2;


/**
 * Class Main - Deskripsi singkat mengenai kelas ini.
 */
public class MainApp {


    static final double MIN_SPEED = 5;
    static final double MAX_SPEED = 100;

    public static void main(String[] args) {
        TaxiTicket ticket = new TaxiTicket(new TicketInfo("Downtown", "Airport", 50.0, 30.0, "Alice", 60.0));
        ticket.detailedInfo();   // Display full info
        ticket.checkStatus();             // Check taxi status
        // Display route and Estimated duration
        ticket.displayRoute();
        ticket.displayEstimatedDuration();
        // Simulate slowing down and speeding up
        ticket.slowDown(20);
        ticket.speedUp(15);
    }
}
