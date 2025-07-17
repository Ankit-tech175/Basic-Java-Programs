class ch_13_1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 1 is running!!!!    Good morning");
            i++;
        }
    }
}

class ch_13_2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread 2 is running!!!!!!!!    Welcome");
            i++;
        }
    }
}

class ch_13_1_2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread 1 is running!!!!    Good morning");
            i++;
        }
    }
}

class ch_13_2_2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            try {
                Thread.sleep(200); // Sleep for 200 milliseconds (0.2 seconds)
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Thread 2 is running!!!!!!!!    Welcome");
            i++;
        }
    }
}

public class ch_13 {
    public static void main(String[] args) {
        // Q-1

        // ch_13_1 t1 = new ch_13_1();
        // ch_13_2 t2 = new ch_13_2();
        // t1.start();
        // t2.start();
        // System.out.println("I am main method of ch_13 class");

        // Q-2 we add sleep method in ch_12_2 class to make it sleep for 200
        // milliseconds (1 second) after printing the message.

        // ch_13_1_2 t1 = new ch_13_1_2();
        // ch_13_2_2 t2 = new ch_13_2_2();
        // t1.start();
        // t2.start();
        // System.out.println("I am main method of ch_13 class");

        // Q-3

        // ch_13_1_2 t1 = new ch_13_1_2();
        // ch_13_2_2 t2 = new ch_13_2_2();
        // t1.setPriority(Thread.MIN_PRIORITY); // Set Thread 1 to minimum priority
        // t2.setPriority(Thread.MAX_PRIORITY); // Set Thread 2 to maximum priority
        // System.out.println("Thread 1 Priority: " + t1.getPriority()); // Print Thread
        // 1 priority
        // System.out.println("Thread 2 Priority: " + t2.getPriority()); // Print Thread
        // 2 priority
        // t1.start();
        // t2.start();
        // System.out.println("I am main method of ch_13 class");

        // Q-4 and 5

        ch_13_1_2 t1 = new ch_13_1_2();
        ch_13_2_2 t2 = new ch_13_2_2();
        System.out.println("Thread 1 State: " + t1.getState()); // Print Thread 1 state
        t1.start();
        System.out.println("Thread 2 State: " + t2.getState()); // Print Thread 2 state
        t2.start();
        System.out.println("Thread 1 State: " + t1.getState()); // Print Thread 1 state
        System.out.println("Thread 2 State: " + t2.getState()); // Print Thread 2 state
        System.out.println(Thread.currentThread().getPriority()); 
        System.out.println("I am main method of ch_13 class");

    }

}