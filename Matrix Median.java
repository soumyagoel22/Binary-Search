import java.util.*;

public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        int i,j,n,m,n1,n2,n3;
        n=A.size();
        m=A.get(0).size();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                B.add(A.get(i).get(j));
            }
        }
        Collections.sort(B);
        n1=B.size()-1;
        n2=n1/2;
        n3=B.get(n2);
        return n3;
    }
}
