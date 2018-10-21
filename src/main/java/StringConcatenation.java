public class StringConcatenation {
    /*in java string concatenation create a new string, there are 2 ways to concatenate the string in java
    * 1: by +(string concatenation) operator
    * 2: by concat() method
    * */
    public static void main(String [] args){
        String s1 = "vijen"+" prasad";   //internally (new StringBuilder()).append("vijen").append(" prasad").toString();
        System.out.println(s1);

        String s2 = 50+30+"vijen"+40+40;//After the string literal all the + will be treated as string concatenation operator
        System.out.println(s2);

        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
