/*
 * ===========================================
 * Author   : Nabil Sahsada Suratno
 * Mode     : Java Main Class
 * Nim      : 202410370110357
 * ===========================================
 */

package tugas.codelab2.tugas2;


/**
 * Class TaxiTicket - Deskripsi singkat mengenai kelas ini.
 */
public class TaxiTicket extends Ticket implements Operational {
    public static final double TAX_RATE = 0.1;
    private double duration;
    private double speed;

    public TaxiTicket(TicketInfo ticketInfo) {
        super(ticketInfo.passengerName(), ticketInfo.startLocation(), ticketInfo.destination(), ticketInfo.price());
        this.duration = ticketInfo.duration();
        this.speed = ticketInfo.speed();
    }

    @Override
    public void Operational() {

    }

    // Method to check taxi status
    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    // Method to display estimated travel duration
    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    // Method to display the route
    @Override
    public void displayRoute() {
        System.out.println("Route: " + startLocation + " -> " + destination);
    }

    // Method to slow down the taxi
    public void slowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MainApp.MIN_SPEED)
            speed = MainApp.MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    // Method to speed up the taxi
    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MainApp.MAX_SPEED)
            speed = MainApp.MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    // Method to display basic info passenger and trip
    @Override
    public void displayInfo() {
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Start Location : " + startLocation);
        System.out.println("Destination    : " + destination);
        System.out.println("Price          : " + price);
        System.out.println("Final Price    : " + calculateFinalPrice()); // Price including 10% tax
    }

    private double calculateFinalPrice() {
        return price + (price * TAX_RATE);
    }

    // Method to display full info including duration and speed
    public void detailedInfo() {
        displayInfo();
        System.out.println("Duration       : " + duration + " minutes");
        System.out.println("Speed          : " + speed + " km/h");
    }

}

