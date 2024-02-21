//Type Conversion and Type Casting

public class Day5 {
    public static void main(String[] args){
        //type Conversion
        byte b = 34;
        int a = 765;
        //b = a; It will be Error because we cannot store bigger value in smaller one by the help of Type Conversion Only we can chage by the help of Casting 
        b = (byte)a; // This will be work Type Casting
        System.out.println(b);

        a = b; //We cann store smaller into bigger one by Type convertion also Type Casting
        a = (int)b; //This is Type Casting
        System.out.println(a); 
    }
}
