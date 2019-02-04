package coursemanager;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//@author JamieOneill

public class CourseManager {

    //Variables getting used
    private int courseIDindex = 0; //Define and Set courseID index to 0
    private int courserunIDindex = 0; //Define and Set courserunIDindex to 0
    private ArrayList<Course> CourseList = new ArrayList<Course>(); //Arraylist for CourseList
    private ArrayList<CourseRun> CourseRunList = new ArrayList<CourseRun>(); //Arraylist for CourseRunList

    public void courseManager() { //As in class diagram
    }

    //Add course method getting used
    public void addCourse(String title) {
        String cid = "C" + Integer.toString(courseIDindex);
        Course course = new Course(cid, title);
        CourseList.add(course);
        courseIDindex++;
    }

    //Add course run method
    public void addCourseRun(String courseID, String date) throws ParseException {
        
        String rid = courseID + "_R" + courserunIDindex;
        Course c = searchCourse(courseID);
        
        //Convert string date to date
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        Date startDate; //Defines the date, as startDate
        startDate = df.parse(date); //Defines start date

        double dt = startDate.getTime();
        double doubleD = (double) (dt / (24 * 60 * 60 * 1000)); //Convert date to days since epoch for storage
        System.out.println("d= " + doubleD);
        
        String d = Double.toString(doubleD);
        CourseRun courseRun = new CourseRun(rid, c, d);
        CourseRunList.add(courseRun);
        courserunIDindex++; //Increments the index

    }

    //Search course method
    public Course searchCourse(String courseID) {
        Course course;
        Course searched = null;
        for (int i = 0; i < CourseList.size(); i++) {
            course = CourseList.get(i);
            if (course.getcID().equals(courseID)) {
                searched = course;
            }

        }
        return searched; //Return searched results
    }

    //Search course run method
    public CourseRun searchCourseRun(String runID) {
        
        CourseRun courseRun;
        CourseRun searched = null;
        for (int i = 0; i < CourseRunList.size(); i++) {
            courseRun = CourseRunList.get(i);
            if (courseRun.getrunID().equals(runID)) {
                searched = courseRun;
            }
        }

        return searched; //Return searched results
    }
    
    //Gets the course ID index
    public Integer getCourseIDindex() {
        return this.courseIDindex;
    }
    //Sets the course ID index
    public void setCourseIDindex(Integer idx) {
        this.courseIDindex = idx;
    }
    //Gets the course run Id index
    public Integer getCourseRunIDindex() {
        return this.courserunIDindex;
    }
    //Sets the course run ID index
    public void setCourseRunIDindex(Integer idx) {
        this.courserunIDindex = idx;
    }
}
