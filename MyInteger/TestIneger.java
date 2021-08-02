package MyInteger;

public class TestIneger {
    public static void main(String[] args) {
        Integers a=new Integers(9);
        System.out.println("a.isEven("+a.getName()+") = " + a.isEven());
        System.out.println("a.isOdd("+a.getName()+") = " + a.isOdd());
        System.out.println("a.isPrime("+a.getName()+") = " + a.isPrime());
        System.out.println("a.parseInt("+a.getName()+") = " + a.parseInt("19"));
        char[] ch={'a', 'b'};
        System.out.println("a.parseInt('a') = " + a.parseInt(ch)[1]);

    }
}
