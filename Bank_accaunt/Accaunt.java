package Bank_accaunt;

import java.util.Date;
import java.util.Scanner;

public class Accaunt {
 public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  System.out.print("Enter id: ");
  int id=input.nextInt();
  Accaunt a=new Accaunt(id);
}
 private int[] id={1,2,3,4,5,6,7,8,9,10};
 private double balance=100;
 private double annualInteresRate=0;
 public Date dateCreated;

 public Accaunt(int id) {
  for (int i = 0; i < this.id.length; i++) {
   if(this.id[i] == id){
    while (true)
     Commands();
   }
  }
 }
 public void Commands(){
  Scanner input=new Scanner(System.in);
  System.out.println("1.Check balance");
  System.out.println("2: withdraw");
  System.out.println("3: deposit");
  System.out.println("4: exit");
  System.out.print("Enter a choice: ");
  int a=input.nextInt();
  if (a==1) {
   double balance=Balance();
   System.out.println("balance = " + balance);
  }
  else if (a==2){
   System.out.print("Enter an amount to withdraw: ");
   int percent=input.nextInt();
   withdraw(percent);

  }
  else if(a==3){
 System.out.print("Enter an amount to deposit: ");
   int percent=input.nextInt();
   deposit(percent);
  }
else{
  System.exit(0);
  }
  
 }
 public void withdraw(double cashback)
 {
  balance=(1-cashback/100)*balance;
 }
 public void deposit(double deposit)
 {
  balance=(1+deposit/100)*balance;
 }
 public double Balance(){
  return balance;
 }
}
