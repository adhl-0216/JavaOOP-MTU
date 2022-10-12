package PS5.extras;

import java.util.Locale;

public class TestEmployee {
    private static Employee[] allEmployee = new Employee[5];

    public static void main(String[] args) {
        allEmployee[0] = new Employee(
                "Joseph Bloggs III",
                536272,
                new Address("123 Hyde Road" ,
                        "Ballydehob" ,
                        "Cork" ,
                        "Ireland" ,
                        "R54HT7D"),
                new Insurance("Irish Life Excel 500" ,5468292 )
        );
        allEmployee[1] = new Employee(
                "Marie O Connell",
                982111,
                new Address("Boreen na dTonnta" ,
                        "Connemara" ,
                        "Galway" ,
                        "Ireland" ,
                        "PG52K3B"),
                new Insurance("AXA Superlative Life", 9374633)
        );
        Insurance ins2 = new Insurance("LA Brokers Golden Goose",7372642);
        allEmployee[2] = new Employee(
                "Mark Mc Manus",
                352723,
                new Address(
                        "87 Racecourse Lawn",
                        "Tralee",
                        "Kerry",
                        "Ireland",
                        "AH78P36"),
                ins2
        );

        for (Employee emp : allEmployee) {
            if (emp.getName().toLowerCase(Locale.ROOT).contains("joseph")) {
                emp.setAddress(new Address(
                        "56 Main Street",
                        "Thurles",
                        "Tipperary",
                        "Ireland",
                        "B87JH5Q"));
                System.out.println("Changed \"joseph\"'s address\n" +emp);
                break;
            }
        }

        allEmployee[1].setInsurance(null);
        System.out.println("\nRemoving insurance details of the second employee:\n");
        System.out.println(allEmployee[1]);
        System.out.println("State of the insurance of the second employee:\n");
        System.out.println(ins2);

//        for (Employee emp : allEmployee) {
//            if (emp.getAddress().getCounty().equalsIgnoreCase("Kerry")) {
//                System.out.println("\nDisplaying the state of all employees who hail from county Kerry\n\n" +emp);
//                break;
//            }
//        }

        allEmployee[3] = new Employee(
                "Jaimie O Toole",
                234234,
                new Address(
                    "2 Rock St",
                    "Mallow",
                    "Cork",
                    "Ireland" ,
                    "YU67R34"),
                null
        );
        allEmployee[4] = new Employee(
                "Lara Connolly",
                568554,
                new Address(
                    "12 Westbrook Drive",
                    "Trim",
                    "Meath",
                    "Ireland",
                    "78TYMDS"),
                new Insurance("LA Brokers Golden Goose", 7372642)
        );
        sortEmployeeByName(allEmployee);
//        for (int i = 0; i < allEmployee.length; i++) {
//            System.out.printf("Employee %d:\n\n%s%n\n",i+1,allEmployee[i]);
//        }
    }

    private static void sortEmployeeByName(Employee[] allEmployee){
        Employee temp = new Employee(null, 0, null, null);
        for (int i = 0; i < allEmployee.length; i++) {
            for (int j = 0; j < allEmployee.length; j++) {
                if (allEmployee[i].getName().charAt(0)>allEmployee[j].getName().charAt(0)){
                    temp = allEmployee[j];
                }
            }
            System.out.printf("Employee %d:\n\n%s%n\n",i+1,allEmployee[i]);
        }
    }
}
