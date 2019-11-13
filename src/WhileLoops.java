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

        int posCount = 0;
        int negCount = 0;
        System.out.println("Enter a positive or negative number or 0 to quit:");
        int input = scan.nextInt();

        while(input != 0){

            if(input>0){
                posCount += 1;
            }
            if(input<0){
                negCount += 1;
            }

        input = scan.nextInt();
        }
        return "There were " + posCount + " positive and "+ negCount + " negative numbers.";
    }

    public static String findMinAndMax(){

        int counter = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(counter<5){
            System.out.println("Number: ");
            int num = scan.nextInt();
            counter += 1;
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        return "Max value is: " + max +"\n Min value is: " + min;
    }

    public static void main(String[] args){
        //System.out.println(fromHereToThere(7,10));
        //System.out.println(factors(6));
        //System.out.println(countPosAndNeg());
        System.out.println(findMinAndMax());


    }
}
