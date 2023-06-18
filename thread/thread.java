import java.util.Random;
class Even extends Thread{
    int x;
    Even(int i){
        x = i;
    }
    public void run(){
        System.out.println("Square : " + (x*x));
    }
}

class Odd extends Thread{
    int x;
    Odd(int i){
        x = i;
    }
    public void run(){
        System.out.println("Cube : " + (x*x*x));
    }
}

class Generate extends Thread {
    int i,j;
    Random random = new Random();
    public void run(){
        for(i=0;i<10;i++){
            j = random.nextInt(10);
            if(j%2==0){
                Even ev = new Even(j);
                ev.start();
            }
            else{
                Odd od = new Odd(j);
                od.start();
            }
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println("Exception");
            }
        }
    }
}

class Thread_Even_Odd {
    public static void main(String[] args) {
        Generate gen = new Generate();
        gen.start();
    }
}
