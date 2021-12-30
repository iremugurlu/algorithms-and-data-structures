// Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
// Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.
public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) {
            return false;
        }
        // this map will contains card numbers and frequency
        Map<Integer, Integer> cards = new HashMap<>();
        PriorityQueue<Integer> cardTypes = new PriorityQueue<>();
        for(int card : hand) {
            if(cards.containsKey(card)) {
                cards.put(card, cards.get(card)+1);
            } else {
                cards.put(card, 1);
                cardTypes.add(card);
            }
        }
        while(cards.size() > 0) {
            int val = cardTypes.peek();
            if(cards.get(val) > 1) {
                cards.put(val, cards.get(val)-1);
            } else { 
                cards.remove(val);
                cardTypes.remove(val);
            }
            for(int i=1; i<groupSize; i++) {
                if(cards.containsKey(val+i)) {
                    if(cards.get(val+i) > 1) {
                        cards.put(val+i, cards.get(val+i)-1);
                    } else {
                        cards.remove(val+i);
                        cardTypes.remove(val+i);
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}