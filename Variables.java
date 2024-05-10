class Variables{
    int a=20;               //instance variable
    static int b=30;        //static variable
    public static void main(String[] args) {
        System.out.println(Variables.b);
        Variables v = new Variables();      //instance of Variable class
        System.out.println(v.a);
    }

}