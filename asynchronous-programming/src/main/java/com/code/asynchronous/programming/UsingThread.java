package main.java.com.code.asynchronous.programming;

//first file
public class UsingThread {

    public static void main(String[] args) {

        int number = 20;
        //System.out.println("Outside: Printing a number: " + number);

        Thread newThread = new Thread(() -> {
           System.out.println("Printing a number: " + number);
        });

        newThread.start();

        Thread newThread2 = new Thread(() -> {
            System.out.println("2 Printing a number: " + number);
        });

        newThread2.start();
    }
}
