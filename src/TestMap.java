import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz klucze oraz wartości (wpisz '0' aby skończyć):");

        while (true) {
            System.out.print("Klucz: ");
            Integer klucz = Integer.parseInt(scanner.nextLine());

            if (klucz==0) {
                break;
            }

            System.out.print("Wartość: ");
            String wartosc = scanner.nextLine();

            hashMap.put(klucz, wartosc);
            treeMap.put(klucz, wartosc);
        }

        scanner.close();

        System.out.println("Podane wartości w HashMapie:");
        for (Integer klucz : hashMap.keySet()) {
            System.out.println("klucz: " + klucz + ", wartość: " + hashMap.get(klucz));
        }

        System.out.println("Podane wartości w TreeMapie:");
        for (Integer klucz : treeMap.keySet()) {
            System.out.println("klucz: " + klucz + ", wartość: " + treeMap.get(klucz));
        }


    }
}


