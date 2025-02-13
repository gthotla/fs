// Mr.Ram is a sales manager of Dmart, for his analysis he has to monitor 
// sales of Dmart every day. He need to send report of maximum sales 
// of every K consecutive days from given N number of days sales.
// Write a java program to do his task easy.

// Input Format:
// -------------
// Line-1: Two space separated integers, N and K
// Line-2: N space separated integers, sales[].

// Output Format:
// --------------
// Print maximum sales of every K consecutive days


// Sample Input 1:
// ---------------
// 9 3
// 1 2 3 1 4 5 2 3 6

// Sample output 1:
// ----------------
// 3 3 4 5 5 5 6

// Explanation: 
// ------------
// Maximum of subarray {1, 2, 3} is 3
// Maximum of subarray {2, 3, 1} is 3
// Maximum of subarray {3, 1, 4} is 4
// Maximum of subarray {1, 4, 5} is 5
// Maximum of subarray {4, 5, 2} is 5
// Maximum of subarray {5, 2, 3} is 5
// Maximum of subarray {2, 3, 6} is 6
// */
import java.util.*;
class MaxOfAllSubarraysOfSizeK{
       public static List<Integer> maxElement(int a[],int n,int k){
           List<Integer> res=new ArrayList<>();
           Deque<Integer> deque=new LinkedList<>();
           for(int i=0;i<n;i++){
               if(!deque.isEmpty() && deque.peekFirst()<i-k+1){
                   deque.poll();
               }
               while(!deque.isEmpty() && a[deque.peekLast()]<a[i]){
                   deque.pollLast();
               }
               deque.addLast(i);
               if(i>=k-1){
                   res.add(a[deque.peekFirst()]);
               }
           }
           return res;
       }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println(maxElement(a,n,k).toString());
    } 
    
}