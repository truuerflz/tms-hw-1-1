public class Main {
    public static void main(String[] args) {

        int number = 25674;
        int remainder = 0;

        while(number > 0)
        {
            remainder = number % 10;
            System.out.print(remainder);
            number /= 10;
        }

    }
}