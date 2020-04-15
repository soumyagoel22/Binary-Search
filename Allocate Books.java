import java.util.*;

public class Solution {
   static boolean isPossible(ArrayList<Integer> A, int n, int m, int curr_min)
    {
        int studentsRequired = 1;
        int curr_sum = 0;
        for (int i = 0; i < n; i++)
        {
            if (A.get(i) > curr_min)
                return false;
            if (curr_sum + A.get(i) > curr_min)
            {
                studentsRequired++;
                curr_sum = A.get(i);
                if (studentsRequired > m)
                    return false;
            }
            else
                curr_sum += A.get(i);
        }
        return true;
    }
    static int books(ArrayList<Integer> A,int B)
    {
        long sum = 0;
         int n=A.size();
        if (n < B)
            return -1;
        for (int i = 0; i < n; i++)
            sum += A.get(i);
        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (isPossible(A, n, B, mid))
            {
                result = Math.min(result, mid);
                end = mid - 1;
            }
      
            else
                start = mid + 1;
        }
        return result;
    }
}
