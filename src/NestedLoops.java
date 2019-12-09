public class NestedLoops {

    public static String xSquare(){
        String output = "";
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 5; k++){
                output += "X";

            }
            output += "\n";
        }
        return output;
    }

    public static String xSquare2(int n){
        String output = "";
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                output += "X";
            }
            output += "\n";
        }
        return output;
    }

    public static String flippedTriangle(int n){
        String output = "";
        for(int i = n; i > 0; i--) {
            for (int k = i; k > 0; k--) {
                output += "*";
            }
            output += "\n";
        }
        return output;
    }

    public static String multiplicationTable(){
        String output = "";
        for(int i = 1; i <= 9; i++){
            for (int k = 1; k <= 9; k++){
                output += ""+ i*k;
                if((i*k)>= 10){
                    output += " ";}
                else{
                    output += "  ";}
            }
            output += "\n";
        }
        return output;
    }




    public static void main(String [] args){
        //System.out.println(xSquare());
        //System.out.println(xSquare2(8));
        //System.out.println(flippedTriangle(6));
        //System.out.println(multiplicationTable());
    }
}
