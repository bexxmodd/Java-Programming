
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        int total = 0;
        
        for (int n = 0; n <= last; n++) {
            total += n;
        }
        System.out.println("The sum is " + total);

    }
}
