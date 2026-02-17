public class Prime {
    public static void main(String[] args) {

        int num = 7;   // stored number
        int count = 0;

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime Number");
        } 
        else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0)
                System.out.println(num + " is a Prime Number");
            else
                System.out.println(num + " is NOT a Prime Number");
        }
    }
}
