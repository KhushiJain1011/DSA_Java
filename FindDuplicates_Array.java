// Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1]. 
// Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array. 

// Example 1:
// Input:
// N = 4
// a[] = {0,3,1,2}
// Output: 
// -1
// Explanation: 
// There is no repeating element in the array. Therefore output is -1.

// Example 2:
// Input:
// N = 5
// a[] = {2,3,1,2,3}
// Output: 
// 2 3 
// Explanation: 
// 2 and 3 occur more than once in the given array.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates_Array {
    public static void main(String[] args) {
        int n1 = 4;
        int a1[] = {0,3,1,2};
        ArrayList res1 = duplicates(a1, n1);
        System.out.println(res1);

        int n2 = 5;
        int a2[] = {2,3,1,2,3};
        ArrayList res2 = duplicates(a2, n2);
        System.out.println(res2);
    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i: arr){
           if(map.containsKey(i)){
              map.replace(i,map.get(i)+1);
           }else{
               map.put(i,1);
           }
       }
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(Map.Entry<Integer, Integer> val: map.entrySet()){
           if(val.getValue()!=1){
               list.add(val.getKey());
           }
       }
       if(list.isEmpty()){
           list.add(-1);
           return list;
       }
       Collections.sort(list);
       return list;
    }
}
