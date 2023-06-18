import java.util.Scanner;

class Palindrome {
    void Palin(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int d = temp % 10;
            temp = temp / 10;
            rev = (rev * 10) + d;
        }
        if(num == rev){
            System.out.println(rev + " is a Palindrome");
        }else{
            System.out.println(num + " is not a Palindrome");
        }
    }
}

class PalindromeMain{
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        s.close();
        p.Palin(num);
    }
}
