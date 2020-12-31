package org.kodluyoruz;

public class Main {


    public static void main(String[] args) {
       QueueProcesses<String> eleman= new QueueProcesses<>();
        eleman.add(new String("Merhaba"));
        eleman.add(new String("busra"));
        eleman.add(new String("java"));
       try{
           System.out.println(eleman.peek());
           System.out.println(eleman.poll());
           System.out.println(eleman.poll());
           System.out.println(eleman.poll());
           System.out.println(eleman.peek());
       }
       catch (NullPointerException e){
           System.out.println(e);
       }



    }
}
