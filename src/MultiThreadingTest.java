import java.util.Random;

class RandomNumberThread extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomInteger = random.nextInt(100);
            System.out.println("\nRandom Integer generated : " + randomInteger);
            if ((randomInteger % 2) == 0) {
                SquareThread sThread = new SquareThread(randomInteger);
                sThread.start();
            } else {
                CubeThread cThread = new CubeThread(randomInteger);
                cThread.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}

class SquareThread extends Thread {
    int number;

    SquareThread(int randomNumber) {
        number = randomNumber;
    }

    public void run() {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeThread extends Thread {
    int number;

    CubeThread(int randomNumber) {
        number = randomNumber;
    }

    public void run() {
        System.out.println("Cube of " + number + " = " + number * number * number);
    }
}

public class MultiThreadingTest {
    public static void main(String[] args) {
        RandomNumberThread rnThread = new RandomNumberThread();
        rnThread.start();
    }
}