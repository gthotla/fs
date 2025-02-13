import java.util.*;
public class DuplicateWindow{
    public static boolean window(int a[],int n,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
            if(map.get(a[i])>1){
                return true;
            }
        }
        for(int i=k;i<n;i++){
            map.put(a[i-k],map.getOrDefault(a[i-k],0)-1);
            map.put(a[i],map.getOrDefault(a[i],0)+1);
             if(map.get(a[i])>1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt(); 
        System.out.println(window(a,n,k));
        
    }
}
