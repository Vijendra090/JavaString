public class IsDivisibleBy4 {

    public static boolean check(String str){
        int len= str.length();
        if(len==0)
            return false;
        if(len==1)
            return ((str.charAt(0)-'0') % 4==0);

        int last= str.charAt(len-1)-'0';
        int sec_last= str.charAt(len-2)-'0';

        return ((sec_last*10 + last)%4==0);
    }
    public static void main(String [] args){
        String str="363588395960667043875487";
        if(check(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
