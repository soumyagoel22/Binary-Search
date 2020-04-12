public class Solution {
    // DO NOT MODIFY THE LIST
    public int search(final List<Integer> a, int b) {
       int mid,i,l,h,n;
       n=a.size();
       l=0;
       h=n-1;
       while(l<=h)
       {
           mid=(l+h)/2;
           if(a.get(mid)==b)
           {
               return mid;
           }
           if(a.get(l)<=a.get(mid))
           {
               if(a.get(l)<=b && b<a.get(mid))
               h=mid-1;
               else 
               l=mid+1;
           }
           else
           {
               if(a.get(mid)<b && b<=a.get(h))
               l=mid+1;
               else
               h=mid-1;
           }
       }
       return -1;
    }
}
