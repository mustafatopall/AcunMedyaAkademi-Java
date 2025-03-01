import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
      int[] arr = {1,72,33,7,-1,11,23,8,3};
      String[] arr2 = {"mustafa","murat","ali","veli","ömer","eren"};

        Arrays.sort(arr);
        Arrays.sort(arr2);
        // sort methodu küçükten büyüğe doğru sıralama yapar.

        //Arrays.sort(arr,1,4); burada ise dizideki elemanların sadece 1 den 3. indekse kadar olan elamanları sıralar


        for (int number : arr) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (String name : arr2) {
            System.out.print(name + " ");
        }

        byte[] arr3 = {10,20,30};
        char[] arr4 = {'g','f','m'};
        int[] arr5 = {1,2,3,4,5};
        double[] arr6 = {1.0,2.0,3.0,4.0,5.0};

        byte key1=20;
        char key2='f';
        int key3=3;
        double key4=4.0;

        System.out.println(
                key1 + " dizi de bulundu: "
                        + Arrays.binarySearch(arr3, key1));
        System.out.println(
                key2 + " dizi de bulundu: "
                        + Arrays.binarySearch(arr4, key2));
        System.out.println(
                key3 + " dizi de bulundu: "
                        + Arrays.binarySearch(arr5, key3));
        System.out.println(
                key4 + " dizi de bulundu: "
                        + Arrays.binarySearch(arr6, key4));


        int arr7[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr8[] = { 1, 2, 3, 4, 5, 6, 7 };


        int[] copy = Arrays.copyOfRange(arr7, 2, 6);
        // arr 7 deki elemanlardan 2 6 aralığındaki indexdeki elemanları copie dizisie kopyaladı.
        for (int i : copy)
            System.out.print(i + "  ");

        System.out.println(Arrays.equals(arr7, arr8)); // arr7 dizisi arr8 dizisine eşit mi true ya da false döner;

        int[] arr9 = new int[5];
        Arrays.fill(arr9, 1); // oluşturduğumuz 5 elemanlık yeni diziyi tüm elemanları 1 olacak şekilde doldurur
        for (int i : arr9)
            System.out.print(i + "  ");









    }
}