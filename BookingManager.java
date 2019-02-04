package coursemanager;

import java.util.ArrayList;

//@author JamieOneill

public class BookingManager {

    //Variable for booking manager
    private Integer bookingIDindex = 0; //Defined, & booking ID index as 0
    private ArrayList<Booking> bookingList = new ArrayList<Booking>(); //Array List for booking

    //This makes the booking
    public void makeBooking(CourseRun courseRun, String attendee) {
        
        String bookingID = "B" + bookingIDindex + "_" + courseRun.getrunID(); //String booking ID
        Booking booking = new Booking(bookingID, courseRun, attendee);
        
        bookingList.add(booking); //Adds the booking
        bookingIDindex++; //Increments the booking ID Index
    }

    //This searches to find the booking in the list
    public Booking searchBooking(String bookingID) { //String the bookingID

        Booking booking; 

        for (int i = 0; i < bookingList.size(); i++) { //For loop, to loop over booking list
            booking = bookingList.get(i);

            if (booking.getBookingID().equals(bookingID)) { //If statement for bookings
                return booking; //Reurns bookings if one found
            }
        }
        return null; //If no booking return 'null'
    }

    //This gets the Bookings and returns the list
    public ArrayList<Booking> getBookings() {
        return this.bookingList; //Returns the booking list when called
    }

    //This gets the Booking ID Index
    int getbookingIDindex() {
        return this.bookingIDindex; //Returns the bookings ID index
    }
}
