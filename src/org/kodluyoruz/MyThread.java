package org.kodluyoruz;

public class MyThread<T> extends Thread{
    T deger;
    static QueueProcesses op = new QueueProcesses();

    public MyThread(T deger) {
        super();
        this.deger = deger;
    }

    public void run() {
        System.out.println(this.getName() + " is starting");
        op.add(this.deger);
       op.peek();
       op.poll();
        System.out.println(this.getName() + " is finishing");
    }
}
