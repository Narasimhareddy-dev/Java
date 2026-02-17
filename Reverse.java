public class Reverse {
    public static void main(String[] args) {

        int num = 1234;   // stored number
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;      // get last digit
            reverse = reverse * 10 + digit;  // build reverse number
            num = num / 10;            // remove last digit
        }

        System.out.println("Reversed number is: " + reverse);
    }
}
