package Lab10.exercise1;

import java.util.Date;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {

    private int hoursWorked;

    public TemporaryLecturer(
            String name,
            String address,
            GregorianCalendar dateOfBirth,
            String staffID,
            String[] coursesTaught,
            GregorianCalendar dateOfAppointment,
            int hoursWorked) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLecture Status is  " + getStatus() +
                "\nLecturer Point On Scale is " + getPointOnScale() +
                "\nLecturer Hours Worked: " + getHoursWorked();
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String getStatus() {
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public int getPointOnScale() {
        Date currDate = GregorianCalendar.getInstance().getTime();
        Date dOA = getDateOfAppointment().getTime();

        int yearsWorked = (int) Math.floor(currDate.getYear() - dOA.getYear());

        if (yearsWorked >= 3) {
            if (hoursWorked > 1000) yearsWorked = (int) Math.floor((hoursWorked*1.33/700) + 1);
            if (hoursWorked > 1500) yearsWorked = 4;
        }
        if (yearsWorked >= 20) yearsWorked = 20;

        return yearsWorked;
    }
}
