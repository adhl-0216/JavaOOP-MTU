package PS5.extras;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] allEmployee = new Employee[5];
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
        allEmployee[2] = new Employee(
                "Mark Mc Manus",
                352723,
                new Address(
                        "87 Racecourse Lawn",
                        "Tralee",
                        "Kerry",
                        "Ireland",
                        "AH78P36"),
                new Insurance("LA Brokers Golden Goose",7372642)
        );

        for (int i = 0; i < allEmployee.length; i++) {
            System.out.printf("Employee %d:\n\n%s%n\n",i+1,allEmployee[i]);
        }
    }
}
