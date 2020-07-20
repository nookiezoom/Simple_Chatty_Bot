import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }
        Collections.reverse(numbers);
        numbers.stream().map(number -> String.format("%d ", number)).forEach(System.out::print);
        /* same to:
        for (Integer number : numbers) {
            System.out.print(String.format("%d ", number));
        }
         */
        scanner.close();
    }
}