import java.util.Objects;
import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                if (c > b) {
                    return c;
                }
            }
            return a;
        }
        if (b > c) {
            if (a > c) {
                return a;
            }
            return c;

        }
        return b;

    }
    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.max(Math.abs(a), Math.abs(b)) == a){
            return a;
        }
        return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(((a * a) + (b * b))); // REPLACE WITH YOUR CODE
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        // YOUR CODE HERE
        System.out.println("median, magnitude, or pythagoras");
        String choice = scan.next();
        if (Objects.equals(choice, "median")){
            System.out.println("Select a: ");
            int a = Integer.parseInt(scan.next());
            System.out.println("Select b: ");
            int b = Integer.parseInt(scan.next());
            System.out.println("Select c: ");
            int c = Integer.parseInt(scan.next());
            System.out.println(median(a, b, c));
        }
        else if (Objects.equals(choice, "magnitude")){
            int a = Integer.parseInt(scan.next());
            System.out.println("Select b: ");
            int b = Integer.parseInt(scan.next());
            System.out.println(magnitude(a, b));
        }
        else if (Objects.equals(choice, "pythagoras")){
            System.out.println("Select a: ");
            int a = Integer.parseInt(scan.next());
            System.out.println("Select b: ");
            int b = Integer.parseInt(scan.next());
            System.out.println(pythagoras(a, b));
        }
    }
}
