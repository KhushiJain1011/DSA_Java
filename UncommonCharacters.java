// Given two strings A and B consisting of lowercase english characters. Find the characters that are not common in the two strings. 

// Note :- Return the string in sorted order.

// Example 1:

// Input:
// A = geeksforgeeks
// B = geeksquiz
// Output: fioqruz
// Explanation: 
// The characters 'f', 'i', 'o', 'q', 'r', 'u','z' 
// are either present in A or B, but not in both.
// Example 2:

// Input:
// A = characters
// B = alphabets
// Output: bclpr
// Explanation: The characters 'b','c','l','p','r' 
// are either present in A or B, but not in both.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class UncommonCharacters {
static    String UncommonChars(String a, String b)
    {
        // code here
         HashSet<Character> set = new HashSet<>();
         
        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(a.charAt(i) + "")) {
                set.add(a.charAt(i));
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (!a.contains(b.charAt(i) + "")) {
                set.add(b.charAt(i));
            }
        }
        String ans="";
        ArrayList<Character> arr=new ArrayList<>(set);
        Collections.sort(arr);
         for(char val:arr){
             ans+=val;
         }
         if(set.isEmpty())return "-1"; 
         
         return ans;
    }
    public static void main(String[] args) {
    String    A = "geeksforgeeks";
    String B = "geeksquiz";
    System.out.println(UncommonChars(A,B));
    }
}