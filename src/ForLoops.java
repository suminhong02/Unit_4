public class ForLoops {
    public static String printingHashTags(int num){
        String hashtag = "";
        for(int counter = 0; counter < num; counter++){
            hashtag += "#";
        }
        return hashtag;
    }

    public static String countDown(int a, int b){
        String blank = "";

        if (a>b)
            return blank;

        for(int i = b; i>=a ; i--){
            blank += i + " ";
        }
        return blank;
    }

    public static String countDown2(int a, int b) {
        int startingPoint;
        int endPoint;
        String blank = "";
        if (a > b) {
            startingPoint = a;
            endPoint = b;
        } else {
            startingPoint = b;
            endPoint = a;
        }
        for (int i = startingPoint; i >= endPoint; i--) {
            blank += i + " ";
        }
        return blank;
    }

    public static int sumNumbers(int a, int b){
        int total = 0;
        int larger;
        int smaller;
        if ( a > b) {
            larger = a;
            smaller = b;
        }
        else{
            larger = b;
            smaller = a;
        }
        for (int i = smaller; i <= larger; i++){
            total += i;
        }
        return total;
    }


    public static void main(String[]args){
        //System.out.println(printingHashTags(7));
        //System.out.println(countDown(0,10));
        //System.out.println(countDown2(10,0));
        //System.out.println(sumNumbers(10,5));
    }
}
