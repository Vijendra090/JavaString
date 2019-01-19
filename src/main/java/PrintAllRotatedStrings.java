public class PrintAllRotatedStrings {

    public static void printAllRotationString(String str){
        String temp= str+str;   //+ act as concatenate
        int len= str.length();

        for(int i=0; i<len; i++){
            System.out.println(temp.substring(i, len+i));
        }

    }

    public static void main(String[] args){
        String str="geeks";

        printAllRotationString(str);
    }
}
