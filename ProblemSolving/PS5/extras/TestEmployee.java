package PS5.extras;

public class TestEmployee {
    private static final Employee[] allEmployee = new Employee[5];

    public static void main(String[] args) {
        allEmployee[0] = new Employee(
                "Joseph Blogs III",
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
                null
        );

//        for (Employee emp : allEmployee) {
//            if (emp.getName().toLowerCase(Locale.ROOT).contains("ioseph")) {
//                emp.setAddress(new Address(
//                        "56 Main Street",
//                        "Thurles",
//                        "Tipperary",
//                        "Ireland",
//                        "B87JH5Q"));
//                System.out.println("Changed \"ioseph\"'s address\n" +emp);
//                break;
//            }
//        }

//        allEmployee[1].setInsurance(null);
//        System.out.println("\nRemoving insurance details of the second employee:\n");
//        System.out.println(allEmployee[1]);
//        System.out.println("State of the insurance of the second employee:\n");
//        System.out.println(ins2);

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
        System.out.println("====================================================");
        sortEmployeeByName(allEmployee);
        for (int i = 0; i < allEmployee.length; i++) {
            System.out.printf("Employee %d:\n\n%s%n\n",i+1,allEmployee[i]);
        }
    }

    private static void sortEmployeeByName(Employee[] arr){
        // One by one move boundary of unsorted subarray
        for(int i = 0; i < arr.length - 1; i++)
        {

            // Find the minimum element in unsorted array
            int min_index = i;
            String minStr = arr[i].getName();
            for(int j = i + 1; j < arr.length; j++)
            {

            /*compareTo() will return a -ve value,
            if string1 (arr[j]) is smaller than string2 (minStr)*/
                // If arr[j] is smaller than minStr

                if(arr[j].getName().compareTo(minStr) < 0)
                {
                    // Make arr[j] as minStr and update min_idx
                    minStr = arr[j].getName();
                    min_index = j;
                }
            }

            // Swapping the minimum element
            // found with the first element.
            if(min_index != i)
            {
                Employee temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
