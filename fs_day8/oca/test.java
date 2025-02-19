
class test {
    /*
     * THis code explian the working of for each method and do while loops 
     * here the for each creates another object for each itteration and 
     * for each is not implmented by the objects which does not have itterable class
     */

    public static void main(String[] args) {
        // int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // for (int[] one : a) {
        //     {
        //         for (int i = 0; i < one.length; i++) {
        //             System.out.print(one[i] + "\t");
        //         }
        //         System.out.println();
        //     }
        // }
        int x=10;
        while(x>0){
            do { 
               x-=3; 
            //   break;
            } while (x>5);
            x--;
         //   break;
            System.out.print(x+"\t");
        }
    }
}
