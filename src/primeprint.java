public class primeprint {
    public static void main(String[] args) {
        int limit = 50; // You can change this limit to any positive integer

        System.out.println("Prime numbers up to " + limit + ":");
        printPrimes(limit);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to print prime numbers up to a specified limit
    public static void printPrimes(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

