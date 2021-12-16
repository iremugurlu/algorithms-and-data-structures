public class MinimumIndexSumOfTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for(int i=0; i<list1.length; i++) {
            map.put(list1[i], i);
        }
        for(int i=0; i<list2.length; i++) {
            System.out.println(list2[i]);
            if(map.containsKey(list2[i])) {
                map.put(list2[i], map.get(list2[i]) + i);
                if(res.size() == 0) {
                    res.add(list2[i]);
                } else {
                    String key = res.get(0);
                    if(map.get(list2[i]) < map.get(key)) {
                        res.clear();
                        res.add(list2[i]);
                    } else if(map.get(list2[i]).equals(map.get(key))) {
                        res.add(list2[i]);
                    }
                }
            }
        }
        String[] result = new String[res.size()];
        for(int i=0; i<res.size(); i++) {
            result[i] = res.get(i);
        } 
        return result;
    }
}