public class baitap2 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while(count < 20) {
            if (checkPrime(count)) {
                System.out.println("Lan lap thu "  + ": " + count);
            }
            count++;
            num++;
        }
    }
    private static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
