//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PcMuhendis muhendis1 = new PcMuhendis(true,false);
        MakineMuhendis muhendis2 = new MakineMuhendis(true,true);
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_kaydı();

        String[] tecrübe = {"Havelsan","Türkcell","Aselsan"};
        muhendis1.is_tecrubesi(tecrübe);
    }
}