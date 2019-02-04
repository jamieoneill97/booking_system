package coursemanager;

//@author JamieOneill

public class Booking {

    //Variables for booking class
    private String bookingID;
    private String attendee;
    private CourseRun courseRun;

    public Booking(String bookingID, CourseRun run, String attendee) {

        this.bookingID = bookingID;
        this.courseRun = run;
        this.attendee = attendee;

    }

    //This gets the booking ID
    public String getBookingID() {
        return this.bookingID;
    }

    //This sets the booking ID
    public void setBookingID(String value) {
        this.bookingID = value;
    }

    //This gets course Run
    public CourseRun getCourseRun() {
        return this.courseRun;
    }

    public String getAttendee() {
        return this.attendee;
    }

    public void setAttendee(String value) {
        this.attendee = value;
    }

    //ToString for return
    @Override
    public String toString() {
        return bookingID + " " + attendee + " " + courseRun;
    }

}
