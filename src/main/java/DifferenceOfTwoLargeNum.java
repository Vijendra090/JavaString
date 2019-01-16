public class DifferenceOfTwoLargeNum {

    public static String diffOfTwoNumber(String s1, String s2){
        //for reversing both the string need the stringBuffer class
        StringBuffer in1= new StringBuffer(s1);
        StringBuffer in2= new StringBuffer(s2);
        in1.reverse();
        in2.reverse();

        StringBuffer result= new StringBuffer();
        int carry=0, diff, i;

        for(i=0;i<in2.length();i++){
            diff = (in1.charAt(i)-'0') - (in2.charAt(i)-'0') - carry;
            if(diff<0){
                carry=1;
                result.append(diff+10);
            }
            else{
                carry=0;
                result.append(diff);
            }
        }
        String rem= in1.substring(i);  //appending the remaining string from large string
        result.append(rem);
        result.reverse();
        return new String(result);
    }
    public static void main(String [] args){
        //String s1="11443333311111111100";
        //String s2="1144422222221111";

        String s1="122387876566565674";
        String s2="31435454654554";

        String result= diffOfTwoNumber(s1, s2); //s1 must be greater than s2 in length
        System.out.println("Diff: "+result);
    }
}
