package ChallengeThread;
//version 1.1
public class MyThread {

    public static void main(String[] args) {
        Work Work = new Work();
        Work.start();
        Runnable main = () ->{
            try {
                int asc = 97;
                while (Work.isAlive()) {
                    System.out.println((char) asc);
                    asc++;
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e){
            }
        };
        new Thread(main).start();
    }
}
class Work extends Thread {
     public void run(){
         try {
             for(int i=0;i<5;i++) {
                 System.out.println("Work Thread : "+i);
                 Thread.sleep(500);
                 }
             }

         catch (InterruptedException e){
         }
    }
}

