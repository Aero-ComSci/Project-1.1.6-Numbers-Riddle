class always_three {
    public static void main(String[] args) {
        int x = 1290819;
        int temp = x;
        
        x *= 2;
        x += 6;
        x /= 2;
        x -= temp;
        System.out.println(x);
    }
}