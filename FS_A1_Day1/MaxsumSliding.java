import java.util.*;
public class MaxSumSliding{
    public static int maxSum(int a[],int k,int n) {
        int max_sum=0;
        for(int i=0;i<k;i++){
            max_sum+=a[i];
        }
        int window_sum=max_sum;
        for(int i=k;i<n;i++){
              window_sum+=a[i]-a[i-k];
              max_sum=Math.max(max_sum, window_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int a[]={3,2,4,2,6,1};
        int n=6,k=3;
        System.out.println(maxSum(a, k, n));
    }
}