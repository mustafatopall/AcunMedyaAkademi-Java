public class PcMuhendis implements IMuhendis{
    private boolean askerlik;
    private boolean adli_sicil;

    public PcMuhendis(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if(askerlik){
            System.out.println("Askerliğimi Yaptım.");
        }
        else{
            System.out.println("Askerliğimi henüz yapmadım.");
        }

    }

    @Override
    public String mezuniyet_ortalaması(String derece) {
        return "Ortalaması" + derece;
    }

    @Override
    public void adli_sicil_kaydı() {
        if(adli_sicil){
            System.out.println("Adli Sicil Kaydım bulunuyor.");
        }else{
            System.out.println("herhangi adli sicil bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar Mühendisi Olarak Şu Şirketlerde Çalıştım :");

        for(String s : array){
            System.out.println(s);
        }
    }
}
