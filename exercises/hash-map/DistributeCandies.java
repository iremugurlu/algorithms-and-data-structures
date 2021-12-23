// Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
// The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, 
// and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
// Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Map<Integer, Integer> candies = new HashMap<>();
        for(int c : candyType) {
            if(candies.containsKey(c)) {
                candies.put(c, candies.get(c));
            } else {
                candies.put(c, 1);
            }
        }
        if(candies.keySet().size() >= candyType.length/2) {
            return candyType.length/2;
        } else {
            return candies.keySet().size();
        }
    }
}