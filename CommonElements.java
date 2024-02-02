// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?

// Example 1:
// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CommonElements {
    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 5;
        int n3 = 8;
        int A[] = {1, 5, 10, 20, 40, 80};
        int B[] = {6, 7, 20, 80, 100};
        int C[] = {3, 4, 15, 20, 30, 70, 80, 120};

        ArrayList<Integer> ans = commonElements(A,B,C, n1, n2, n3);
        display(ans);
    }

    static void display(ArrayList list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)+" ");
        }
    }

    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        HashSet<Integer> h3 = new HashSet<>();
        
        for(int i=0; i<A.length; i++){
            h1.add(A[i]);
        }
        for(int i=0; i<B.length; i++){
            h2.add(B[i]);
        }
        for(int i=0; i<C.length; i++){
            h3.add(C[i]);
        }
        
        HashSet<Integer> s1 = new HashSet<>();
        for(int m: h1){
            if(h2.contains(m)){
                s1.add(m);
            }
        }
        HashSet<Integer> s2 = new HashSet<>();
        for(int m: s1){
            if(h3.contains(m)){
                s2.add(m);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>(s2);
        Collections.sort(res);
        return res;
    }
}
