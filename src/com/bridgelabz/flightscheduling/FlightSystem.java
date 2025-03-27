package src.com.bridgelabz.flightscheduling;

import java.util.*;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101, "DELHI", "MUMBAI");
        Flight<String> flight2 = new Flight<>("12S3G54", "MUMBAI", "DELHI");

        Booking<Integer> booking1 = new Booking<>(3213, flight1, "Madhav");
        Booking<String> booking2 = new Booking<>("22KL76", flight2, "Simran");

//        flight1.displayFlightInfo();
//        booking1.displayBookingInfo();

        List<Flight<?>> flights=new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);

        FlightUtility.displayFlightDetails(flights);
    }
}
