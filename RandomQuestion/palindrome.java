import java.util.Scanner;

class Palindrome{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int temp = x;
        long reverse=0; 

        while (temp != 0){
            reverse = reverse*10 + temp%10;
            temp/=10;
        }
        System.out.println("reverse = " + reverse);

        if (reverse == x) System.out.println("true");
        else System.out.println("false");


    }
}