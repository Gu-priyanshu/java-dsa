package String.CountVowels;


public class Solution {
    public static int vowelsCount(String str){

        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String str = "Hello";
        str = str.toLowerCase();
        int result = vowelsCount(str);
        System.out.println("vowels: " + result);
    }
}
