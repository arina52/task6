public class Main {
    public static void main(String[] args) {
        double sum = 0.0;
        int numarator = 1;
        int numitor = 3;

        while (numarator <= 97 && numitor <= 99) {
            sum += (double) numarator / numitor;
            numarator += 2;
            numitor += 2;
        }

        System.out.println("Suma seriei este: " + sum);
    }
}
