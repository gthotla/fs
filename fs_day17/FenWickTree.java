package fs_day17;
import java.util.*;
public class FenWickTree{
    private static int[] BIT;
    private static int n;
    public FenWickTree(int []arr,int n){
        this.n=n;
        this.BIT=new int[n+1];
        for(int i=0;i<n;i++){
            update(i+1,arr[i]);
        }
    }
    public static void update(int i, int value){
        while(i<=n){
            BIT[i]+=value;
            i+=(i&-i);
        }
    }
    public static int  prefixSum(int i){
        int sum=0;
        while(i>0){
            sum+=BIT[i];
            i-=(i&-i);
        }
        return sum;
    }
    public static int sumRange(int L, int R){
        if (L<=1) return prefixSum(R);
        return prefixSum(R)-prefixSum(L-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int arr[]=new int[n];
        int queries[][]=new int[q][3];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<q;i++){
            queries[i][0]=sc.nextInt();
            queries[i][1]=sc.nextInt();
            queries[i][2]=sc.nextInt();
        }
        FenWickTree ft = new FenWickTree(arr,n); 
        for(int i=0;i<q;i++){
            if(queries[i][0]==1){
                System.out.println(FenWickTree.sumRange(queries[i][1]+1,queries[i][2]+1));
            }
            else{
                FenWickTree.update(queries[i][1]+1,queries[i][2]-arr[queries[i][1]]);
            }
        }
        
        
    }
}
