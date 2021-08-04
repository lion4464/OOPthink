package Divisible;

public class Two_or_three {
public int[] numbers;
public int size;

    public static void main(String[] args) {
        Two_or_three a=new Two_or_three();
        a.ToFind();
        for (int e:a.numbers) {
            System.out.println("e = " + e);
        }
    }
    public Two_or_three() {
        this.numbers = new int[10];
    }
    public void ToFind(){
        for (int i = 1; i < 50; i++) {
            if (i%2==0||i%3==0) {
                if (size<10)
                    numbers[size++] = i;
            }
        }
    }
}

