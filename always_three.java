public class always_three {
    public static void main(String[] args) {
        // These values test positive, negative, and zero int and double values.
        int positiveInt = 8;
        int negativeInt = -8;
        int zeroInt = 0;
        int oneInt = 1;
        double positiveDouble = 8.5;
        double negativeDouble = -8.5;
        System.out.println("Test values: " + positiveInt + ", " + negativeInt
                + ", " + zeroInt + ", " + oneInt + ", " + positiveDouble + ", "
                + negativeDouble);

        // Choose any number to begin the number riddle.
        double startingNumber = positiveDouble;
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
    }
}