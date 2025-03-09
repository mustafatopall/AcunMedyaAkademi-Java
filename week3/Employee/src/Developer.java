public class Developer extends Employee{
    private String about;

    public Developer(int ıd, String name, int salary, String department, String about) {
        super(ıd, name, salary, department);
        this.about = about;
    }

    @Override
    public void CalculateBonus() {
        System.out.println("Geliştiricinin primli maaşı :" + getSalary()*1.1 + " TL");
    }
}
