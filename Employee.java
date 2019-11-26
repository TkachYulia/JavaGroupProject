import java.lang.*;
import java.lang.String;

/**
 */
public class Employee extends User {
	
	public Employee(String password, String username) {
		super(password, username);
	}

	/**
     */
    private String position;

    /**
     */
    private String id;

    /**
     */
    private String department;

    /**
     */
    private float salary;

    /**
     */
    private String firstName;

    /**
     */
    private String lastName;

    /**
     * @param id 
     * @param password  
     * @param name  
     */
    public void Employee(String name, String password, String id) {
    }

    /**
     * @return 
     */
    public String getPosition() {
        return null;
    }

    /**
     * @param position 
     */
    public void setPosition(String position) {
    }

    /**
     * @return 
     */
    public String getId() {
        return null;
    }

    /**
     * @param id 
     */
    public void setId(String id) {
    }

    /**
     * @return 
     */
    public String getDepartment() {
        return null;
    }

    /**
     * @param department 
     */
    public void setDepartment(String department) {
    }

    /**
     * @return 
     */
    public float getSalary() {
        return 0;
    }

    /**
     * @param salary 
     */
    public void setSalary(float salary) {
    }
}

