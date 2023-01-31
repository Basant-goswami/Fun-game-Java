import java.util.Scanner;
import java.util.Random;

public class ekKaChar {
    public static void main(String[] args) {
        System.out.println(" *** 1 ka 4 Game ***");
        System.out.println("If you win a game , you got 4 times money of your bid");
        Scanner sc = new Scanner(System.in);
        System.out.println("\nenter a amount that you want to bid in a Game : ");
        int bid = sc.nextInt();

        System.out.println("choose a Number between 1 to 6: ");
        int num = sc.nextInt();
        System.out.println("NOW its time t o roll a dice :");

        Random random = new Random();
        int randomNum = random.nextInt(1,7);
        System.out.println("The computer generated random number between 1 to 6 is :" +randomNum);

        if (num == randomNum){
            System.out.println("CONGRACULATIONS !!  YOU WON THE  GAME");
            System.out.println("you won a Rs. "+ 4*bid);
        }
        else {
            System.out.println("Ooops !! You lost the game \n Better luck next time..");
        }
    }
}
