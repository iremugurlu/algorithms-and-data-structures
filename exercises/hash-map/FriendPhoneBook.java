import java.util.*;

public class FriendPhoneBook {

    static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            addFriend(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            getFriend(s);
        }
        in.close();
    }
    
    public static void addFriend(String name, int phone) {
        map.put(name, phone);
    }
    
    public static void getFriend(String name) {
        if(map.keySet().contains(name)) {
            System.out.println(name+"="+map.get(name));
        } else {
            System.out.println("Not found");
        }
    }
    
}

