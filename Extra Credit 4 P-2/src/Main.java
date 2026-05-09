import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String fullName = input.nextLine();

        int space = fullName.indexOf(" ");

        String firstName = fullName.substring(0, space);
        String lastName = fullName.substring(space + 1);
        char firstInitial = firstName.charAt(0);

        System.out.println("Your name is: " + lastName + ", " + firstInitial + ".");

        input.close();
    }
}