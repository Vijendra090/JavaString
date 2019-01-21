public class WordReverse {

    public static String wordReverseString1( String str){
        String wordRevString= new String();
        int i,stIndex=0;
        for(i=0;i<str.length();i++){
            stIndex=i;
            while (i<(str.length()-1) && str.charAt(i)!=' ')
                i++;
            if(i==(str.length()-1))
                wordRevString=" "+ wordRevString;
            wordRevString= str.substring(stIndex,i+1) + wordRevString;
        }
        wordRevString=wordRevString.trim();
        return wordRevString;
    }
    public static String wordReverseString2(String str){
        String s[] = str.split(" ");
        String wordRevString= new String();
        for(int i= s.length-1; i>=0;i--){
            wordRevString += s[i]+" ";
        }
        return wordRevString;
    }
    public static void main(String[] args){
        String str="geeks quiz practice code";
        System.out.println("Original String: "+ str);
        System.out.println("Reverse word String: "+ wordReverseString1(str));
        System.out.println("Reverse String words: "+wordReverseString2(str));
    }
}
