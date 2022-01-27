package homework3;

import java.util.ArrayList;

public class Customer {
    String name;
    int balance;
    int id;

    Customer(String s, int i, int j)
    {
        name=s;
        balance=i;
        id=j;
    }

    public String toString()
    {
        return "|Name : "+ name + "|Balance : "+ balance + "|ID : " + id + "|\n";
    }

    public static void main(String[] args)
    {
        // Collection and user defined classes
        ArrayList<Customer> arr= new ArrayList<Customer>(); //ArrayList will contain a collection of Customer's objects.

        //Creating Customer objects.
        Customer customer1 = new Customer("Jay", 1000, 2);
        Customer customer2 = new Customer("Shane", 7000, 3);
        Customer customer3 = new Customer("Ricky", 5000, 1);
        Customer customer4 = new Customer("Tom", 3000, 6);
        Customer customer5 = new Customer("Mick", 6000, 4);

//Storing objects in an ArrayList collection class.
        arr.add(customer1);
        arr.add(customer2);
        arr.add(customer3);
        arr.add(customer4);
        arr.add(customer5);

        for(Customer c : arr)
            System.out.println(c);

    }
}
