import java.util.Scanner;
import java.util.Random;

public class ekKaChar {
    public static void main(String[] args) {
        System.out.println(" *** WELCOME 1 KA 4 Game ***");
        System.out.println("If you win a game , you got 4 times money of your bid.");
        Scanner sc = new Scanner(System.in);
        System.out.println("You can buy 3 chance in 50\u20B9");
        System.out.println("enter a amount that you want to bid in a Game : ");
        int bid = sc.nextInt();
        int chance = (bid/50)*3 ;
        if (chance == 0){
            System.out.print("please bid more than 50\u20B9");
        }else {
            System.out.println("You have a " + chance + " chance to win a game.");
        }
        while (chance !=0) {
            System.out.println("choose a Number between 1 to 6: ");
            int num = sc.nextInt();
            Random random = new Random();
            int randomNum = random.nextInt(1, 7);
            System.out.println("The computer's dice number is : " + randomNum);

            if (num == randomNum) {
                System.out.println("CONGRACULATIONS !!  YOU WON THE  GAME");
                System.out.println("you won a Rs. " + 4 * bid +"\u20B9");
                System.exit(0);
            } else {
                System.out.println("Ooops !! You lost the game \n Try again..");
            }
            chance --;
        }
    }
}
