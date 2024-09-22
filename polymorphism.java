class parent {
    public void action() {
        System.out.println("this is the parent class");
    }

    public void display() {
        System.out.println("other method in parent class");
    }
}

class child extends parent {
    public void action() {
        System.out.println("chils class method");
    }
}

class overloading {
    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(float a, float b) {
        System.out.println(a + b);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // ---------------------------Method Overriding---------------------------------

        child cobj = new child();
        cobj.action();
        cobj.display();
        // ---------------------------Method Overloading-------------------------------

        overloading ovobj = new overloading();
        ovobj.add(10, 12);
        ovobj.add(13.55f, 12.45f);
    }

}
