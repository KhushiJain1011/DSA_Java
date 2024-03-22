// Given a string consisting of lowercase english alphabets. Find the repeated character present first in the string.
// NOTE - If there are no repeating characters return '#'.

// Example 1:
// Input:
// S = "geeksforgeeks"
// Output: g
// Explanation: g, e, k and s are the repeating
// characters. Out of these, g occurs first. 

// Example 2:
// Input: 
// S = "abcde"
// Output: -1
// Explanation: No repeating character present. (You need to return '#')


public class RepeatedCharacters {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        System.out.println(firstRep(s1));

        String s2 = "abcde";
        System.out.println(firstRep(s2));
    }

    public static char firstRep(String S){
        char res = '#';
        for(int i=0; i<S.length(); i++){
            for(int j=i+1; j<S.length(); j++){
                if(S.charAt(i) == S.charAt(j)){
                    return S.charAt(i);
                }
            }
        }
        return res;
    }
}