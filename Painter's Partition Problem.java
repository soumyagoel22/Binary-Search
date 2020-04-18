import java.util.*;

public class Solution {
    
    public static long getMax(ArrayList<Integer> C, int n){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(C.get(i) > max)
                max = C.get(i);
        }
        return max;
    }
    
    public static long getSum(ArrayList<Integer> C, int n){
        int total = 0;
        for(int i = 0; i < n; i++){
            total += C.get(i);
        }
        return total;
    }
    
    public static int paint(int A, int B, ArrayList<Integer> C){
        int total = 0;
        int numPainters = 1;
        for(int i =0;i < A; i++){
            total += C.get(i);            
            if(total > B){
                total = C.get(i);
                numPainters++;
            }
            
        }
        return numPainters;
    }
}
