package prime_fac;

import Stack.StackOfIntegers;

public class Prime_factors {
    public static void main(String[] args) {
        Prime_factors a=new Prime_factors(150);
        int[] arr=a.getFactors();
        for (int e:arr) {
              if(e!=0)
                System.out.println("e = " + e);
        }
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i]!=0)
                System.out.println("reverse (e) = " + arr[i]);
        }
    }
    int number;

    public Prime_factors(int number) {
        this.number = number;
    }
    public int[] getFactors() {
        StackOfIntegers stac = new StackOfIntegers();
            int p=1;int i=2;
            while (true){
                if (number<0)
                    number=number*(-1);
                if (number==1)
                        break;
                if (number % i == 0) {
                      if (isPrime(i)){
                            stac.add(i);
                            number/=i;
                        }
                    }else{i++;}
             }
        return stac.numbers;
    }
    public boolean isPrime(int n){
        boolean result=true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            result=(n%i==0)?result&false:result&true;
        }
        return result;
    }
}

