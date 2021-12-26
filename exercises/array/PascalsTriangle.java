// Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above.
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            curr.add(0, 1);
            for(int j=1; j<curr.size()-1; j++) {
                curr.set(j, curr.get(j)+curr.get(j+1));
            }
            res.add(new ArrayList<Integer>(curr));
        }
        return res;
    }
}