public class PrintReverseOfString {

    void printReverseString(String str){
        if( str==null || str.length()<1 )
            System.out.println(str);
        else{
            System.out.print(str.charAt(str.length()-1));
            printReverseString(str.substring(0,str.length()-1));
        }
    }
    String reverseString(String str){
        if(str==null || str.length()<1){
            return str;
        }
        //calling function recursively
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args){
        String str= "Vijendra";
        PrintReverseOfString obj = new PrintReverseOfString();
        obj.printReverseString(str);
        System.out.println("Reverse String: "+ obj.reverseString(str));
    }
}
