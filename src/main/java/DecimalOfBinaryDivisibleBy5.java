import static java.lang.Math.pow;

public class DecimalOfBinaryDivisibleBy5 {

    public static boolean decimalOfBinaryDivisibleBy5(String str){

        str= new StringBuffer(str).reverse().toString();
        int i=0,decimal=0;

        while(i<str.length()){
            decimal+= ((str.charAt(i)-'0') * (int) pow(2,i));
            i++;
        }
        return (decimal%5==0);
    }

    public static void main(String[] args){
        String str="10000101001";
        if(decimalOfBinaryDivisibleBy5(str)){
            System.out.println("Decimal representation of given binary number is divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }
    }
}
