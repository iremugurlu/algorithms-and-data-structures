// A frog is crossing a river. The river is divided into some number of units, and at each unit, there may or may not exist a stone. 
// The frog can jump on a stone, but it must not jump into the water.
// Given a list of stones' positions (in units) in sorted ascending order, determine if the frog can cross the river by landing on the last stone. 
// Initially, the frog is on the first stone and assumes the first jump must be 1 unit.
// If the frog's last jump was k units, its next jump must be either k - 1, k, or k + 1 units. 
// The frog can only jump in the forward direction.
class FrogJump {
    public boolean canCross(int[] stones) {
        for(int i=3; i<stones.length; i++) {
            if(stones[i] > stones[i-1]*2) return false;  
        }
        HashSet<Integer> stonePositions = new HashSet<>();
        for(int stone : stones) {
            stonePositions.add(stone);
        }
        int lastStone = stones[stones.length-1];
        Stack<Integer> positions = new Stack<>();
        Stack<Integer> jumps = new Stack<>();
        positions.add(0);
        jumps.add(0);
        Set<List<Integer>> visited = new HashSet<>();
        visited.add(Arrays.asList(0, 0));
        while(!positions.isEmpty()) {
            int position = positions.pop();
            int jump = jumps.pop();
            for(int i=jump-1; i<=jump+1; i++) {
                if(i<=0) continue;
                
                int nextPos = position+i;
                
                List<Integer> target = Arrays.asList(nextPos, i);
                
                if(nextPos == lastStone) return true;
                else if(stonePositions.contains(nextPos) && !visited.contains(target)) {
                    positions.add(nextPos);
                    jumps.add(i);
                    visited.add(target);
                }
            }
        }
        return false;
    }
}