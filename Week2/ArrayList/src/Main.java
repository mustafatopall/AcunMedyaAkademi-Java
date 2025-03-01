import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();

        //getUserInputStr(scanner,list,10);
        //alphabeticalSort(list);
        //getUserInputInt(scanner,numbers,5);
        //onlyEvenNumbers(numbers);
        //getUserInputStr(scanner,cities,5);
        //toHave(scanner,cities);
        //getUserInputInt(scanner,numbers2,10);
        //maxNumber(numbers2);
        //minNumber(numbers2);
        getUserInputInt(scanner,numbers3,10);
        System.out.println(numbers3);
        bigToSmaller(numbers3);
        System.out.println(numbers3);


       /* numbers3.get(5); // 5. indexdeki elemanı getirir
        numbers3.set(0,13); // 0. indexdeki elemanı set etmemizi sağlar yeni değeri 13 dür
        numbers3.remove(0); // 0. indexdeki elemanı listeden siler
        numbers3.clear(); // listemizin tüm elemanlarını temizler değerlerini null a çeker
        numbers3.size(); // listemizin uzunluğunu getirir */

        scanner.close();



    }
    private static void getUserInputStr(Scanner scanner, ArrayList<String> list,int reps) {
        for (int i = 0; i < reps; i++) {
            System.out.print((i + 1) + ". kelimeyi girin: ");
            String userInput = scanner.nextLine();
            list.add(userInput);
        }
    }

    private static void getUserInputInt(Scanner scanner, ArrayList<Integer> list,int reps) {
        for (int i = 0; i < reps; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            int userInput = scanner.nextInt();
            list.add(userInput);
        }
    }

    private static void alphabeticalSort(ArrayList<String> list){
        Collections.sort(list);
        System.out.print("Alfabetik Sıralanmış Hali : " + list);
    }

    private static void onlyEvenNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println("Listedeki çift sayılar : " + evenNumbers);
    }

    private static void toHave(Scanner scanner,ArrayList<String> cities){
        System.out.println("Listedeki Şehri Tahmin Edin :");
        String guess = scanner.nextLine();

        for(String citie : cities){
            if(citie.equals(guess)){
                System.out.println("Listede " +cities.indexOf(citie) + ". index de buluyor");
            }
            else {
                System.out.println("Listede Yok");
            }
        }
    }

    private static void maxNumber(ArrayList<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        System.out.println("Listedeki En Büyük Sayı : " + max);
    }
    private static void minNumber(ArrayList<Integer> numbers){
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println("Listedeki En Küçük Sayı : " + min);
    }

    private static void bigToSmaller(ArrayList<Integer> numbers3){
        for (int i = 0; i < numbers3.size()-1; i++) {
            for (int j = 0; j < numbers3.size()-i-1; j++) {
                if(numbers3.get(j) < numbers3.get(j+1)) {
                    int temp = numbers3.get(j);
                    numbers3.set(j, numbers3.get(j+1));
                    numbers3.set(j+1, temp);
                }
            }
        }
    }



    




}