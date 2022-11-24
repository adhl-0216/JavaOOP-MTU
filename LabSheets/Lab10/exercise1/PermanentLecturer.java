package Lab10.exercise1;

import java.util.Date;
import java.util.GregorianCalendar;

public class PermanentLecturer extends Lecturer {
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(
            String name,
            String address,
            GregorianCalendar dateOfBirth,
            String staffID,
            String[] coursesTaught,
            GregorianCalendar dateOfAppointment,
            String pensionEntitlements,
            String status) {
        super(name, address, dateOfBirth, staffID, coursesTaught, dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLecturer Status is " + getStatus() +
                "\nLecturer Point On Scale is " + getPointOnScale() +
                "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }

    public String getPensionEntitlements() {
        return pensionEntitlements;
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public int getPointOnScale() {
        Date currDate = GregorianCalendar.getInstance().getTime();
        Date dOA = getDateOfAppointment().getTime();

        int yearsWorked = (int) Math.floor(currDate.getYear() - dOA.getYear());
        if (yearsWorked >= 20) yearsWorked = 20;
        return yearsWorked;
    }
}
