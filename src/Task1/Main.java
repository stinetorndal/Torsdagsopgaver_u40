package Task1;


import java.util.ArrayList;

public class Main {

    //public - alle skal kunne kalde den. Static: Hører til Main og ikke et objekt.
    //Skal kunne kaldes fra main. I printCustomers <> sendes liste af kunder ind
     // som argument og listen kaldes customers. Det kunne jo også være "kunder" :-P
    //for loop: For hver Customer c i listen customers, skal du gøre dette
    //toString bruges fra Customer-klassen
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer c : customers ){
            System.out.println(c);
        }
    }

    static void main() {
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("Vyvyan", "Bastard", "Very boring");
        Customer customer2 = new Customer("Neil", "Pye", "Groovy");
        Customer customer3 = new Customer("Rick", "Pratt", "Bastard");

        //Mulighed 1:
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        printCustomers(customers);
        //Test af data efter 1.d
       // System.out.println(customer1);
       // System.out.println(customer2);
       // System.out.println(customer3);

        //Brug getter:
        System.out.println("Brug getter: " + customer1.getFirstName());
        //Brug setter:
        customer2.setLastName("Sørensen");
        System.out.println("Efter brug af setter/ændring: " + customer2);

    }



}

