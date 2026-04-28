import java.util.Random;
public class UC2 {
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {
        Random rand = new Random();
        if (rand.nextInt(2) == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }
    static void displayTossResult() {
        System.out.println("Human is playing first: " + isHumanTurn);
        System.out.println("Human's symbol: " + humanSymbol);
        System.out.println("Computer's symbol: " + computerSymbol);
    }
}
