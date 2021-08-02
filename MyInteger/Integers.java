package MyInteger;

public class Integers {

    public int name;

    public int getName() {
        return name;
    }

    public boolean isEven(){
        boolean result=((this.name)%2==0)?true:false;
        return result;
    }
    public boolean isOdd(){
        boolean result=((this.name)%2!=0)?true:false;
        return result;
    }
    public boolean isPrime(){
        boolean result=true;
        for (int i = 2; i <= Math.sqrt(this.name); i++) {
           if(name%i==0){
               result&=false;
           }else {result&=true;}
        }
        return result;
    }
    public static boolean isEven(int name){
        boolean result=(name%2==0)?true:false;
        return result;
    }
    public static boolean isOdd(int name){
        boolean result=((name)%2!=0)?true:false;
        return result;
    }
    public static boolean isPrime(int name){
        boolean result=false;
        for (int i = 2; i <=Math.sqrt(name); i++) {
           result=(name%i!=0)?true:false;
        }
        return result;
    }
    public static boolean isEven(Integers a){
        boolean result=(a.name%2==0)?true:false;
        return result;
    }
    public static boolean isOdd(Integers a){
        boolean result=((a.name)%2!=0)?true:false;
        return result;
    }
    public static boolean isPrime(Integers a){
        boolean result=false;
        for (int i = 2; i <=Math.sqrt(a.name); i++) {
            result=(a.name%i!=0)?true:false;
        }
        return result;
    }
    public boolean equal(int a){
        boolean result=false;
        result=(this.name==a)?true:false;
        return result;
    }
     public boolean equal(Integers a){
        boolean result=false;
        result=(this.name==a.name)?true:false;
        return result;
    }
    public int[] parseInt(char[] list){
        int[] result=new int[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i]=(int)list[i];
        }
        return result;
    }
    public int parseInt(String a){
        Integer b=new Integer(a);
        return b;
    }


    public Integers(int name) {
        this.name = name;
    }

}
