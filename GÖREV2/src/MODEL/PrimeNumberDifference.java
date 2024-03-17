package MODEL;

public class PrimeNumberDifference {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int maxSmallPrime = findSmallestPrimeAfter(500000);
        int minLargePrime = findLargestPrimeBefore(500000);

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime) + " ms");

        System.out.println("500,000'den küçük en büyük asal sayı: " + minLargePrime);
        System.out.println("500,000'den büyük en küçük asal sayı: " + maxSmallPrime);
        System.out.println("Fark: " + Math.abs(maxSmallPrime - minLargePrime));
    }

    private static int findSmallestPrimeAfter(int number) {
        int candidate = number + 1;
        while (!isPrime(candidate)) {
            candidate++;
        }
        return candidate;
    }

    private static int findLargestPrimeBefore(int number) {
        int candidate = number - 1;
        while (!isPrime(candidate)) {
            candidate--;
        }
        return candidate;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}