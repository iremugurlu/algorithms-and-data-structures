// You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move. 
// Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
// Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int height = 0;
        int width = 0;
        for(char m : moves.toCharArray()) {
            if(m == 'U') {
                height++;
            } else if(m == 'D') {
                height--;
            } else if(m == 'L') {
                width--;
            } else {
                width++;
            }
        }
        return (height == 0 && width == 0);
    }
}