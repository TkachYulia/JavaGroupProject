import java.lang.*;
import java.util.List;

/**
 */
public class Student extends User {
    /**
     */
    private String id;

    /**
     */
    private int numCourses = 0;

    /**
     */
    private List<Course> courses;

    /**
     */
    private String faculty;

    /**
     * @param id 
     * @param name 
     * @param password 
     */
    public Student(String name, String password, String id) {
    	super(name,password);
    }

    /**
     * @return 
     */
    public String getID() {
        return null;
    }

    /**
     * @param id 
     */
    public void setID(String id) {
    }

    /**
     * @return 
     */
    public String getFaculty() {
        return null;
    }

    /**
     * @param faculty 
     */
    public void setFaculty(String faculty) {
    }

    /**
     * @param course 
     */
    public void addCourse(Course course) {
    }

    /**
     */
    public void viewCourses() {
    }

    /**
     */
    public void viewTeacherInfo() {
    }

    /**
     */
    public void viewCourseMarks() {
    }

    /**
     */
    public void viewTranscript() {
    }
}

