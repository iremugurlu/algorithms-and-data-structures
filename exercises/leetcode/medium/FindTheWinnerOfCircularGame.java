public class FindTheWinnerOfCircularGame {
    public int findTheWinner(int n, int k) {
        List<Integer> circle = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            circle.add(i);
        }
        int index = 0;
        while(circle.size()>1) {
            int loser = (index + k - 1) % circle.size();
            circle.remove(loser);
            index = loser % circle.size();
        }
        return circle.get(0);
    }
}