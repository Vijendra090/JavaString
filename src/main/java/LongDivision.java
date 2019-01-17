public class LongDivision {
    public static String longDivision(String num, int divisor){
        String res= new String();
        int temp=num.charAt(0)-'0';
        int i=0;
        while(temp<divisor){
            temp= temp*10 + (num.charAt(++i)-'0');
        }
        i++;
        while(num.length()>i) {
            res = res + (temp / divisor);
            temp = (temp % divisor) * 10 + num.charAt(i++) - '0';
        }

        if(res.length()==0)
            return "0";
        return res;
    }

    public static void main(String [] args){
        String dividend="1260257";
        int divisor=37;

        String result = longDivision(dividend,divisor);
        System.out.println("Result: "+result);
    }
}
