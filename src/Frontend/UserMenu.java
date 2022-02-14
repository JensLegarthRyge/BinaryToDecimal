package Frontend;

import Functionality.Calculation;
import Functionality.GetInput;

public class UserMenu {
    public static void main(String[] args) {
        displayWelcomeMessage();
        mainMenuNavigation();
    }

    public static void displayWelcomeMessage(){
        System.out.println("####################################");
        System.out.println("### Binary to Decimal Calculator ###");
        System.out.println("####################################");
    }

    public static int getUserChoice(){
        System.out.print("\nCalculate - Press 1\nExit - Press 2\n");
        GetInput getInput = new GetInput();
        return getInput.Int();
    }

    public static void mainMenuNavigation(){
        GetInput getInput = new GetInput();

        int userChoice = getUserChoice();
        while(userChoice==1){
            //Calculator - Asks for input
            System.out.print("\nPlease input your binary number: ");
            Calculation calculator = new Calculation();
            int result = calculator.BinaryToDecimal(getInput.Int());
            System.out.println(result);

            userChoice=getUserChoice();
        }
    }
}
