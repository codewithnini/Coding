package a_01_Basic_Programs;
/*
Palindrome Program

Reverse the number/string.
Compare with original.
If equal → palindrome.
 */
 class PalindromeNumber {
  public static void main(String[] args) {
   int num = 121;
   int actual=num; // here i take another variable beacuse to store the actual value .
   int rev = 0;
   for(int i=0;i<num;num=num/10){
    int lastadigits=num%10; // in every loop we get the ;last digit
    rev=rev*10+lastadigits;  // every loop multyply 10 to maintan decimal value
   }
   if (actual==rev){
    System.out.println(actual+" is a prime number");
   }else {
    System.out.println(actual+" is not a prime number");
   }
  }
}
