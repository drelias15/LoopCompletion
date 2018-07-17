import java.util.Scanner;

public class LoopCompletion {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        for (int i = 1; i <= 10; i++){
            System.out.println("Please enter your number:");
            num = keyboard.nextInt();
            total += num;
        }

        System.out.println("The total of all 10 numbers is " + total);

    }

}