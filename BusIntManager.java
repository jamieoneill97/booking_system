package coursemanager;

import java.util.ArrayList;
import twitter4j.TwitterException;

//@author JamieOneill

public class BusIntManager {

    //Declaring array lists
    private ArrayList<CourseCount> courseCountList = new ArrayList<CourseCount>(); //ArrayList to collect, course count
    private ArrayList<Booking> bookingList; //Array list for bookingList

    public void setupTwitterApp(OOSD2TwitterAPI twitterapi) {
        twitterapi.setupTwitterApp();
    }

    public String checkTwitterInfoForSubject(String searchterm, OOSD2TwitterAPI twitterapi) throws TwitterException {
        String res = twitterapi.searchTwitter(searchterm);
        return res;
    }
    //This will rank the courses by booking method
    public String rankCoursesbyBooking() {
        Booking booking;
        CourseRun courseRun;
        Course course;
        ArrayList<String> courseList = new ArrayList<>(); //Array list for courseList
        courseCountList.clear(); //Clears the course count list

        for (int a = 0; a < bookingList.size(); a++) { //'For loop' over bookingList
            booking = bookingList.get(a);
            courseRun = booking.getCourseRun();
            course = courseRun.getCourse();

            if (!courseList.contains(course.getcTitle())){ //Check courseList for Course    
            courseList.add(course.getcTitle()); //If not add to the List 
            
            CourseCount ccount = new CourseCount(); //Create new coursecount object
            ccount.CourseCount(course, 1); //Populate list
            System.out.println(ccount.toString());
            courseCountList.add(ccount); //Add coursecount to list
            
            } else if(courseList.contains(course.getcTitle())) { //Check if course list contain course
                
                for(int b=0; b<courseCountList.size(); b++){ //If so loop over
                    CourseCount ccount2 = courseCountList.get(b); //Get course from courselist
                    Course course2 = ccount2.getCourse(); //Get course from course count
                    
                    if(course2.getcTitle().equals(course.getcTitle())){ //Check if coursecount matches
                        ccount2.incCount(); //Increment
                        System.out.println(ccount2.toString());
                        courseCountList.set(b,ccount2); //Add back into course count
                    }
                }
            }
        }
        String results = courseCountToString(courseCountList); //String the results

        return results;
        }
    //Counts the courses
    public String courseCountToString(ArrayList CourseCount) {
        String courseCountString = "";
        CourseCount temp; //Setting the courseCount to temp
        for (int a = 0; a < CourseCount.size(); a++) { //For loop for counting courses
            temp = (CourseCount) CourseCount.get(a);
            if (a == 0) {
                courseCountString = temp.toString();
            } else {
                courseCountString = courseCountString + "\n" + temp.toString();
            }
        }
        return courseCountString; //Reurn course count
    }

    //Sets the booking list
    public void setbookingList(ArrayList bookings){ //Sets the booking list correctly
        this.bookingList = bookings;
}
    //Sets course countList
    public void setcourseCountList(ArrayList courseCount){ //Sets the course count List correctly
        this.courseCountList = courseCount;
    }
}
