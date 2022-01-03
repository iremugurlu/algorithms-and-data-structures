public class Trie {
    
    Node root;

    public Trie() {
        root = new Node(' ');
    }
    
    public void insert(String word) {
        char[] chars = word.toCharArray();
        Node curr = root;
        for(int i=0; i<chars.length; i++) {
            if(curr.children[chars[i] - 'a'] == null) {
                curr.children[chars[i] - 'a'] = new Node(chars[i]);
            } 
            curr = curr.children[chars[i] - 'a'];
        }
        curr.isWord = true;
    }
    
    public boolean search(String word) {
        char[] chars = word.toCharArray();
        Node curr = root;
        for(int i=0; i<chars.length; i++) {
            if(curr.children[chars[i] - 'a'] != null) {
                curr = curr.children[chars[i] - 'a'];
            } else {
                return false;
            }
        }
        if(curr.isWord) return true;
        else return false;
    }
    
    public boolean startsWith(String prefix) {
        char[] chars = prefix.toCharArray();
        Node curr = root;
        for(int i=0; i<chars.length; i++) {
            if(curr.children[chars[i] - 'a'] != null) {
                curr = curr.children[chars[i] - 'a'];
            } else {
                return false;
            }
        }
        return true;
    }
}

public class Node {
    char val;
    boolean isWord;
    Node[] children;
    Node(char val) { 
        this.val = val; 
        isWord = false;
        children = new Node[26];
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */