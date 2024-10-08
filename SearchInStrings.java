package search;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="mounika";
        char ch='y';
        boolean res=search(name, ch);
        System.out.println(res);
    }
    public static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;

            }
        }
        return false;
    }
}
