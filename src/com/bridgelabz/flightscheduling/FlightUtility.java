package src.com.bridgelabz.flightscheduling;
import java.util.*;
public class FlightUtility {
    public static void displayFlightDetails(List<Flight<?>> flights){
        for(Flight<?> flight:flights){
            flight.displayFlightInfo();
        }
    }
}
