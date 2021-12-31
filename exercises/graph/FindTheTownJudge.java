// In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
// If the town judge exists, then:
// - The town judge trusts nobody.
// - Everybody (except for the town judge) trusts the town judge.
// - There is exactly one person that satisfies properties 1 and 2.
// You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
// Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
public class FindTheTownJudge {
    // Consider trust as a graph, all pairs are directed edge.
    // The point with in-degree - out-degree = N - 1 become the judge.
    public int findJudge(int n, int[][] trust) {
        int[] degrees = new int[n+1];
        for(int[] t : trust) {
            degrees[t[0]]--;
            degrees[t[1]]++;
        }
        for(int i=1; i<=n; i++) {
            if(degrees[i]  == n-1) {
                return i;
            }
        }
        return -1;
    }
}