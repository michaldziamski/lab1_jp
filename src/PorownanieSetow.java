import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class PorownanieSetow {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczby (oddziel spacjami): ");
        String input = scanner.nextLine();
        String[] liczby = input.split(" ");
        scanner.close();

        for (String i : liczby) {
            try {
                int liczba = Integer.parseInt(i);
                hashSet.add(liczba);
                treeSet.add(liczba);
            } catch (NumberFormatException e) {
                System.out.println("Error: " + i + " nie jest liczbą");
            }
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);


    }
}
