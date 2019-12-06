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




    public static void main(String [] args){
        //System.out.println(xSquare());
        //System.out.println(xSquare2(8));
    }
}
