import java.util.Scanner;

class MethodOverloading {
    void display(int n){
        System.out.println("Integer is : " + n);
    }
    void display(double n){
        System.out.println("Double is : " + n);
    }
    void display(String n){
        System.out.println("String is : " + n);
    }
}

class MethodOverloadingMain {
    public static void main(String[] args) {
        int x;
        double y;
        String z;
        MethodOverloading m = new MethodOverloading();
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter an integer : ");
        x = scanner.nextInt();
        m.display(x);
        System.out.print("Enter a double : ");
        y = scanner.nextDouble();
        m.display(y);
        System.out.print("Enter a string : ");
        z = scanner.next();
        z += scanner.nextLine();
        m.display(z);

        scanner.close();
    }
}