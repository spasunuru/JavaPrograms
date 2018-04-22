package com.pasunuru.thread;

public class MyDeadlockSolution {
 
    String str1 = "Java";
    String str2 = "UNIX";
     
    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };
     
    // solution Lock should be applied on same sequence
    
    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        MyDeadlockSolution mdl = new MyDeadlockSolution();
        mdl.trd1.start();
        mdl.trd2.start();
    }
}
