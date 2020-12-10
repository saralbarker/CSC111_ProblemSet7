public class Complex {
    // Attributes ------------------------------------
    private double real;
    private double imaginary;

    // Instance Methods ------------------------------
    // Constructor: initialize the object's attributes
    // with given values a and b
    public Complex(double a, double b) {
        real = a;
        imaginary = b;
    }

    public Complex(Complex z) {
        real = z.real;
        imaginary = z.imaginary;
    }

    // Adds complex number z to complex upon which method
    // add() was called
    public Complex add(Complex z) {
        // Note: "this" is a reference to the object upon
        // which add() was called

        // Form the real and imaginary parts of the sum
        double a = this.real + z.real;
        double b = this.imaginary + z.imaginary;

        // Create a new Complex object for the sum
        Complex result = new Complex(a, b);

        // return the object
        return result;
    }

    // The toString() method is automatically called
    // when an object of type Complex is printed using
    // System.out.println() and related methods.
    // This method itself does NOT print to the screen.
    // Rather it RETURNS a string
    public String toString() {
        // return a string that formats the complex
        // number as "a + b*i"
        return "" + String.format("%.3f", real) + " + " +
                String.format("%3f", imaginary) + "*i";
    }

    //magnitude method
    public double magnitude () {
        double d1;
        d1 = Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
        return d1;
    }

    //time method
    public Complex times (Complex t) {
        Complex z_result;
        double a;
        double b;
        a = (this.real * t.real) - (this.imaginary * t.imaginary);
        b = (t.real * this.imaginary) + (this.real * t.imaginary);
        z_result = new Complex (a, b);
        return z_result;
    }
}
