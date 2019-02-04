package coursemanager;

 //@author JamieOneill

public class Course {
    
    //Variables to get used for Course
    private String cID;
    private String cTitle;

    //Course method
    public Course(String cID, String cTitle) {
        this.cID = cID;
        this.cTitle = cTitle;
    }
    //String getcID
    public String getcID() {
        return cID;
    }
    //String getcTitle
    public String getcTitle() {
        return cTitle;
    }
    //ToStirng method course
    @Override
    public String toString() {
        return cID + " "+ cTitle;
    }

}
