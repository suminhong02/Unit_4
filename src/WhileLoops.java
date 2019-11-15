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
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(counter<5){
            System.out.print("Number: ");
            int num = scan.nextInt();
            counter += 1;
            if(num<min){
                min=num;
            }
            if(num>max){
                max=num;
            }
        }
        return "Max value is: " + max +"\nMin value is: " + min;
    }

    public static String gradePoint() {

        int counter = 0;
        double total = 0;

        while (counter < 7) {
            System.out.println("Enter seven letter grades (A, B, C, D, or F)");
            String grade = scan.nextLine();
            counter += 1;
            if (grade.equals("A")) {
                total += 4.0;
            } else if (grade.equals("B")) {
                total += 3.0;
            } else if (grade.equals("C")) {
                total += 2.0;
            } else if (grade.equals("D")) {
                total += 1.0;
            } else {
                total += 0.0;
            }

        }
        total /= 7;
        total *=100;
        total = (int)(total+0.5);
        total /= 100;

        return "GPA = " + total;

    }

    public static void main(String[] args){
        //System.out.println(fromHereToThere(7,10));
        //System.out.println(factors(6));
        //System.out.println(countPosAndNeg());
        //System.out.println(findMinAndMax());
        System.out.println(gradePoint());


    }
}
