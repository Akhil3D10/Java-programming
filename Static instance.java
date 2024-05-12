public class StaticInstance{
    int a=35;
    static int b=55;
    void display(){
    System.out.println("instance method");
    }
    static void display1(){
    System.out.println("static method");
    } 
    public static void main(String[] args) {
        System.out.println(b);
        StaticInstance si = new StaticInstance();
        System.out.println(si.a);
        si.display();
        display1();
    }
    
}
