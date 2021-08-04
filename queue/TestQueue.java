package queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue stack=new Queue(8);
        for (int i = 0; i <7; i++)
            stack.add(i);

        for(int k=0;k<7;k++){

            System.out.print(stack.pop() + " ");
          }
    }
}
