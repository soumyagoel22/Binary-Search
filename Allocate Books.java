import java.util.*;

public class Solution {
    // public int books(ArrayList<Integer> A, int B) {
   static boolean isPossible(ArrayList<Integer> A, int n, int m, int curr_min)
    {
        int studentsRequired = 1;
        int curr_sum = 0;
      
        // iterate over all books
        for (int i = 0; i < n; i++)
        {
            // check if current number of pages are greater
            // than curr_min that means we will get the result
            // after mid no. of pages
            if (A.get(i) > curr_min)
                return false;
      
            // count how many students are required
            // to distribute curr_min pages
            if (curr_sum + A.get(i) > curr_min)
            {
                // increment student count
                studentsRequired++;
      
                // update curr_sum
                curr_sum = A.get(i);
      
                // if students required becomes greater
                // than given no. of students,return false
                if (studentsRequired > m)
                    return false;
            }
            // else update curr_sum
            else
                curr_sum += A.get(i);
        }
        return true;
    }
      
    // method to find minimum pages
    static int books(ArrayList<Integer> A,int B)
    {
        long sum = 0;
         int n=A.size();
        // return -1 if no. of books is less than
        // no. of students
        if (n < B)
            return -1;
      
        // Count total number of pages
        for (int i = 0; i < n; i++)
            sum += A.get(i);
      
        // initialize start as 0 pages and end as
        // total pages
        int start = 0, end = (int) sum;
        int result = Integer.MAX_VALUE;
      
        // traverse until start <= end
        while (start <= end)
        {
            // check if it is possible to distribute
            // books by using mid is current minimum
            int mid = (start + end) / 2;
            if (isPossible(A, n, B, mid))
            {
                // if yes then find the minimum distribution
                result = Math.min(result, mid);
      
                // as we are finding minimum and books
                // are sorted so reduce end = mid -1
                // that means
                end = mid - 1;
            }
      
            else
                // if not possible means pages should be
                // increased so update start = mid + 1
                start = mid + 1;
        }
      
        // at-last return minimum no. of  pages
        return result;
    }
}
