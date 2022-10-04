package Lab7.exercise3;

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

        changeDept(154345, "computing", "creativeMedia");
//        changeDept(453726, computing, creativeMedia);
    }

    private static void changeDept(int stdID, String from, String to) {
        boolean foundFrom = false, foundTo = false;
        for (Department dept:ITT.getDepartments()) {
            if (dept != null) {
                if (dept.getName().equals(from)) foundFrom = true;
                if (dept.getName().equals(to)) foundTo  = true;
//                System.out.println("Valid Departments.");
            }
        }

        if (foundFrom&&foundTo){
//                    System.out.println("here");
            for (Student std: from) {
                if (std != null) {
                    if (std.getId() == stdID) {
                        System.out.println("Found " + std.getName() + "!");
                        std.setDepartment(to);
                    }
                }
            }
        }
    }
}
