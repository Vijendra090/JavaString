public class ReverseSringWithoutSpecialChar {

    public static boolean isAlphabet(char ch){
        return ((ch>='A' && ch <='Z') || (ch>='a' && ch <='z'));
    }

    public static void main(String[] args){
        String str="a!!!b.c.d,e'f,ghi";
        char[] ch= str.toCharArray();
        int stIndex=0;
        int endIndex= ch.length-1;
        char temp;
        while (stIndex<endIndex){
            while (!isAlphabet(ch[stIndex]))
                stIndex++;
            while (!isAlphabet(ch[endIndex]))
                endIndex--;
            temp= ch[stIndex];
            ch[stIndex]=ch[endIndex];
            ch[endIndex]=temp;
            stIndex++;
            endIndex--;
        }
        System.out.println("Original String: "+ str);
        System.out.println("Reverse String: "+ String.valueOf(ch));
    }
}
