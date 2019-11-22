public class StringProblems {

    public static String printTheLetters(String s){
        String letters = "";
        for(int i = 0; i < s.length(); i++){
            letters += s.substring(i, i+1) + "\n";
        }
        return letters;
    }

    public static String everyOtherLetter(String s){
        String letters = "";
        for(int i = 0; i < s.length(); i+=2 ){
            letters += s.substring(i, i+1);
        }
        return letters;
    }

    public static int countTheVowels(String s){
        int vowels = 0;
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(s.substring(i, i+1) == "a" || s.substring(i, i+1) == "e" || s.substring(i, i+1) == "i"|| s.substring(i, i+1) == "o"|| s.substring(i, i+1) == "u"){
                vowels += 1;
            }
        }
        return vowels;
    }

    public static void main(String []args){
        //System.out.println(printTheLetters("Pizza"));
        //System.out.println(everyOtherLetter("Computer Science"));
        System.out.println(countTheVowels("COMPUTER science"));
    }
}
