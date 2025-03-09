//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Manager yönetici1 = new Manager(101,"Ali",20000,"Yönetim",15);
        Developer geliştirici1 = new Developer(201,"Mustafa",20000,"Yazılım Geliştirme","test engineer");

        yönetici1.CalculateBonus();
        geliştirici1.CalculateBonus();

    }
}