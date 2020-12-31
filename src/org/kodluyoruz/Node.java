package org.kodluyoruz;

public class Node <T> {
    private T deger;
    private Node<T> next;

    public Node( T deger){

        this.deger=deger;
    }
    public Node(T deger, Node<T> next){
         this.deger= deger;
         this.next= next;
    }

    public T getDeger() {
        return deger;
    }

    public void setDeger(T deger) {
        this.deger = deger;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
