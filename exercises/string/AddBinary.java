// Given two binary strings a and b, return their sum as a binary string.
public class AddBinary {
    public String addBinary(String a, String b) {
        if(a.length() == 0 && b.length() == 0) return "";
        if(a.length() == 0) return b;
        if(b.length() == 0) return a;
        int sum = 0;
        if(a.length() > 0) {
            sum += Integer.valueOf(a.charAt(a.length()-1)+"");
        }
        if(b.length() > 0) {
            sum += Integer.valueOf(b.charAt(b.length()-1)+"");
        }
        if(sum == 0) {
            return addBinary(a.substring(0, a.length()-1), b.substring(0, b.length()-1)) + "0";
        } else if(sum == 1) {
            return addBinary(a.substring(0, a.length()-1), b.substring(0, b.length()-1)) + "1";
        } else if(sum == 2) {
            return addBinary(a.substring(0, a.length()-1), addBinary(b.substring(0, b.length()-1), "1")) + "0";
        } else {
            return addBinary(a.substring(0, a.length()-1), addBinary(b.substring(0, b.length()-1), "1")) + "1";
        }
    }
}