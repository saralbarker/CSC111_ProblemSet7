public class DriverComplex {
    public static void main(String[] args) {

        Complex z1;
        Complex z2;
        z1 = new Complex(3, 2);
        z2 = new Complex(1, -3);


        // Add z1 to z2
        Complex z3;
        z3 = z2.add(z1);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("z3 = z1 + z2 = " + z3);

        System.out.println("Magnitude of z1: " + z1.magnitude());
        System.out.println("Magnitude of z2: " + z2.magnitude());
        System.out.println("Magnitude of z3: " + z3.magnitude());

        // Multiply z1 and z2
        Complex z4;
        z4 = z1.times(z2);
        System.out.println();
        System.out.println("z4 = z1 * z2 = " + z4);

    }
}