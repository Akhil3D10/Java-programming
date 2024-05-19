public class Operators {
    public static void main(String[] args) {
        //unary operator
        int x=5;
        int y= ++x;
        System.out.println("x " +x);
        System.out.println("y " + y);
        y=0;
        y=x++;
        System.out.println("x "+x);
        System.out.println("y "+ y);

        //ternary operators
        int age=24;
        String f;
		f = (age>18)?"allow":"dont allow";
		System.out.println(f);

        //assignment opertor
        int k = 5;
		k += 5;
        System.out.println(x);
		k -= 5;
		System.out.println(x);
        k *= 5;
		System.out.println(x);
        k /= 5;
		System.out.println(x);

        //shift operator
        int d = 155;
        int sd = d>>2;
        System.out.println(sd);
        sd = d<<2;
        System.out.println(sd);

        //logical operator
        System.out.println(8>3&&9>4);

        System.out.println(8>31 || 9>14);





    }
}
