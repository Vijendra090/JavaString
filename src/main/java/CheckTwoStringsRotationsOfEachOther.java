public class CheckTwoStringsRotationsOfEachOther {

    public static boolean checkTwoStringRotationsToEach(String s1, String s2){

        return (s1.length()==s2.length()) && ((s1+s2).indexOf(s2)!=-1);
        //indexOf: returns the index within the string of the first occurrence of the specified substring else -1
    }

    public static void main(String[] args){
        String s1= "GEEKS";
        String s2= "EKSGE";

        if(checkTwoStringRotationsToEach(s1,s2)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
