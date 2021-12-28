// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.
public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }
    
    public String backspace(String s) {
        String res = "";
        int ignore = 0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == '#') {
                ignore++;
            } else {
                if(ignore == 0) {
                    res = s.charAt(i) + res;
                } else {
                    ignore--;
                }
            }
        }
        return res;
    }
}