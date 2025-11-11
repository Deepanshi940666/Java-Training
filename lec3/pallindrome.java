 class pallindrome {
    public static void main(String[] args) {
        String a="aba";
        String b="";
        for(int i=a.length()-1;i>=0;i--){
            b+=a.charAt(i);

        }
        if(a.equals(b)){
            System.out.println("yesss it is pallindrome");
        }
        else{
            System.out.println("nope it is not pallindrome");

        }
    }
}
