import java.util.Scanner;

class MyException1 extends Exception {
    int details;
    MyException1(int a){
        details = a;
    }
    public String toString() {
        return ("MyException1 [" + "Stack full : " + details + " ]");
    }
}

class MyException2 extends Exception {
    int details;
    MyException2(int a){
        details = a;
    }
    public String toString() {
        return ("MyException1 [" + "Stack empty : " + details + " ]");
    }
}

class Push extends Exception_Stack{
    void pushVal (int top) throws MyException1{
        Scanner scanner = new Scanner(System.in);
        if(top > 4){
            throw new MyException1(top);
        }
        else{
            System.out.print("Enter item to be pushed : ");
            int a1 = scanner.nextInt();
            arr[top] = a1;
            System.out.println("Pushed item : " + arr[top]);
        }
        scanner.close();
    }
}

class Pop extends Exception_Stack{
    void popVal (int top) throws MyException2{
        if(top < 0){
            throw new MyException2(top);
        }
        else{
            System.out.println("Popped item : " + arr[top]);
        }
    }
}

class Exception_Stack {
    static int[] arr = new int[5];
    public static void main(String[] args) {
        int top;
        Push pu = new Push();
        Pop po = new Pop();
        for(top = 0 ; top <6 ;top++){
            try {
                pu.pushVal(top);
            } catch (MyException1 e) {
                System.out.println("Catch : " + e);
            }
        }
        System.out.println(" ");
        for(top = 4 ; top >=-1 ;top--){
            try {
                po.popVal(top);
            } catch (MyException2 e) {
                System.out.println("Catch : " + e);
            }
        }
    }
}