import java.util.*;

public class ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        String res = "";
        for(String word : words) {
            String replaced = replaceSuccessor(word, dictionary);
            res += replaced + " ";
        }
        return res.substring(0, res.length()-1);
    }
    
    public String replaceSuccessor(String word, List<String> dictionary) {
        String res = word;
        for(String d : dictionary) {
            if(res.startsWith(d)) res = d;
        }
        return res;
    }
}