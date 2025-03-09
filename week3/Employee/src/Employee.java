public class Employee {
    private int ıd;
    private String name;
    private double salary;
    private String department;

    public Employee(int ıd, String name, double salary, String department) {
        this.ıd = ıd;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void CalculateBonus(){
        System.out.println("Çalışan kişinin maaşı :" + getSalary() + " TL");
    }
}
