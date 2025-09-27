package a_01_Basic_Programs;
/*
Fibonacci Series in Java
Start with a=0, b=1.
Next term = a+b.
Update: a=b, b=next.
Repeat till required terms.
 */


class FibonacciSeries {
     public static void main(String[] args) {
         int first=0;
         int second=1;
         int fibo=0;

         int n =8; // numbers i want

         for(int i=0;i<n;i++){
             System.out.println(fibo);
             first=second;
             second=fibo;
             fibo=first+second;
         }

     }
}
