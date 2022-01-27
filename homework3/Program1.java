package homework3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Employee> AllEmployees = new ArrayList<Employee>();
        AllEmployees.add(new Employee(1, "Zavier", 5000d));
        AllEmployees.add(new Employee(2, "Sumit", 2000d));
        AllEmployees.add(new Employee(3, "Pratik", 1500d));
        AllEmployees.add(new Employee(4, "Suresh", 32000d));
        AllEmployees.add(new Employee(5, "Abhi", 700d));
        AllEmployees.add(new Employee(6, "Ramesh", 8000d));

//        Before Sorting
        System.out.println("Before Sorting");
        for(Employee employee : AllEmployees) {
            System.out.println(employee.getEno() + " " + employee.getName() + " " + employee.getSalary());
        }
//        After Sorting
        System.out.println("After Sorting");
        Collections.sort(AllEmployees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Employee employee : AllEmployees) {
            System.out.println(employee.getEno() + " " + employee.getName() + " " + employee.getSalary());
        }
    }
}
