import java.util.Scanner;

public class WhileLoops {

    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int a, int b){
        String value = "";
        while(a <= b){
            if (a>b){
                return "Invalid input";
            }
            value += a+" ";
           a += 1;
        }
        return value;
    }

    public static String factors(int a){
        int num = 1;
        String value = "";
        while(num<=a){
            if (a%num == 0){
               value += num+" ";
            }
            num += 1;
            }
        return value;
    }

    public static String countPosAndNeg(){
        System.out.println("Enter a positive or negative number or 0 to quit:");
        int positive = 0;
        int negative = 0;
        int input = scan.nextInt();
        while(input != 0){
            if(input>0){
                positive += 1;
            }
            if(input<0){
                negative += 1;
            }
        }
        return "There were " + positive + "positive and "+ negative + "negative numbers.";
    }


    public static void main(String[] args){
        System.out.println(fromHereToThere(7,10));
        System.out.println(factors(6));
        System.out.println(countPosAndNeg());


    }
}
