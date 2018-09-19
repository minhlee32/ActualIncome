import java.util.Scanner;

public class ActualIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        System.out.println("Please enter your co-efficients salary here");
        a = scanner.nextDouble();

        if ((1 <= a) && (a <= 5)) {
            double b;
            System.out.println("Please enter years at work: ");
            b = scanner.nextDouble();

            double c= a*4000000 + b*500000;
            System.out.println("Your actual income: " + c);

        }
    }
}
