package a_01_Basic_Programs;
/*
Prime Number Program in Java
A number n is prime if it’s divisible only by 1 and n.
Check divisibility from 2 to √n.
If divisible → not prime.
 */
 class PrimeNumber {
     public static void main(String[] args) {
         int num=7;
         for(int i =2;i<num;i++){
             if(num%i==0){
                 System.out.println("It is not a prime Number");
                 break;
             }
             else{
                 System.out.println("It is a prime Number");
                 break;
             }

         }


     }
}
