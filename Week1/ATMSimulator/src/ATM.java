import java.util.Scanner;

public class ATM {
    private static final String PIN = "25102004";
    private static int bakiye = 0;
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ATM'ye hoşgeldiniz!");
        if (!pinDogrula()) {
            System.out.println("3 kez hatalı giriş yaptınız. Hesabınız kilitlendi.");
            return;
        }
        menuGoster();
    }

    private static boolean pinDogrula() {
        int kalanHak = 3;
        while (kalanHak > 0) {
            System.out.print("Şifrenizi girin: ");
            String input = sc.nextLine();
            if (PIN.equals(input)) {
                System.out.println("Giriş Başarılı!\n");
                return true;
            }
            kalanHak--;
            System.out.println("Yanlış PIN! Kalan hakkınız: " + kalanHak);
        }
        return false;
    }

    private static void menuGoster() {
        while (true) {
            System.out.println("""
                ***** İŞLEMLER *****
                1. Bakiye Görüntüleme
                2. Para Yatırma
                3. Para Çekme
                4. Çıkış
                *********************
                """);
            System.out.print("Lütfen işleminizi seçin: ");
            String secim = sc.nextLine();

            switch (secim) {
                case "1" -> bakiyeGoster();
                case "2" -> paraYatir();
                case "3" -> paraCek();
                case "4" -> {
                    System.out.println("Çıkış yapılıyor. İyi günler!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Geçersiz seçim! Lütfen tekrar deneyin.");
            }
        }
    }

    private static void bakiyeGoster() {
        System.out.println("Mevcut bakiyeniz: " + bakiye + " TL\n");
    }

    private static void paraYatir() {
        System.out.print("Yatırmak istediğiniz tutarı girin: ");
        int miktar = intOku();
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiyeniz: " + bakiye + " TL\n");
        } else {
            System.out.println("Geçersiz tutar! Lütfen tekrar deneyin.\n");
        }
    }

    private static void paraCek() {
        System.out.print("Çekmek istediğiniz tutarı girin: ");
        int miktar = intOku();
        if (miktar <= 0) {
            System.out.println("Geçersiz tutar! Lütfen tekrar deneyin.\n");
        } else if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye! Mevcut bakiyeniz: " + bakiye + " TL\n");
        } else {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Yeni bakiyeniz: " + bakiye + " TL\n");
        }
    }

    private static int intOku() {
        while (true) {
            try {
                int miktar = Integer.parseInt(sc.nextLine().trim());
                return miktar;
            } catch (NumberFormatException e) {
                System.out.print("Hatalı giriş! Lütfen sayısal bir değer girin: ");
            }
        }
    }
}