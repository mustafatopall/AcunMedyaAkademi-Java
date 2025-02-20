import java.util.Scanner;

public class Market {
    private static final Scanner sc = new Scanner(System.in);
    private static final String INDIRIM_KODU = "mustafa10";
    private static final int URUN_FIYATI = 80;
    private static int urunAdeti = 0;

    public static void main(String[] args) {
        menuyuGoster();
    }

    private static void menuyuGoster() {
        while (true) {
            System.out.println("""
                    ***** İŞLEMLER *****
                    1. Hiqqy Protein Bar (CARAMEL)        : 80 TL
                    2. Hiqqy Protein Bar (COCONUT)        : 80 TL
                    3. Hiqqy Protein Bar (DUBAİ CHOCOLATE): 80 TL
                    4. Sepeti Görüntüle
                    0. Ödeme Adımı
                    *********************
                    """);
            System.out.print("Lütfen işleminizi seçin: ");
            String secim = sc.nextLine().trim();

            switch (secim) {
                case "1" -> urunEkle("CARAMEL");
                case "2" -> urunEkle("COCONUT");
                case "3" -> urunEkle("DUBAİ CHOCOLATE");
                case "4" -> sepetiGoster();
                case "0" -> odemeIsleminiGerceklestir();
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.\n");
            }
        }
    }

    private static void urunEkle(String urunTuru) {
        System.out.printf("Hiqqy Protein Bar (%s)'dan kaç adet eklemek istiyorsunuz? : ", urunTuru);
        int adet = sayiOku();
        if (adet > 0) {
            urunAdeti += adet;
            System.out.printf("Hiqqy Protein Bar (%s)'dan sepetinize %d adet eklenmiştir.%n%n", urunTuru, adet);
        } else {
            System.out.println("Geçersiz adet girişi! Lütfen 0'dan büyük sayı girin.\n");
            urunEkle(urunTuru);
        }
    }

    private static int sayiOku() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Hatalı giriş! Lütfen sayısal bir değer girin: ");
            }
        }
    }

    private static void sepetiGoster() {
        double sepetTutari = urunAdeti * URUN_FIYATI;
        System.out.printf("Sepetinizde %d adet ürün vardır, sepet tutarı: %.2f TL%n%n", urunAdeti, sepetTutari);
    }

    private static void odemeIsleminiGerceklestir() {
        sepetiGoster();
        double sepetTutari = urunAdeti * URUN_FIYATI;
        System.out.print("İndirim Kodunuz var mı? (E/H): ");
        String cevap = sc.nextLine().trim().toUpperCase();

        if (cevap.equals("E")) {
            sepetTutari = indirimiUygula(sepetTutari);
        } else if (!cevap.equals("H")) {
            System.out.println("Yanlış giriş! Lütfen cevabınız evet ise E, hayır ise H girin.\n");
            odemeIsleminiGerceklestir();
            return;
        }
        System.out.printf("Ödemeniz gereken tutar: %.2f TL%n", sepetTutari);
        System.out.println("Ödeme işlemi gerçekleşti. İyi günler dileriz.");
        System.exit(0);
    }

    private static double indirimiUygula(double tutar) {
        while (true) {
            System.out.print("İndirim kodunuzu girin: ");
            String girilenKod = sc.nextLine().trim();
            if (girilenKod.equals(INDIRIM_KODU)) {
                System.out.println("Harika! %10 indirim kazandınız.");
                return tutar * 0.9;
            } else {
                System.out.println("Geçersiz kod! Tekrar deneyin.");
            }
        }
    }
}