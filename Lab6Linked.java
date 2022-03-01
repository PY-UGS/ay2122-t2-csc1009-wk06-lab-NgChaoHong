package Lab6;
import java.util.*;

public class Lab6Linked {
    public static void main(String[] args)
    {
  
        LinkedList<Integer> ll = new LinkedList<>();
  
        // Adding elements to Linked List
        ll.add(1);
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(11);
  
        
        System.out.println("Question 1 :");
        addAndSort(ll, 12);

        System.out.println("\nQuestion 2 :");
        System.out.println("Linked List Before Swapping :-");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Swapping the elements
        swapValues(ll, 3, 11);
        System.out.println();
  
        System.out.println("Linked List After Swapping :-");
  
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\nQuestion 3 : ");
        System.out.println(findValue(1000, 9999, 500));

    }

    public static void addAndSort(LinkedList<Integer> list, int value){
        System.out.println(list);
        list.add(value);
        list.sort(null);
        System.out.println(list);
    }
  
    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo)
    {
  
        // Getting the positions of the elements
        int index1 = list.indexOf(indexOne);
        int index2 = list.indexOf(indexTwo);
  
        // Returning if the element is not present in the
        // LinkedList
        if (index1 == -1 || index2 == -1) {
            return;
        }
  
        // Swapping the elements
        list.set(index1, indexTwo);
        list.set(index2, indexOne);
    }

    public static int findValue(int min, int max, int amount){
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random rand = new Random();

        for (int i=0;i<500;i++){

            list.add(rand.nextInt(1000,9999));

        }

        int search = rand.nextInt(1000,9999);

        if(list.indexOf(search)>=0){

        System.out.println("Finding index of: "+ search);
        return list.indexOf(search);

        }
        else{

            return -1;

        }
    }



    
}
