// Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.
// Note:-
// If the strings are anagrams you have to return True or else return False
// |s| represents the length of string s.

// Example 1:
// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same characters with
//         same frequency. So, both are anagrams.

// Example 2:
// Input:a = allergy, b = allergic
// Output: NO
// Explanation: Characters in both the strings are 
//         not same, so they are not anagrams.

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // case 1: 
        String a1 = "geeksforgeeks";
        String a2 = "forgeeksgeeks";
        boolean resA = isAnagram(a1, a2);
        if(resA)    System.out.println("YES");
        else System.out.println("NO");

        // case 2:
        String b1 = "allergy";
        String b2 = "allergic";
        boolean resB = isAnagram(b1, b2);
        if(resB)    System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean isAnagram(String s1, String s2){
        int len_s1 = s1.length();
        int len_s2 = s2.length();
        
        if(len_s1 != len_s2) return false;
        
        char sa[] = s1.toCharArray();
        char sb[] = s2.toCharArray();
        
        Arrays.sort(sa);
        Arrays.sort(sb);
        if(Arrays.equals(sa, sb)){
            return true;
        }
        else{
            return false;
        }
    }
}
