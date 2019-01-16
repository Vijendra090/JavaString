public class IsDivisibleBy11 {

    public static boolean check(String str){
        int len= str.length();
        int oddPlaceSum=0, evenPlaceSum=0;
        if(len==0)
            return false;
        for(int i=0;i<len;i++){
            if(i%2==0){
                oddPlaceSum+= str.charAt(i)-'0';
            }else{
                evenPlaceSum+= str.charAt(i)-'0';
            }
        }

        return ((oddPlaceSum-evenPlaceSum)%11 == 0);
    }
    public static void main(String[] args){
        String str= "76945"; //String creation by using string literal

        if(check(str)){
            System.out.println("Yes divisible by 11");
        }else
        {
            System.out.println("Not divisible by 11");
        }
    }
}
