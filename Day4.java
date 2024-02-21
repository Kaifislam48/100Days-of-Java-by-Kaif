//Literals

public class Day4 {
    public static void main(String[] args){
        int num1 = 0b101;
        System.out.println(num1);
        int num2 = 0x7E;
        System.out.println(num2);

        char a = 'a';
        a++;
        char b = a++;
        b++;
        a++;
        b++;
        a = b++;
        System.out.println(a);
    }
}
