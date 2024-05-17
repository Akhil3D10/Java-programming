class A{
public void action(){
System.out.println("this is parent");
}
}
class B extends A{
public void action(){
System.out.println("this is child and method is overridden");
}
public static void main(String args[]){
B bObj = new B();
b.action();
}