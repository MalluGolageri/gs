package com.sapient.appnomic;

public class Task implements Runnable {
    private void do_stuff() {
        try {
            Thread.sleep(5000);
        } catch(InterruptedException e) {}
    }
    public void run() {
        do_stuff();
    }

    static public void main(String[] args) {
        Thread[] task_array = {new Thread(new Task()),
                               new Thread(new Task()),
                               new Thread(new Task()),
                               new Thread(new Task())};
        task_array[0].start();
        task_array[1].start();
        task_array[2].start();
        task_array[3].start();
        System.out.println("Done");
    }
}
