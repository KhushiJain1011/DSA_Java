// Given a string S. For each index i(1<=i<=N-1), erase it if s[i] is equal to s[i-1] in the string.

// Example 1:
// Input:
// S = aabb
// Output:  ab 
// Explanation: 'a' at 2nd position is
// appearing 2nd time consecutively.
// Similiar explanation for b at
// 4th position.

// Example 2:
// Input:
// S = aabaa
// Output:  aba
// Explanation: 'a' at 2nd position is
// appearing 2nd time consecutively.
// 'a' at fifth position is appearing
// 2nd time consecutively.

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        String s1 = "aabb";
        System.out.println(removeConsecutiveCharacter(s1));

        String s2 = "aabaa";
        System.out.println(removeConsecutiveCharacter(s2));
    }

    public static String removeConsecutiveCharacter(String S){
        String ans = "" + S.charAt(0);
        for(int i=1; i<S.length(); i++){
            if(S.charAt(i-1) == S.charAt(i)){
                continue;
            }
            else{
                ans += S.charAt(i);
            }
        }
        return ans;
    }
}
