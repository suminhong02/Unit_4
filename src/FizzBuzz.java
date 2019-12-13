
public class FizzBuzz {
    public static String fizzBuzz(int num){
        String outcome = "";
        for(int i = 1; i<=num; i++){

            if(i%3 == 0 && i%5 == 0 && i>=15){
                outcome += "FizzBuzz ";
            }
            else if(i>=5 && i%5 == 0){
                outcome += "Buzz ";
            }
            else if(i>=3 && i%3 == 0){
                outcome += "Fizz ";
            }
            else outcome += i+" ";

            if(i%20 == 0){
                outcome += "\n";
            }
        }
        return outcome;
    }
    public static void main(String[]args){
        System.out.println(fizzBuzz(100));
    }
}

