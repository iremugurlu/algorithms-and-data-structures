// Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
public class ToLowerCase {
    public String toLowerCase(String s) {
        String lower = "";
        for(char c : s.toCharArray()) {
            if(Character.isUpperCase(c)) {
                lower += Character.toLowerCase(c);
            } else {
                lower += c;
            }
        }
        return lower;
    }
}
