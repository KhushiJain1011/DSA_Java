// Given a string S consisting of upper/lower-case alphabets and empty space characters ‘ ‘. The string may contain spaces at the end. You will have return the length of last word which consists of alphabets only.

// Example 1:
// Input:
// S = "Geeks for Geeks"
// Output: 5
// Explanation: The last word is "Geeks" of length 5.

// Example 2:
// Input:
// S = "Start Coding Here "
// Output: 4
// Explanation: The last word is "Here" of length 4.

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s1 = "Geeks for Geeks";
        System.out.println(findLength(s1));

        String s2 = "Start Coding Here ";
        System.out.println(findLength(s2));
    }

    public static int findLength(String s) 
    { 
        // using split method:
        String words[] = s.split(" ");
        int n = words.length;
        return words[n-1].length();
    }
}
