class Circle{
    float radius;
    Circle(float rad){
         radius=rad;
    }

    void setRadius(float radius){
        this.radius=radius;
    }
    float getRadius(){
        return radius;
    }
    public static void main(String[] args) {
        Circle obj=new Circle();
        Circle obj1=new Circle(10);
        System.out.println(obj1.getRadius());
        obj1.setRadius(20);
        System.out.println(obj1.getRadius());
    }
}