public class ImmutableString {
    //in java string objects are immutable means unmodifiable
    public static void main(String [] args){
        String obj = "Vijendra";
        obj.concat("Prasad");   //new object will be created with string VijendraPrasad in String constant pool
        System.out.println(obj);
    }
}
