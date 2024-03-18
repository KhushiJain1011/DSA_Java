// Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.
 

// Example 1:
// Input:
// N = 3 
// A[] = {1,2,3} 
// Output:
// -1
// Explanation:
// Since, each element in 
// {1,2,3} appears only once so there 
// is no majority element.

// Example 2:
// Input:
// N = 5 
// A[] = {3,1,3,3,2} 
// Output:
// 3
// Explanation:
// Since, 3 is present more
// than N/2 times, so it is 
// the majority element.

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int n1 = 3;
        int a1[] = {1,2,3};
        System.out.println(majorityElement(a1, n1));

        int n2 = 5;
        int a2[] = {3,1,3,3,2};
        System.out.println(majorityElement(a2, n2));
    }

    public static int majorityElement(int a[], int size){
        Arrays.sort(a);
        int m=0;
        int count = 0;
        if(a.length == 1) return a[0];

        for(int i=1; i<size; i++){
            if(a[i-1] == a[i]) {
                count++;
                if(count >= size/2){
                    m = a[i];
                }
            }
            else count = 0;
        }
        return m==0 ? -1 : m;
    }
}
