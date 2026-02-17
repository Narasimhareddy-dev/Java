public class Count {
    public static void main(String[] args) {

        int num = 123456;   // stored number
        int count = 0;

        while (num != 0) {
            num = num / 10;   // remove last digit
            count++;
        }

        System.out.println("Total digits: " + count);
    }
}
