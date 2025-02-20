import java.util.Scanner;

public class Sinav {
    private static final int[] notlar = new int[5];
    private static double ortalama;
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
    sonuc();
    }

    public static void sonuc(){
        sinavGiris();
        sinavOrtalama();
        if(ortalama < 50){
            System.out.println("Kaldınız. Not ortalamanız : " + ortalama);
        }
        System.out.println("Geçtiniz. Not ortalamanız :" + ortalama);
        System.out.println("En büyük notunuz : " +enBuyukSinav());
        System.out.println("En küçük notunuz : " +enKucukSinav());
    }


    public static void sinavGiris() {
        for (int i = 0; i < notlar.length; i++) {
            System.out.println(i+1 +". sınav notunuzu giriniz :");
            notlar[i] = sc.nextInt();
            if (notlar[i] < 30) {
                System.out.println("Düşük not aldığınız dersler var");
            }
        }
    }

    public static void sinavOrtalama() {
        for (int i : notlar) {
            ortalama += i;
        }
        ortalama = ortalama / 5;
    }

    public static int enBuyukSinav(){
        int enBuyuk = notlar[4];
        for (int not : notlar) {
            if (not > enBuyuk){
                enBuyuk = not;
            }
        }
        return enBuyuk;
    }

    public static int enKucukSinav(){
        int enkucuk = notlar[4];
        for (int not : notlar) {
            if (not < enkucuk){
                enkucuk = not;
            }
        }
        return enkucuk;
    }
}