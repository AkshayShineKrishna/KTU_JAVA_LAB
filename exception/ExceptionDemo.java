import java.util.Scanner;

class DivideByZeroException extends Exception {
    String message;

    DivideByZeroException(String message) {
        this.message = message;
    }

    public String toString() {
        return ("DivideByZeroException " + message);
    }
}

class ExceptionExample {

    void divide(Double num1, Double num2) throws DivideByZeroException, NullPointerException{
        if (num1 == 0 && num2 == 0) {
            throw new NullPointerException("Both values are zero");
        } else if (num2 == 0) {
            throw new DivideByZeroException("Denominator can't be 0");
        }else {
            System.out.println("Quotient : " + (num1 / num2));
        }
    }
    void divide(String num1,String num2) throws ArithmeticException{
        throw new ArithmeticException("Division Operation possible only for numbers");
    }
}

class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionExample x = new ExceptionExample();
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Enter a double value : ");
            double a = s.nextDouble();
            System.out.print("Enter a double value: ");
            double b = s.nextInt();
            x.divide(a, b);
            System.out.print("Enter a string : ");
            String c = s.next();
            System.out.print("Enter a string : ");
            String d = s.next();
            x.divide(c, d);
        } catch (NullPointerException e) {
            System.out.println("Caught : " + e);
        } catch (DivideByZeroException e) {
            System.out.println("Caught : " + e);
        } catch (ArithmeticException e) {
            System.out.println("Caught : " + e);
        } catch(Exception e){
            System.out.println("Generic exception caught : " + e);
        }finally {
            s.close();
        }
    }
}

