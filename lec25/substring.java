package lec25;

public class substring {
    public static void main(String[] args) {
        String str1="hello";
        for(int i=0;i<str1.length()-1;i++){
            String substr="";
            for(int j=i;j<str1.length();j++){
                substr+=str1.charAt(j);
                System.out.println(substr);
            }
        }
}


}
