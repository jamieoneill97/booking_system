package coursemanager;

 //@author JamieOneill

public class CourseCount {

    //Variables which are going to get used
    private int bookingCount;
    private Course course;
    
    public void CourseCount(Course c, Integer count) {
          this.course = c;
          this.bookingCount = count;
    }
    //To increment count
    public void incCount() {
        this.bookingCount++;
    }
    //To get booking count 
    public Integer getBookingCount(){
        return this.bookingCount;
    }
    //To set the booking count
    public void setBookingCount(Integer count) {
        this.bookingCount = count;
    }
    //To get the course
    public Course getCourse() {
        return this.course;
    }
    //To set the course needed
    public void setCourse(Course c) {
        this.course = c;
    }
    //ToString method for Course Count
    @Override
    public String toString() {
        return this.course.toString() + ", bookings=" + this.bookingCount;
    }

}
