import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        getUserInput(scanner, numbers);
        scanner.close();

        System.out.println("Ortalama: " + calculateAverage(numbers));
        printNumbersGreaterThan50(numbers);
        printDuplicateNumbers(numbers);
        printPositiveNegativeSums(numbers);
    }

    private static void getUserInput(Scanner scanner, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
        }
    }

    private static double calculateAverage(int[] numbers) {
        double total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    private static void printNumbersGreaterThan50(int[] numbers) {
        System.out.println("50'den büyük sayılar:");
        for (int number : numbers) {
            if (number > 50) {
                System.out.println(number);
            }
        }
    }

    private static void printDuplicateNumbers(int[] numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                duplicateNumbers.add(number);
            }
        }
        System.out.println("Tekrar eden sayılar: " + duplicateNumbers);
    }

    private static void printPositiveNegativeSums(int[] numbers) {
        int positiveSum = 0;
        int negativeSum = 0;

        for (int number : numbers) {
            if (number < 0) {
                negativeSum += number;
            }
            positiveSum += number;
        }

        System.out.println("Negatif Toplam: " + negativeSum);
        System.out.println("Pozitif Toplam: " + positiveSum);
    }
}