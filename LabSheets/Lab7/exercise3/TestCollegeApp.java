package Lab7.exercise3;

public class TestCollegeApp {
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

        Department[] departments = new Department[5];

        Department computing = new Department("Computing", compStds);
        Department creativeMedia = new Department("Creative Media", mediaStds);

        departments[0] = computing;
        departments[1] = creativeMedia;

        Institute ITT = new Institute("Institute of Technology, Tralee", departments);

//print output
/*        System.out.println(computing);
        System.out.println(creativeMedia);*/
        System.out.println(ITT);
    }
}
