package String.ValidAnagram;

public class Solution{
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        int[] count = new int[26];

        for(int i = 0; i < str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;

        }

        for(int value : count){
            if(value != 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1, str2));
    }
}
