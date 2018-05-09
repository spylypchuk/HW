public class MainClass {
    public static void main (String[] args)
    {
        Methods methods = new Methods();
        int a = 324;
        int b = 4756;
        int Summ = methods.sumTwoNumbers(a,b);
        System.out.println(Summ);

        int minNumbers = methods.minNumbers(a,b);
        System.out.println(minNumbers);

        boolean SameNumbers = methods.isSameNumbers(768);
        System.out.println(SameNumbers);

        int factorial = methods.factorial(10);
        System.out.println(factorial);

        double distance = methods.distance(3.0, 4.0, 5.0, 6.0);
        System.out.println(distance);

        System.out.println("Makes a triangle: " + methods.isTriangle(7,10,5));
        System.out.println("");

        System.out.println("The area of triangle is " + methods.triangle(4,5,6));
        System.out.println("");

        System.out.println("The area of hexagon is " + methods.hexagon(5));
        System.out.println("");

        double mass = methods.mass(83,1.87);
        System.out.println(mass);

        String printS;
        printS = methods.printS();


        methods.printString(3, "I want on vacation");
        System.out.println("");

        methods.printTriangle(9);
        System.out.println();

        int factOddNumber = methods.factOddNumber(4);
        System.out.println(factOddNumber);

        int poolVolume = methods.poolVolume(10,5,2);
        System.out.println(poolVolume);



        }
}