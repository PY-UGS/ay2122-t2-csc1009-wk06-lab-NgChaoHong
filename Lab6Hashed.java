package Lab6;
import java.util.*;

public class Lab6Hashed {
    public static final int maxCount = 500;
    public static void main(String args[]){
        HashMap<Integer, Integer> myHashMap = new HashMap<Integer, Integer>();

        myHashMap.put(0,1);
        myHashMap.put(1,3);
        myHashMap.put(2,5);
        myHashMap.put(3,7);
        myHashMap.put(4,9);
        myHashMap.put(5,11);
        System.out.println("\nQNS 4 Hash map before insert: " + myHashMap);
        insert(myHashMap, 6);
        System.out.println("QNS 4 Hash map after insert: " + myHashMap);

        System.out.println("\nQNS 5 Hash map before swap: " + myHashMap);
        SwapHashMap(myHashMap, 1, 5);
        System.out.println("QNS 5 Hash map after swap: " + myHashMap);

        HashMap<Integer, Integer> HashMapQn3 = new HashMap<Integer, Integer>();
        Random rand = new Random();
        int searchValue = rand.nextInt(1000,9999);
        System.out.println("\nQNS 6 Value to search is : "+ searchValue);

        for (int i = 0; i < maxCount; i++){
            HashMapQn3.put(i, rand.nextInt(1000,9999));
        }
        System.out.println(HashMapQn3);
        System.out.println("\nQNS 6 Index (key) of value is at: " + SearchValue(HashMapQn3, searchValue));
    
        
    }

    public static void insert(HashMap<Integer, Integer> hashmap, int value){
        for(int i = 1; i < hashmap.size(); i++){
            int previous = (int)hashmap.get(i-1);
            if(value > (int)hashmap.get(hashmap.size()-1)){
                hashmap.put(hashmap.size(), value);
                return;
            }
            if((int)hashmap.get(i) > value && value > previous){
                hashmap.put(hashmap.size(),0);
                for(int j = hashmap.size()-1; j>=i ;j--){
                    hashmap.put(j, hashmap.get(j-1));
                }
                hashmap.put(i ,value);
                return;
            
            }
            if(value < (int)hashmap.get(0)){
                for(int j = hashmap.size(); j>=0 ;j--){
                    hashmap.put(j, hashmap.get(j-1));
                }
                hashmap.put(0 ,value);
                return;
            }
            

        }
    }

public static void SwapHashMap(HashMap<Integer,Integer> hashmap, int value1, int value2){
    int temp = (int)hashmap.get(value1);
    hashmap.put(value1, hashmap.get(value2));
    hashmap.put(value2, temp);

    }


public static int SearchValue(HashMap<Integer, Integer>hashmap, int SearchValue){
    for (int j = 0; j < maxCount; j++){
        if((int)hashmap.get(j) == SearchValue){
            return j;
        }
    }

    return -1;

    }
}
