package queue;

public class Queue {

    public int[] numbers;
    public int size;

    public Queue() {
    }

    public Queue(int capacity) {
        numbers = new int[capacity];
    }

    public void add(int newItem){
        numbers[size++]=newItem;
    }


    public int pop(){
        return numbers[--size];
    }
    public int peek(){
        return numbers[size-1];
    }
    public int getSize() {
        return size;
    }
    public boolean empty(){
        return (size==0)?true:false;
    }


}

