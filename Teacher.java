import java.lang.*;
import java.util.List;

/**
 */
public class Teacher extends Employee {
    /**
     */
    private TeachersTitle TEACHERSTITL;

    /**
     */
    private List<Course> classes;

    /**
     * @param course 
     */
    public void addCourse(Course course) {
    }

    /**
     */
    public void viewCourse() {
    }

    /**
     */
    public void viewStudent() {
    }

    /**
     * @param mark 
     */
    public void putMarks(Mark mark) {
    }

    /**
     */
    public void sendOrder() {
    }

    /**
     */
    public void addCourseFiles() {
    }

    /**
     */
    public void deleteCourseFiles() {
    }

    /**
     * @param id 
     * @param name 
     * @param password 
     * @param TEACHERSTITL 
     */
    public Teacher(String name, String password, String id, TeachersTitle TEACHERSTITL) {
    	super(name, password);
    }
}

