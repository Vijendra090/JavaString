public class NumberOfSubStringDivisibleBy6 {

    public static boolean checkDivisibleBy6(String str){
        if(str.length()==0)
            return false;
        if((str.charAt(str.length()-1)-'0')%2 != 0)
            return false;
        int sum=0;
        for(int i=0;i<str.length();i++){
            sum+=str.charAt(i)-'0';
        }

        return (sum%3==0);
    }

    public static void main(String [] args){
        String str="4806";
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length()+1;j++){
                if(checkDivisibleBy6(str.substring(i,j))){
                    System.out.print(str.substring(i,j)+",");
                    count++;
                }
            }
        }
        System.out.println("No of substring divisible by 6 is:"+ count);
    }
}
