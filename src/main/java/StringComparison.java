public class StringComparison {
    /*In java we can comapare the string on the basis of content and reference
        1:used in authentication(by equals() method)
        2:used for sorting(by compareTo() method)
        3:used for reference matching(by == operator)
    */
    public static void main (String[] args){
        String s1 = "Vijendra";
        String s2 = "Vijendra";
        String s3 = new String("Vijendra");
        String s4 = "Prasad";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        System.out.println(s1==s2); // compare reference not values
        System.out.println(s1==s3);

        System.out.println(s1.compareTo(s2));   //compare string in lexicological order
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
}
