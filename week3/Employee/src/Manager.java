public class Manager extends Employee {
    private int teamSize;

    public Manager(int ıd, String name, int salary, String department, int teamSize) {
        super(ıd, name, salary, department);
        this.teamSize = teamSize;
    }

    @Override
    public void CalculateBonus() {
        System.out.println("Yöneticinin primli maaşı :" + getSalary()*1.2 + " TL");
    }
}
