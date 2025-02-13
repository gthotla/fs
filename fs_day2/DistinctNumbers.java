import java.util.*;
public class DistinctNumbers {
    public static List<Integer> distinctNumber(int a[],int n, int k){
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int d=0;
        for(int i=0;i<k;i++){
             map.put(a[i],map.getOrDefault(a[i],0)+1);
             if(map.get(a[i])==1){
                d++;
             }
        }
        result.add(d);
        for(int i=k;i<n;i++){
          //  d=k;
            map.put(a[i-k],map.getOrDefault(a[i-k],0)-1);
            if(map.get(a[i-k])==0){
                d--;
              }
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(map.get(a[i])<=1){
                d++;
            }
            result.add(d);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(distinctNumber(a, n, k).toString());
        sc.close();
    }
}
