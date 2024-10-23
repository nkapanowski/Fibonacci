import java.util.Scanner;

public class FibonacciSeq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a non negative number: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("n must be a non-negative integer.");
                scanner.close();
                return;  // Exit the program if invalid input
            }

            int a = 0, b = 1, fib = 0;

            if (n == 0) {
                fib = 0;
            } else if (n == 1) {
                fib = 1;
            } else {
                for (int i = 2; i <= n; i++) {
                    fib = a + b;
                    a = b;
                    b = fib;
                }
            }

            System.out.println(fib);
            //Close
            scanner.close();
        }
    }
