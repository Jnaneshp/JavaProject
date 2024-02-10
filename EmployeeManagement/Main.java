
 class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +"name='" + name + '\'' +", id=" + id +", salary=" + salary +'}';
    }
}

public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Dileep", 054, 50000.0);
        Employee employee2 = new Employee("Gandeep", 057, 60000.0);

        
        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("ID: " + employee1.getId());
        System.out.println("Salary: rs" + employee1.getSalary());
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("Name: " + employee2.getName());
        System.out.println("ID: " + employee2.getId());
        System.out.println("Salary: rs" + employee2.getSalary());
        System.out.println();

        
        employee1.setName("Dileep Patkhar");
        employee1.setSalary(2000.0 );

        System.out.println("Updated Employee 1:");
        System.out.println(employee1 );
    }
}
