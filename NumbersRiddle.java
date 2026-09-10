public class NumbersRiddle {

    public static void main(String[] args) {
        
        // 6 variables
        int positiveInt = 5;
        int negativeInt = -5;
        int zero = 0;
        int one = 1;
        double positiveDouble = 8.5;
        double negativeDouble = -8.5;

        // Holds current calculation
        double currentResult;

        // Test 1: Positive Integer
        System.out.println("Test 1: Positive Integer");
        System.out.println("Original Number: " + positiveInt);
        currentResult = positiveInt; // Start with the integer
        currentResult *= 2;          // Double it
        System.out.println("Step 1 (Double): " + currentResult);
        currentResult += 6;          // Add 6
        System.out.println("Step 2 (Add 6): " + currentResult);
        currentResult /= 2;          // Divide by 2
        System.out.println("Step 3 (Divide by 2): " + currentResult);
        currentResult -= positiveInt; // Subtract original
        System.out.println("Step 4 (Subtract original): " + currentResult);
        System.out.println("Final Result: " + currentResult + "\n");

        // Test 2: Negative Integer
        System.out.println("Test 2: Negative Integer");
        System.out.println("Original Number: " + negativeInt);
        currentResult = negativeInt;
        currentResult *= 2;
        System.out.println("Step 1 (Double): " + currentResult);
        currentResult += 6;
        System.out.println("Step 2 (Add 6): " + currentResult);
        currentResult /= 2;
        System.out.println("Step 3 (Divide by 2): " + currentResult);
        currentResult -= negativeInt;
        System.out.println("Step 4 (Subtract original): " + currentResult);
        System.out.println("Final Result: " + currentResult + "\n");

        // Test 3: Zero
        System.out.println("Test 3: Zero");
        System.out.println("Original Number: " + zero);
        currentResult = zero;
        currentResult *= 2;
        System.out.println("Step 1 (Double): " + currentResult);
        currentResult += 6;
        System.out.println("Step 2 (Add 6): " + currentResult);
        currentResult /= 2;
        System.out.println("Step 3 (Divide by 2): " + currentResult);
        currentResult -= zero;
        System.out.println("Step 4 (Subtract original): " + currentResult);
        System.out.println("Final Result: " + currentResult + "\n");

        // Test 4: One
        System.out.println("Test 4: One");
        System.out.println("Original Number: " + one);
        currentResult = one;
        currentResult *= 2;
        System.out.println("Step 1 (Double): " + currentResult);
        currentResult += 6;
        System.out.println("Step 2 (Add 6): " + currentResult);
        currentResult /= 2;
        System.out.println("Step 3 (Divide by 2): " + currentResult);
        currentResult -= one;
        System.out.println("Step 4 (Subtract original): " + currentResult);
        System.out.println("Final Result: " + currentResult + "\n");

        // Test 5: Positive Double
        System.out.println("Test 5: Positive Double");
        System.out.println("Original Number: " + positiveDouble);
        currentResult = positiveDouble;
        currentResult *= 2;
        System.out.println("Step 1 (Double): " + currentResult);
        currentResult += 6;
        System.out.println("Step 2 (Add 6): " + currentResult);
        currentResult /= 2;
        System.out.println("Step 3 (Divide by 2): " + currentResult);
        System.out.println("Final Result: " + currentResult); // This line is part of the print logic
        currentResult -= positiveDouble;
        System.out.println("Step 4 (Subtract original): " + currentResult);
        System.out.println("Final Result: " + currentResult + "\n");

        // Test 6: Negative Double
        System.out.println("Test 6: Negative Double");
        System.out.println("Original Number: " + negativeDouble);
        currentResult = negativeDouble;
        currentResult *= 2;
        System.out.println("Step 1 (Double): " + currentResult);
        currentResult += 6;
        System.out.println("Step 2 (Add 6): " + currentResult);
        currentResult /= 2;
        System.out.println("Step 3 (Divide by 2): " + currentResult);
        currentResult -= negativeDouble;
        System.out.println("Step 4 (Subtract original): " + currentResult);
        System.out.println("Final Result: " + currentResult + "\n");
    }
}
