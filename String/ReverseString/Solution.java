package String.ReverseString;

public class Solution {
    public static String reverse(String str){
        String reversed = "";
        for(int i = str.length() -1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args){
        String str = "hello";
        System.out.println(reverse(str));
    }
}
