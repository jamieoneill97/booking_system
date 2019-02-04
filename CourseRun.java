package coursemanager;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//@author JamieOneill

public class CourseRun {

    //Variables which will get used
    private String runID;
    private String date;
    private Course course;

    //Course Run method
    public CourseRun(String runID, Course c, String date) { 
        
        double doubleDate = Double.parseDouble(date);
        this.runID = runID;
        
        long dt = (long) (doubleDate * (24 * 60 * 60 * 1000)); //Conversion for the Date
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy"); //Date format used
        Date startDate = new Date(dt);
        
        String newDateString = df.format(startDate); //String new date
        this.date = newDateString;
        this.course = c;

    }
    //Gets the run ID
    public String getrunID() {
        return runID;
    }
    //Gets the date
    public String getdate() {
        return date;
    }
    //Gets the course
    public Course getCourse() {
        return this.course;
    }
    //toString method
    @Override
    public String toString() {
        return runID + " "+ date + " " + course.getcTitle();
    }

}
