import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents;
        int counterOfDesks = 0;
        while (scanner.hasNext()) {
            numberOfStudents = scanner.nextInt();
            counterOfDesks += numberOfStudents / 2 + numberOfStudents % 2;
        }
        System.out.println(counterOfDesks);
        scanner.close();
    }
}