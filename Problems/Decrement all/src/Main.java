import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.print(String.format("%d ", scanner.nextInt() - 1));
        }
        scanner.close();
    }
}