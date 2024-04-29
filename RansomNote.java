package leetcode;

public class RansomNote {

    public static boolean ramsonContruction(String ransom, String magazine){
        for (int i = 0; i < ransom.length(); i++) {
            char r = ransom.charAt(i);
            int matchingIndex = magazine.indexOf(r);
            if(matchingIndex == -1){
                return false;
            } else {
                magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex+1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ramsonContruction("aa", "ab"));
    }

}
