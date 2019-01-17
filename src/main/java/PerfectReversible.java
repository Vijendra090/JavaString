public class PerfectReversible {

    public static boolean checkPerfectReversible(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e))
                return false;
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args){
        String str="aba";
        if(checkPerfectReversible(str)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
