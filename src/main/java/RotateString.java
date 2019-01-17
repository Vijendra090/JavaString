public class RotateString {

    public static String leftRotate(String string, int d){
        char[] ch= string.toCharArray();
        int i;
        while(d-- > 0 ) {
            char temp= ch[0];
            for (i = 1; i < ch.length - 1; i++) {
                ch[i-1]= ch[i];
            }
            ch[i-1]=ch[i];
            ch[i]=temp;
        }
        return new String(ch);
    }

    public static String rightRotate(String string, int d){
        char[] ch= string.toCharArray();
        int i;
        int len= ch.length;
        while(d-- > 0){
            char temp= ch[len-1];
            for(i=len-1;i>0;i--){
                ch[i]=ch[i-1];
            }
            ch[i]=temp;
        }
        return new String(ch);
    }
    public static void main(String [] args){
        String str="GeeksforGeeks";
        int d=2;
        System.out.println("Original String: "+str);
        System.out.println("After Left Rotation: "+ leftRotate(str,d));
        System.out.println("After Right Rotation: "+rightRotate(str,d));
    }
}
