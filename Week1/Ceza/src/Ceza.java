import java.util.Scanner;

public class Ceza {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int HIZ_SINIR = 90;

    public static void main(String[] args) {
        cezaSorgula();
    }

    private static void cezaSorgula() {
        System.out.print("Hızınız kaç? : ");
        int hiz = sayiOku();

        if (hiz < HIZ_SINIR) {
            System.out.println("Herhangi bir cezai işleme tabi değilsiniz.");
        } else if (hiz <= 110) {
            System.out.println("1000 TL ceza kesildi.");
        } else if (hiz <= 130) {
            System.out.println("2000 TL ceza kesildi.");
        } else {
            System.out.println("Ehliyetinize el konulmuştur.");
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
}