class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        byte a=127;
        System.out.println(a);
        short b=10;
        System.out.println(b);
        int c=5;
        System.out.println(c);
        float d=3.14f;         // 4bytes - 32bits(f is compulsory)
        System.out.println(d);
        char e='n';
        System.out.println(e);
        long f=1234567890;
        System.out.println(f);
        boolean g=true;
        System.out.println(g);

       int h=6;
        if(h%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        int att=75;
        int marks=68;
        if(att>80 && marks>80){
            System.out.println("A");
        }
        else if(att>80 && marks>70 && marks<80){
            System.out.println("B");
        }
        else if(att>50 && att<80 && marks>60 && marks<80){
            System.out.println("B");
        }
        else if(att>30 && att<50 && marks<60&& marks>37){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }

        int n =5;
        int sum=0;
        for(int i=0;i<n;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println(sum);
        for(int j=5;j>=0;j--){
            System.out.println(j);
        }

        int no=123;
        int add=0;
        int last;
        while(no==0){
            last= no/10;
            add=add+last;
            no=no%10;
        }
        System.out.println(add);
    

        //pattern

       int num = 5;
       int p;
       for (p = 0; p <= num; p++){
           for (int q = 1; q <=p; q++) {
               System.out.print(" ");
           }
           for(int k=num;k>=p;k--){

               System.out.print("*");
           }
       System.out.println();
       }
   }

}

