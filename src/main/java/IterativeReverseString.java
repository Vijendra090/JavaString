import java.util.Stack;

public class IterativeReverseString {
    public static String reverseString1(String str){
        if(str==null)
            return str;
        char[] ch= str.toCharArray();
        int s=0, e=ch.length-1;
        char temp;
        while(s<e){
            temp=ch[s];
            ch[s]=ch[e];
            ch[e]=temp;
            s++;
            e--;
        }
        return new String(ch).toString();
    }
    //using stack: time o(n) space O(n)
    public static String reverseString2(String str){
        char[] ch = str.toCharArray();
        Stack<Character> stack= new Stack<Character>();
        int i;
        for(i=0;i<ch.length;i++){
            stack.push(ch[i]);
        }
        for(i=0;i<ch.length;i++){
            ch[i]=stack.peek();
            stack.pop();
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args){
        String str="vijendra";
        System.out.println("Reverse of string : "+ reverseString1(str));

        //using stack
        System.out.println("Reverse of string using stack : "+ reverseString2(str));
    }
}
