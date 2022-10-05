package Lab7.exercise3;

import java.util.Arrays;

public class TestCollegeApp {
    static Department[] departments = new Department[5];
    static Institute ITT = new Institute("Institute of Technology, Tralee", departments);


    public static void main(String[] args) {
        Student[] compStds = new Student[10];

        Student c1 = new Student(154345, "Jake", "Computing");
        Student c2 = new Student(453726, "Tommy", "Computing");

        compStds[0] = c1;
        compStds[1] = c2;

        Student[] mediaStds = new Student[10];

        Student m1 = new Student(234532, "Mary", "Creative Media");
        Student m2 = new Student(623456, "Peter", "Creative Media");

        mediaStds[0] = m1;
        mediaStds[1] = m2;


        Department computing = new Department("Computing", compStds);
        Department creativeMedia = new Department("Creative Media", mediaStds);

        departments[0] = computing;
        departments[1] = creativeMedia;

        System.out.println(ITT);

        changeDept(154345, computing, creativeMedia);
        System.out.println(computing);
        System.out.println(creativeMedia);
    }
    private static void changeDept(int stdID, Department from, Department to) {
        boolean foundFrom = false, foundTo = false;
        for (Department dept:ITT.getDepartments()) {
            if (dept != null) {
                if (dept==from) foundFrom = true;
                if (dept==to) foundTo  = true;
            }
        }

        if (foundFrom&&foundTo){
            for (int i = 0; i < from.getStudents().length; i++) {
                Student[] std = from.getStudents();
                if (std[i] != null) {
                    if (std[i].getId() == stdID) {
                        System.out.println("Found " + std[i].getName() + "!");
                        std[i].setDepartment(to.getName());

                        //modify from department
                        Student[] setFrom = new Student[std.length];
                        System.arraycopy(std, 0, setFrom, 0 ,i );
                        System.arraycopy(std, i+1, setFrom, i,std.length-i-1);
                        from.setStudents(setFrom);
                        System.out.println(from.getStudents().length);

                        //modify to department
                        Student[] setTo = Arrays.copyOf(to.getStudents(),to.getStudents().length);
                        for (int c = 0;c< setTo.length ; c++) {
                            if (setTo[c] == null) {
                                setTo[c] = std[i];
                                break;
                            }
                        }
                        to.setStudents(setTo);
                    }
                }
            }
        }
    }
}
