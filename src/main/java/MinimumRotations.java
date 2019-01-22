// Given a string, we need to find the minimum number of rotations required to get the same string.
public class MinimumRotations {

    public static void main(String[] args){
        String str="geeks";
        int len= str.length();
        String temp= str+str;
        int minRotations=1;

        for(int i=1;i<=len;i++){
            if( !(temp.substring(i, len+i).equals(str)) ) {
                minRotations++;
            }
        }

        System.out.println("Minimum Rotations: "+minRotations);
    }
}
