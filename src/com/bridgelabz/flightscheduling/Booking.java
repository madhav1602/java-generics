package src.com.bridgelabz.flightscheduling;

public class Booking<T>{
    private T bookingID;
    private Flight<?> flight;
    private String passengerName;

    public Booking(T bookingID, Flight<?> flight, String passengerName){
        this.bookingID=bookingID;
        this.flight=flight;
        this.passengerName=passengerName;
    }

    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Passenger: " + passengerName);
        flight.displayFlightInfo();
    }

}
