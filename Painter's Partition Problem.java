public class Solution {
    // public int paint(int A, int B, ArrayList<Integer> C) {
    //     int i,j,n,max,n1,n2;
    //     n=C.size();
    //     // max=Integer.MIN_VALUE;
    //     Collections.sort(C);
    //     n1=C.get(n-1);
    //     // for(i=0;i<n;i++)
    //     // {
    //     //     if(C.get(i)>max)
    //     //     max=C.get(i);
    //     // }
    //     n2=B*n1;
    //     return n2;
    // }
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
