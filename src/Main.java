import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от одного до трех: ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Число равняется одному.");
                break;
            case 2:
                System.out.println("Число равняется двум.");
                break;
            case 3:
                System.out.println("Число равняется трем.");
                break;
            default:
                System.out.println("Число не известно.");
                break;
        }
    }
}
