// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

// Example 1:
// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i

// Example 2:
// Input:
// S = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole
// string , the input string becomes
// mno.pqr

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s1 = "i.like.this.program.very.much";
        System.out.println(reverseWords(s1));

        String s2 = "pqr.mno";
        System.out.println(reverseWords(s2));
    }

    static String reverseWords(String S)
    {
        String[] str = S.split("\\.");
        String ans = "";
        for(int i=str.length-1; i>=0; i--){
            if(i==0){
                ans+=str[i];
            }
            else{
                ans += str[i] + ".";
            }
        }
        return ans;
    }
    
}