public class three {
    public static void main(String[] args) {
        short x = 10;
        short y = 3;
        int z = (x * y);
        System.out.println(z);
       // System.out.println(!y); // Compilation Error: Cannot apply '!' operator to 'short'

        long a = 10;
        int b = 5;
      //  b = a * b; // Compilation Error: Possible lossy conversion from 'long' to 'int'
        System.out.println(b);
    }
}
class test{
    public static void main(String[] args) {
        int x=100;
        if(100=x){
            System.out.println(true);
        }
    }
}
