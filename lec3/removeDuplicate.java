public class removeDuplicate {
    public static void main(String[] args) 
    {
    String str="hello";
    String newStr="";
    for(char ch : str.toCharArray()){
        if(newStr.indexOf(ch)==-1){
            newStr+=ch;
        }
    }
    System.out.println(newStr);
     }
}