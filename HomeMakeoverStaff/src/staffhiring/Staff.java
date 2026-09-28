package staffhiring;

// Abstract class that stores the staff data
public abstract class Staff implements iStaff {

    // variables to store the staff number and the location
    private int staffNumber;
    private String staffLocation;

    // constructor that receives the staff number and the location as parameters
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // returns the number of staff members
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    // returns the store location
    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // hiring must start when there are less than 20 staff members
    @Override
    public String getStaffHiringProcess() {
        if (staffNumber < 20) {
            return "YES";
        } else {
            return "NO";
        }
    }
}