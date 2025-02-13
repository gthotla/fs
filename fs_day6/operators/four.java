public class four {
    public static void main(String[] args) {
        int x=10;
        boolean y=true||(x<5);
        System.out.println(y);
        y=true||(x<20);
        System.out.println(y);
        Integer z=20;
        if(z!=null && z.intValue()<25){
            System.out.println(z);
        }
        x=6;
        y=(x>=6)||(++x<=7);
        //y=(x>=6)|(++x<=7)
        System.out.println(x);
        z=null;
        if(z!=null & z.intValue()<25){
            System.out.println(z);
        }
    }
}
