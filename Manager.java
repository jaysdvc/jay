/**
 * Employee class for applications
 */
package demoapp;

/**
 * Date package
 */
import java.sql.Date;

/*
 * Employee 
 */
public class Manager {
	/**
	 * class / database
	 */
	private boolean managerFlag = false;
	private String name;
	private Date datedHired;
	private int id;

	/*
	 * constructor is a special kind of method that is called immediately upon
	 * creating a new object or instance of the class
	 */
	Manager() {
	}

	// context driven
	public String getName() {
		return this.name;
	}

	public String getID() {
		return Integer.toString(this.id);
	}

	public Date getDatedHired() {
		return this.datedHired;
	}

	public boolean isManager() {
		return this.managerFlag;
	}

	// Getters
	public boolean get_managerFlag() {
		return this.managerFlag;
	}

	public String get_name() {
		return this.name;
	}

	public Date get_datedHired() {
		return this.datedHired;
	}

	public int get_id() {
		return this.id;
	}

	// Setters
	public void set_managerFlag(boolean b_managerFlag) {
		this.managerFlag = b_managerFlag;
	}

	public void set_name(String str_name) {
		this.name = str_name;
	}

	public void set_datedHired(Date dt_datedHired) {
		this.datedHired = dt_datedHired;
	}

	public void set_id(int int_id) {
		this.id = int_id;
	}

}
