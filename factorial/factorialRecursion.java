import java.util.Scanner;

class Factorial {
    int Fact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * Fact(num - 1);
        }
    }
}

class FactMain {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();
        s.close();
        if (num < 0){
            System.out.print("Error !!! \nFactorial of negative number can't be processed");
        }else{
            System.out.println(num + "! = " + f.Fact(num));
        }
    }
}