public class oddNeven2 {

    public static void main(String[] args) {

        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                System.out.println("The number " + x + " is Even");
            }
            else {
                System.out.println("The number " + x + " is Odd");
            }
        }
    }
}
