public class always_three {
    public static void main(String[] args) {
        // These values test positive, negative, and zero int and double values.
        double[] testValues = {8, -8, 0, 8.5, -8.5, 0.0};

        for (double value : testValues) {
            double startingNumber = value;
            double originalNumber = startingNumber;

            System.out.println("Starting number: " + startingNumber);

            startingNumber *= 2;
            System.out.println("Double the number: " + startingNumber);

            startingNumber += 6;
            System.out.println("Add six: " + startingNumber);

            startingNumber /= 2;
            System.out.println("Divide by two: " + startingNumber);

            startingNumber -= originalNumber;
            System.out.println("Subtract the original number: " + startingNumber);
            System.out.println("----------------------------------------");
        }
    }
}
