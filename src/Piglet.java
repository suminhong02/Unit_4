//Sumin Hong
//11/19/2019
//play Piglet and get points. You gain points util you get 1 from the dice. If you get 1, you lose all points.
import java.util.Scanner;

public class Piglet {

    public static String rollDice(){
        Scanner scan = new Scanner(System.in);
        int dice = 0;
        int score = 0;
        while (true){
            dice = (int)(Math.random() * 6 + 1);
            if(dice == 1){
                score += 0;
                return "You rolled a 1!\nYou got 0 points.";
            }
            else{
                score += dice;
                System.out.println("You rolled a " +  dice + "!");
                System.out.print("Roll again? ");
                String ans = scan.next();
                if (ans.equals("no") || ans.equals("No") || ans.equals("n")){
                    return "You got " + score + " points.";
                }
            }
        }
    }
    public static void main(String []args){
        System.out.println("Welcome to Piglet!");
        System.out.println(rollDice());
    }
}
