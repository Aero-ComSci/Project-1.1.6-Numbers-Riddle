class always_three {
    public static void main(String[] args) {
        // assign the variable x to the number
        int x = 1290819;
        int temp = x;
        System.out.println(x);
        // double x
        x *= 2;
        System.out.println(x);
        // add 6 to x
        x += 6;
        System.out.println(x);
        // divide x by 2
        x /= 2;
        System.out.println(x);
        // subtract the original value of x from itself
        x -= temp;
        System.out.println(x);
    }
}