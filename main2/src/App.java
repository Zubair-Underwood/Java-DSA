import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        System.out.println(name);

        System.out.println("Hello " + name);
        System.out.println("You're " + age + " years old");
    }
}
