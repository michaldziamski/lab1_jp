import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Czas {
    public static void main(String[] args){
        int liczba = 10000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        long start = System.nanoTime();
        for (int i=0; i<liczba; i++){
            arrayList.add(i);
        }
        long koniec = System.nanoTime();
        long czasArrayListD = koniec - start;

        start = System.nanoTime();
        for (int i=0; i<liczba; i++){
            linkedList.add(i);
        }
        koniec = System.nanoTime();
        long czasLinkedListD= koniec - start;

        start = System.nanoTime();
        for (int i = 0; i<liczba; i++){
            arrayList.set(i,0);
        }
        koniec = System.nanoTime();
        long czasArrayListM = koniec - start;

        start = System.nanoTime();
        for (int i = 0; i<liczba; i++){
            linkedList.set(i,0);
        }
        koniec = System.nanoTime();
        long czasLinkedListM = koniec - start;

        start = System.nanoTime();
        for (int i=0; i<liczba; i++){
            arrayList.remove(0);
        }
        koniec= System.nanoTime();
        long czasArrayListO = koniec - start;

        start = System.nanoTime();
        for (int i=0; i<liczba; i++){
            linkedList.remove(0);
        }
        koniec = System.nanoTime();
        long czasLinkedListO = koniec-start;

        System.out.println("Działania były dla 10000 elementów, a wyniki czasowe są w nanosekundach");

        System.out.println("Dodawanie:");
        System.out.println("ArrayList: " + czasArrayListD);
        System.out.println("LinkedList: " + czasLinkedListD);
        System.out.println();

        System.out.println("Odejmowanie:");
        System.out.println("ArrayList: " + czasArrayListO);
        System.out.println("LinkedList: " + czasLinkedListO);
        System.out.println();

        System.out.println("Modyfikacja:");
        System.out.println("ArrayList: " + czasArrayListM);
        System.out.println("LinkedList: " + czasLinkedListM);




    }
}
