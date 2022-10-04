package Lab7.exercise3;

public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students){
        setName(name);
        setStudents(students);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public Student[] getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder listOStds = new StringBuilder();
        for (Student std: getStudents()) {
            if (std != null) {
                listOStds.append(std).append("\n");
            }
        }
        return "Department name: " + name +
                "\nList of Students: \n" + listOStds;
    }
}
