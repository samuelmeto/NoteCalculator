import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your surname");
        String surname = scanner.nextLine();

        System.out.println("Enter your lesson");
        String lesson = scanner.nextLine();

        System.out.println("Enter your midterm1 grade");
        double midterm1 = scanner.nextDouble();

        System.out.println("Enter your midterm2 grade");
        double midterm2 = scanner.nextDouble();

        System.out.println("Enter your final grade");
        double finalnote = scanner.nextDouble();

        double result = (midterm1*0.3) + (midterm2*0.3) +(finalnote*0.4);

        if (result > 60)
            System.out.println("passed");
        else
            System.out.println("failed");
    }
}
