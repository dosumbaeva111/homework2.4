package com.company;

public class Runner extends Thread {
    public Runner(String s) {
        super(s);
    }

    @Override
    public void run() {
        Runner runner2 = new Runner("Runner 2");
        Runner runner3 = new Runner("Runner 3");
        Runner runner4 = new Runner("Runner 4");
        Runner runner5 = new Runner("Runner 5");
        switch (Thread.currentThread().getName()) {
            case "Runner 1":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + runner2.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                }
                    runner2.start();
                    try {
                        runner2.join();
                        System.out.println(Thread.currentThread().getName() + " берет палочку ");
                    } catch (InterruptedException e1) {
                    }

                break;
            case "Runner 2":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + runner3.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                runner3.start();
                try {
                    runner3.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку");
                    System.out.println(Thread.currentThread().getName() + " бежите к " + new Runner("Runner 1").getName());
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                break;
            case "Runner 3":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + runner4.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                runner4.start();
                try {
                    runner4.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку ");
                    System.out.println(Thread.currentThread().getName() + " бежит к " + runner4.getName());
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                break;
            case "Runner 4":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к " + runner5.getName());
                try {
                    sleep(5000);
                } catch (InterruptedException e) {

                }
                runner5.start();
                try {
                    runner5.join();
                    System.out.println(Thread.currentThread().getName() + " берет палочку ");
                    System.out.println(Thread.currentThread().getName() + " бежит к " + runner3.getName());
                    sleep(5000);

                } catch (InterruptedException e) {

                }
                break;
            case "Runner 5":
                System.out.println(Thread.currentThread().getName() + " берет палочку ");
                System.out.println(Thread.currentThread().getName() + " бежит к финишу ");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    
                }
                    System.out.println(Thread.currentThread().getName() + " бежит к " + runner4.getName());
                    try {
                        sleep(5000);
                    } catch (InterruptedException e1) {

                    }
                    super.run();

                }


        }

    }

