// Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
// I 1
// V 5
// X 10
// L 50
// C 100
// D 500
// M 1000

// Example 1:
// Input:
// s = V
// Output: 5

// Example 2:
// Input:
// s = III 
// Output: 3

import java.util.HashMap;

public class RomanToIntegerConversion {
    public static void main(String[] args) {
        String s1 = "V";
        System.out.println(romanToDecimal(s1));
        
        String s2 = "III";
        System.out.println(romanToDecimal(s2));
    }

    public static int romanToDecimal(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        
        int result = map.get(str.charAt(0));
        
        for(int i=1; i<str.length(); i++){
            if(map.get(str.charAt(i)) > map.get(str.charAt(i-1))){//minus
                result += (map.get(str.charAt(i)) - 2*map.get(str.charAt(i-1)));
            }else{
                result += map.get(str.charAt(i));
            }
        }
        
    return result;
    }
}
