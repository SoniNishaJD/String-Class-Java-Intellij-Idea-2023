public class StringClass {

    /*
    * String:- It is Sequence of characters
    * There are two ways to create String object:

           1. By string literal
           2. By new keyword
    * String Buffer:-
    * String Builder*/

    String s1="Welcome";
    String s2="Welcome";//It doesn't create a new instance

    ////////////////

    String s=new String("Welcome");//creates two objects and one reference variable
    /////////////////////////////////////////////////


        public static void main(String args[]){
            String s1="java";//creating string by Java string literal
            char ch[]={'N','I','S','H','A'};
            String s2=new String(ch);//converting char array to string
            String s3=new String("Nisha Soni");//creating Java string by new keyword
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
        }

}
