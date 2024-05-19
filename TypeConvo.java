public class TypeConvo {
    public static void main(String[] args) {
        // implicite conversion
        byte a=5;
        int b = a;
        System.out.println(b);
        //explicite conversion 
        int x =25;
        byte y = (byte)x;
        System.out.println(y);
    }
}
