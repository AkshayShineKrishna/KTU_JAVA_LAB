class Fibonacci {
    int num;

    // Method to generate Fibonacci series without recursion
    void fib() {
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci series without recursion: " + first + " " + second);

        for (int i = 2; i < num; i++) {
            int third = first + second;
            first = second;
            second = third;
            System.out.print(" " + third);
        }
    }

    // Method to generate Fibonacci series with recursion
    int fib(int num) {
        if (num <= 2) {
            return num - 1;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }
}

class FibonacciMain {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.num = 5;

        f.fib(); // Generate Fibonacci series without recursion

        System.out.print("\nFibonacci series with recursion: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print(" " + f.fib(i));
        }
    }
}
