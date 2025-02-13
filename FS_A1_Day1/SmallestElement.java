// import java.util.*;
// public class SmallestElement{
//     public static List<Integer> smallElement(int a[],int n,int k){
//         List<Integer> result=new ArrayList<>();
//         List<Integer> sub=new ArrayList<>();
//         int minValue=Integer.MAX_VALUE;
//         for(int i=0;i<k;i++){
//             sub.add(a[i]);
//         }
//         result.add(Collections.min(sub));
//         for(int i=k;i<n;i++){
//             sub.remove(0);
//             sub.add(a[i]);
//             result.add(Collections.min(sub));
//         }
//         return result;
        
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         int k=sc.nextInt();
//         System.out.println(smallElement(a,n,k).toString());
//     }
// }
import java.util.*;
public class SmallestElement{
    public static List<Integer> smallElement(int a[],int n,int k){
        List<Integer> result=new ArrayList<>();
        Deque<Integer> deque=new LinkedList<>();
        for(int i=0;i<n;i++){
           if(!deque.isEmpty() && deque.peek()<i-k+1){
               deque.poll();
           }
           while(!deque.isEmpty() && a[deque.peekLast()]>a[i]){
               deque.pollLast();
           }
           deque.addLast(i);
           if(i>=k-1){
               result.add(a[deque.peek()]);
           }
        }
        
        return result;
        
    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(smallElement(a,n,k).toString());
    }
}