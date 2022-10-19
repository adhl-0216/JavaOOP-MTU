package Lab10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer {
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(
            String name,
            String address,
            GregorianCalendar dateOfBirth,
            String staffID,
            String[] coursesTaught,
            GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    public abstract String getStatus();
    public abstract int getPointOnScale();

    @Override
    public String toString() {
        String output = "Lecturer name is " + name +
                "\nLecturer address is " + address +
                "\nLecturer date of birth is ";
        if(getDateOfBirth()!=null)
        {
            Date dob = getDateOfBirth().getTime();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            output+=strDob;
        }
        else
            output+="Undefined";

        output += "\nLecturer Staff ID is " + staffID +
                "\nLecturer Courses Taught are " + Arrays.toString(coursesTaught) +
                "\nLecturer Date Of Appointment is ";

        if(getDateOfAppointment()!=null)
        {
            Date doa = getDateOfAppointment().getTime();
            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDoA = formatDate.format(doa);
            output+=strDoA;
        }
        else
            output+="Undefined";

        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
}
