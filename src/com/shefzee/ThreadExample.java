package com.shefzee;

public class ThreadExample  {



    public static void main(String[] args) {

        Runnable runnable = () -> {
            System.out.println("Inside : " );
        };

        Thread thread = new Thread(runnable);
        thread.start();


    }
}
