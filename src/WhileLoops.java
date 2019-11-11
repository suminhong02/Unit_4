import java.util.Scanner;

public class WhileLoops {

    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int a, int b){
        String va = "";
        while(a <= b){
            if (a>b){
                return "Invalid input";
            }
            va += a+" ";
           a += 1;
        }
        return va;
    }
    public static void main(String[] args){
        System.out.println(fromHereToThere(7,10));


    }
}
