package org.kodluyoruz;

public class QueueProcesses<T> implements Queue<T>{
    private Node<T> ilk;
    private Node<T>son;

    @Override
    public void add(T deger) {
        Node<T> node = new Node<T>(deger);
        if(ilk==null) {
            ilk = node;
            son = node;
        }else{
            son.setNext(node);
            son=node;
        }

    }

    @Override
    public T peek() {
        if(ilk==null) {
            throw new NullPointerException("Queue Bos");
        }
        else
        return ilk.getDeger();

    }

    @Override
    public T poll() {

        if(ilk==null){
            throw new NullPointerException("Queue Bos");
        }
       else {
            T deger= null;
            Node<T> node=ilk;
            ilk= node.getNext();
            deger=node.getDeger();
            return deger;
        }

    }
}
