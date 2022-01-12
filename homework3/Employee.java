package homework3;

public class Employee {
    private Integer eno;
    private String name;
    private Double salary;

    public Employee() {}
    public Employee(Integer eno, String name, double salary) {
        super();
        this.eno = eno;
        this.name = name;
        this.salary = salary;
    }

    public Integer getEno() {
        return eno;
    }
    public void setEno() {
        this.eno = eno;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Employee_no = " + eno + ", Employee_name = " + name + ", Employee salary = " + salary + "]";
    }
}
