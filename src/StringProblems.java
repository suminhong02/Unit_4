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
            if(s.substring(i, i+1).equals("a") || s.substring(i, i+1).equals("e") || s.substring(i, i+1).equals("i")|| s.substring(i, i+1).equals("o")|| s.substring(i, i+1).equals("u")){
                vowels += 1;
            }

        }
        return vowels;
    }

    public static String differentStrings(String s1, String s2){
        String S = "";
        String t1 = s1;
        String t2 = s2;
        int i = 0;
        if (s1.equals(s2)){
            return s1+" and "+s2+ " are the same";
        }
        if (s1.length()>s2.length()){
            t2+=" ";
        }
        else{
            t1 +=" ";
        }
        while(t1.substring(i, i+1).equals (t2.substring(i, i+1))){
            i++;
        }
        return s1+" and "+s2+" are not the same. They differ at letter number "+(i+1);
    }

    public static boolean isPalindrome(String S){
        String s = "";
        String t = S.toLowerCase();
        for(int i = S.length()-1; i >= 0; i--){
            s += t.substring(i,i+1);
        }
        if(t.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String []args){
        //System.out.println(printTheLetters("Pizza"));
        //System.out.println(everyOtherLetter("Computer Science"));
        //System.out.println(countTheVowels("COMPUTER science"));
        //System.out.println(differentStrings("tiger", "tiger"));
        System.out.println(isPalindrome("rAcECaR"));
    }
}
