import java.util.Scanner;

public class user_input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your text: ");
        double inp = input.nextDouble();
        System.out.println("You entered- " + inp);
    }
}
