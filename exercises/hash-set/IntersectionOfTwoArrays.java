class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> common = new HashSet<Integer>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums2) {
            list.add(num);
        }
        for(int num : nums1) {
            if(list.contains(num) && ! common.contains(num)) common.add(num); 
        }
        int[] res = new int[common.size()];
        Iterator<Integer> it = common.iterator();
        for(int i=0; i<common.size(); i++) {
            res[i] = it.next();
        }
        return res;
    }
}