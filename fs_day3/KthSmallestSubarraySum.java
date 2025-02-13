import java.util.*;
public class KthSmallestSubarraySum{
    public static int smallestSum(int a[],int n,int k){
        int low=Integer.MAX_VALUE;
        int high=0, mid=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            low=Math.min(low,a[i]);
        }
        high=sum;
        while(low<=high){
            mid=low+(high-low)/2;
            if(calculateSubarrays(a,mid)>=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static int calculateSubarrays(int a[],int maxSum){
        int left=0,count=0,sum=0;
        for(int right=0;right<a.length;right++){
            sum+=a[right];
            while(sum>maxSum){
                sum-=a[left++];
            }
            count+=right-left+1;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(smallestSum(a,n,k));
    }
}