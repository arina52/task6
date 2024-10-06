import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, pCount=0, nCount=0, sum=0;
        do {
            System.out.print("Introduceti un numar: ");
            n = sc.nextInt();
            if(n!=0) {
                if (n > 0) pCount += 1;
                else nCount += 1;
                sum += n;
            }
        } while(n!=0);
        System.out.println("Numarul de elemente pozitive = "+pCount);
        System.out.println("Numarul de elemente negative = "+nCount);
        System.out.println("Suma = "+sum);
    }
}