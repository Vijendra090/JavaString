public class StringDemo {
    public static void main(String[] args){
        System.out.println("first Maven project ");

        //ways to create Java String Object
        //1: by String literals
        String s1 = "Vijendra";
        System.out.println(s1);
        //2: by new Keyword
        String s2 = new String("ranita");
        System.out.println(s2);

        //you can create String object like this alsobut it is same as 1
        char ch[] = {'j','a','v','a'};
        String s3 = new String(ch);
        System.out.println(s3);
    }
}
