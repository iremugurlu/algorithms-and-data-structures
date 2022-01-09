public class RotateString {

    // O(n) time, O(n) space
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(s);
        String full = sb.toString();
        return full.contains(goal);
    }

    // O(n^2) time O(1) space
    public boolean rotateStringBruteForce(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        int shift = 0;
        while(shift < s.length()) {
            boolean complete = false;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) != goal.charAt((i + shift) % s.length())) {
                    break;
                } else {
                    if(i == s.length()-1) {
                        complete = true;
                    }
                }
            }
            if(complete) {
                return true;
            }
            shift++;
        }
        return false;
    }
}
