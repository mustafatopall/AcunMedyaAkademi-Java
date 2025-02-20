import java.util.Scanner;

public class Restoran {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static int toplamTutar = 0;

    public static void main(String[] args) {
        menuyuGoster();
    }

    private static void menuyuGoster() {
        while (true) {
            System.out.println("""
                    ***** MENÜ *****
                    1. Tavuk Teriyaki        : 255 TL
                    2. Trüflü Tavuk          : 300 TL
                    3. Salsa Meksikana       : 350 TL
                    ***** DİĞER İŞLEMLER *****
                    4. Hesabı İsteme ve Ödeme
                    *********************
                    """);
            System.out.print("Lütfen işleminizi seçin: ");
            String secim = SCANNER.nextLine().trim();

            switch (secim) {
                case "1" -> urunEkle("Tavuk Teriyaki", 255);
                case "2" -> urunEkle("Trüflü Tavuk", 300);
                case "3" -> urunEkle("Salsa Meksikana", 350);
                case "4" -> odemeIsleminiGerceklestir();
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.\n");
            }
        }
    }

    private static void urunEkle(String urunAdi, int fiyat) {
        System.out.printf("(%s)'dan kaç servis istiyorsunuz? : ", urunAdi);
        int adet = sayiOku();
        if (adet > 0) {
            int tutar = adet * fiyat;
            toplamTutar += tutar;
            System.out.printf("%s'dan %d servis eklendi.%n", urunAdi, adet);
            System.out.println("Başka bir arzunuz");
        } else {
            System.out.println("Geçersiz adet girişi! Lütfen 0'dan büyük sayı girin.\n");
        }
    }

    private static int sayiOku() {
        while (true) {
            try {
                return Integer.parseInt(SCANNER.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Hatalı giriş! Lütfen sayısal bir değer girin: ");
            }
        }
    }

    private static void odemeIsleminiGerceklestir() {
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        System.out.println("Ödeme işlemi gerçekleştiriliyor. Afiyet olsun!");
        System.exit(0);
    }
}