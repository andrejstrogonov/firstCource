import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String patronimic;
    private int count = 0;

    private double salary;
    private int department;
    private static int id;

    public String nameAndSurnameAndPatronimic() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronimic='" + patronimic + '}';
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronimic='" + patronimic + '\'' +
                ", count=" + count +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    // Constructor
    public Employee(String name, String surname, String patronimic,double salary, int department) {
        this.name = name;
        this.surname = surname;
        this.patronimic = patronimic;
        this.salary = salary;
        this.department = department;
        this.id = id++;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getPatronimic() {
        return patronimic;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }


    public static int getId() {
        return id;
    }


    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(patronimic, employee.patronimic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronimic, salary, department);
    }
}
