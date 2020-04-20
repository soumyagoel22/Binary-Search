public class Solution {

    private int countSmaller(final List<Integer> A, int B) {
        int left = 0, right = A.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (B <= A.get(mid))
                right = mid - 1;
            else 
                left = mid + 1;
        }
        return left;
    }

    private double search(final List<Integer> a, final List<Integer> b, int count) {
        int left = Integer.MIN_VALUE;
        int right = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = (int) (left + ((long) right - left) / 2);
            int smaller = countSmaller(a, mid) + countSmaller(b, mid);
            if (smaller > count)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return right;
    }
    
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {
        int total = a.size() + b.size();
        if (total%2!= 0)
            return search(a, b, total / 2);
        else
            return (search(a, b, total / 2) + search(a, b, total / 2 - 1)) / 2;
    }
}
