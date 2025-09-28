# Coding



\# 🟢 Java Basic Programs



1\. \*\*Fibonacci Series in Java\*\*

&nbsp;   

&nbsp;   \* Start with `a=0, b=1`.

&nbsp;       

&nbsp;   \* Next term = `a+b`.

&nbsp;       

&nbsp;   \* Update: `a=b, b=next`.

&nbsp;       

&nbsp;   \* Repeat till required terms.

&nbsp;       

2\. \*\*Prime Number Program in Java\*\*

&nbsp;   

&nbsp;   \* A number `n` is prime if it’s divisible only by `1` and `n`.

&nbsp;       

&nbsp;   \* Check divisibility from `2` to `√n`.

&nbsp;       

&nbsp;   \* If divisible → not prime.

&nbsp;       

3\. \*\*Palindrome Program in Java\*\*

&nbsp;   

&nbsp;   \* Reverse the number/string.

&nbsp;       

&nbsp;   \* Compare with original.

&nbsp;       

&nbsp;   \* If equal → palindrome.

&nbsp;       

4\. \*\*Factorial Program in Java\*\*

&nbsp;   

&nbsp;   \* Factorial = product of numbers from `1` to `n`.

&nbsp;       

&nbsp;   \* Recursive: `fact(n) = n \* fact(n-1)`.

&nbsp;       

&nbsp;   \* Iterative: multiply in loop.

&nbsp;       

5\. \*\*Armstrong Number in Java\*\*

&nbsp;   

&nbsp;   \* Count digits of number.

&nbsp;       

&nbsp;   \* Take each digit → raise to power (digits).

&nbsp;       

&nbsp;   \* Sum them → compare with number.

&nbsp;       

6\. \*\*How to Generate Random Number in Java\*\*

&nbsp;   

&nbsp;   \* Use `Math.random()`.

&nbsp;       

&nbsp;   \* Or `Random` class: `new Random().nextInt(bound)`.

&nbsp;       

7\. \*\*How to Print Pattern in Java\*\*

&nbsp;   

&nbsp;   \* Use nested loops.

&nbsp;       

&nbsp;   \* Outer loop → rows.

&nbsp;       

&nbsp;   \* Inner loop → columns/symbols.

&nbsp;       

8\. \*\*How to Compare Two Objects in Java\*\*

&nbsp;   

&nbsp;   \* Override `equals()` in class.

&nbsp;       

&nbsp;   \* Compare fields inside `equals()`.

&nbsp;       

9\. \*\*How to Create Object in Java\*\*

&nbsp;   

&nbsp;   \* Using `new` keyword → `ClassName obj = new ClassName();`

&nbsp;       

10\. \*\*How to Print ASCII Value in Java\*\*

&nbsp;   



\* Convert char to int.

&nbsp;   

\* Example: `int ascii = (int) 'A';`.

&nbsp;   



---



\# 🟢 Java Number Programs



1\. \*\*Reverse a Number\*\*

&nbsp;   

&nbsp;   \* Initialize `rev=0`.

&nbsp;       

&nbsp;   \* Extract last digit `n%10`.

&nbsp;       

&nbsp;   \* `rev = rev\*10 + digit`.

&nbsp;       

&nbsp;   \* Remove last digit `n/=10`.

&nbsp;       

2\. \*\*Convert Number to Word\*\*

&nbsp;   

&nbsp;   \* Extract digits.

&nbsp;       

&nbsp;   \* Map each digit to word using array (`zero, one…`).

&nbsp;       

&nbsp;   \* Print sequentially.

&nbsp;       

3\. \*\*Automorphic Number\*\*

&nbsp;   

&nbsp;   \* Square the number.

&nbsp;       

&nbsp;   \* Check if square ends with number.

&nbsp;       

4\. \*\*Peterson Number\*\*

&nbsp;   

&nbsp;   \* Sum of factorial of digits = number.

&nbsp;       

5\. \*\*Sunny Number\*\*

&nbsp;   

&nbsp;   \* If `n+1` is a perfect square → Sunny Number.

&nbsp;       

6\. \*\*Tech Number\*\*

&nbsp;   

&nbsp;   \* Split number into 2 halves.

&nbsp;       

&nbsp;   \* Sum them.

&nbsp;       

&nbsp;   \* Square of sum = original number.

&nbsp;       

7\. \*\*Fascinating Number\*\*

&nbsp;   

&nbsp;   \* Concatenate `n, n\*2, n\*3`.

&nbsp;       

&nbsp;   \* Contains all digits `1–9` exactly once.

&nbsp;       

8\. \*\*Keith Number\*\*

&nbsp;   

&nbsp;   \* Use digits of number as initial sequence.

&nbsp;       

&nbsp;   \* Generate next terms = sum of previous digits.

&nbsp;       

&nbsp;   \* If sequence reaches number → Keith.

&nbsp;       

9\. \*\*Neon Number\*\*

&nbsp;   

&nbsp;   \* Square number.

&nbsp;       

&nbsp;   \* Sum digits of square.

&nbsp;       

&nbsp;   \* If equals number → Neon.

&nbsp;       

10\. \*\*Spy Number\*\*

&nbsp;   



\* Sum of digits = Product of digits.

&nbsp;   



11\. \*\*ATM Program Java\*\*

&nbsp;   



\* Menu-driven (Deposit, Withdraw, Check Balance).

&nbsp;   

\* Update balance accordingly.

&nbsp;   



12\. \*\*Autobiographical Number\*\*

&nbsp;   



\* A number is autobiographical if count of digit `i` = digit at position `i`.

&nbsp;   



13\. \*\*Emirp Number\*\*

&nbsp;   



\* Prime number whose reverse is also prime.

&nbsp;   



14\. \*\*Sphenic Number\*\*

&nbsp;   



\* Positive integer = product of 3 distinct prime numbers.

&nbsp;   



15\. \*\*Buzz Number\*\*

&nbsp;   



\* Ends with 7 OR divisible by 7.

&nbsp;   



16\. \*\*Duck Number\*\*

&nbsp;   



\* Contains zero(s) but does not start with zero.

&nbsp;   



17\. \*\*Evil Number\*\*

&nbsp;   



\* Binary representation has even number of `1`s.

&nbsp;   



18\. \*\*ISBN Number\*\*

&nbsp;   



\* Weighted sum of digits (check digit verification).

&nbsp;   



19\. \*\*Krishnamurthy Number\*\*

&nbsp;   



\* Same as Strong Number (sum of factorial of digits = number).

&nbsp;   



20\. \*\*Bouncy Number\*\*

&nbsp;   



\* Digits neither in increasing nor in decreasing order.

&nbsp;   



21\. \*\*Mystery Number\*\*

&nbsp;   



\* Number that can be expressed as sum of a number and its reverse.

&nbsp;   



22\. \*\*Smith Number\*\*

&nbsp;   



\* Composite number.

&nbsp;   

\* Sum of digits = sum of digits of prime factors.

&nbsp;   



23\. \*\*Strontio Number\*\*

&nbsp;   



\* Multiply number by 2.

&nbsp;   

\* Middle digits are same.

&nbsp;   



24\. \*\*Xylem and Phloem Number\*\*

&nbsp;   



\* Sum of extreme digits = Sum of middle digits.

&nbsp;   



25\. \*\*nth Prime Number\*\*

&nbsp;   



\* Generate primes in sequence until nth prime is reached.

&nbsp;   



26\. \*\*Alternate Prime Numbers\*\*

&nbsp;   



\* Generate primes.

&nbsp;   

\* Print only alternate ones.

&nbsp;   



27\. \*\*Square Root Without sqrt()\*\*

&nbsp;   



\* Use \*\*binary search\*\* or \*\*Newton Raphson method\*\*.

&nbsp;   



28\. \*\*Swap Numbers (Bitwise)\*\*

&nbsp;   



\* `a = a ^ b; b = a ^ b; a = a ^ b;`

&nbsp;   



29\. \*\*GCD of Two Numbers\*\*

&nbsp;   



\* Use Euclidean algorithm:

&nbsp;   

\* `gcd(a,b) = gcd(b, a % b)`

&nbsp;   



30\. \*\*Largest of Three Numbers\*\*

&nbsp;   



\* Use if-else OR Math.max().

&nbsp;   



31\. \*\*Smallest of Three (Ternary)\*\*

&nbsp;   



\* `min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);`

&nbsp;   



32\. \*\*Check Positive or Negative\*\*

&nbsp;   



\* If `n >= 0` → Positive else Negative.

&nbsp;   



33\. \*\*Perfect Square\*\*

&nbsp;   



\* Find sqrt (integer).

&nbsp;   

\* If `sqrt\*sqrt == n` → Perfect Square.

&nbsp;   



34\. \*\*Even Numbers 1–100\*\*

&nbsp;   



\* Loop from 1–100.

&nbsp;   

\* If `i % 2 == 0` → print.

&nbsp;   



35\. \*\*Odd Numbers 1–100\*\*

&nbsp;   



\* Loop from 1–100.

&nbsp;   

\* If `i % 2 != 0` → print.

&nbsp;   



36\. \*\*Sum of Natural Numbers\*\*

&nbsp;   



\* Formula: `n\*(n+1)/2`.

&nbsp;   

\* Or use loop to sum.



&nbsp; # Java Array Programs (logic)



1\. \*\*Copy all elements of one array into another\*\*

&nbsp;   

&nbsp;   \* Create new array `b` of same length; loop `for(i) b\[i] = a\[i]`; (or `System.arraycopy` / `Arrays.copyOf`).

&nbsp;       

2\. \*\*Frequency of each element\*\*

&nbsp;   

&nbsp;   \* Use a `HashMap<value,count>`; for each element `map.put(x, map.getOrDefault(x,0)+1)`.

&nbsp;       

3\. \*\*Left rotate an array\*\*

&nbsp;   

&nbsp;   \* For one position: store `temp=a\[0]`, shift `a\[i]=a\[i+1]`, set last `a\[n-1]=temp`. For k: repeat k times or use reversal algorithm.

&nbsp;       

4\. \*\*Print duplicate elements\*\*

&nbsp;   

&nbsp;   \* Use `HashSet` to track seen and another set to collect duplicates; or use frequency map and print keys with count\&gt;1.

&nbsp;       

5\. \*\*Print elements of an array\*\*

&nbsp;   

&nbsp;   \* Loop `for (i=0;i<n;i++) System.out.println(a\[i]);`.

&nbsp;       

6\. \*\*Print elements in reverse order\*\*

&nbsp;   

&nbsp;   \* Loop from `i=n-1` down to `0` and print `a\[i]`.

&nbsp;       

7\. \*\*Print elements at even positions\*\*

&nbsp;   

&nbsp;   \* Decide 0-based or 1-based. For 0-based even indices: `for(i=0;i<n;i+=2) print a\[i]`.

&nbsp;       

8\. \*\*Print elements at odd positions\*\*

&nbsp;   

&nbsp;   \* For 0-based odd indices: `for(i=1;i<n;i+=2) print a\[i]`.

&nbsp;       

9\. \*\*Print largest element\*\*

&nbsp;   

&nbsp;   \* Track `max = a\[0]`; loop and update `if(a\[i]>max) max=a\[i]`.

&nbsp;       

10\. \*\*Print smallest element\*\*

&nbsp;   



\* Track `min = a\[0]`; update `if(a\[i]<min) min=a\[i]`.

&nbsp;   



11\. \*\*Number of elements present\*\*

&nbsp;   



\* Use `array.length` (for dynamic lists use `list.size()`).

&nbsp;   



12\. \*\*Sum of all items\*\*

&nbsp;   



\* Accumulate `sum += a\[i]` in a loop (use `long` for large sums).

&nbsp;   



13\. \*\*Right rotate elements\*\*

&nbsp;   



\* For one position: store `temp=a\[n-1]`, shift right, set `a\[0]=temp`. For k: repeat or use reversal method.

&nbsp;   



14\. \*\*Sort ascending\*\*

&nbsp;   



\* Use `Arrays.sort(a)` or implement any sorting algorithm (quick, merge).

&nbsp;   



15\. \*\*Sort descending\*\*

&nbsp;   



\* Sort ascending then reverse, or use `Arrays.sort` with comparator for objects; or implement sort with `>` comparison.

&nbsp;   



16\. \*\*Find 3rd largest number\*\*

&nbsp;   



\* Maintain three largest variables while scanning, or sort and pick `a\[n-3]` (handle duplicates as needed).

&nbsp;   



17\. \*\*Find 2nd largest number\*\*

&nbsp;   



\* Track `first` and `second` largest while scanning once.

&nbsp;   



18\. \*\*Find largest number\*\*

&nbsp;   



\* Same as (9).

&nbsp;   



19\. \*\*Find 2nd smallest number\*\*

&nbsp;   



\* Maintain two smallest variables while scanning, or sort and take `a\[1]` (care with duplicates).

&nbsp;   



20\. \*\*Find smallest number\*\*

&nbsp;   



\* Same as (10).

&nbsp;   



21\. \*\*Remove duplicate elements\*\*

&nbsp;   



\* Use `LinkedHashSet` to preserve order: `new ArrayList<>(new LinkedHashSet<>(Arrays.asList(...)))`; or two-pointer on sorted array.

&nbsp;   



22\. \*\*Print odd and even numbers from an array\*\*

&nbsp;   



\* Loop and check `if (a\[i] % 2 == 0) evens.add(a\[i]) else odds.add(a\[i])`.

&nbsp;   



23\. \*\*How to sort an array\*\*

&nbsp;   



\* Use built-in `Arrays.sort(a)` for primitives/objects; or implement bubble/selection/quick/merge.

&nbsp;   



---



\# Java Matrix Programs (logic)



1\. \*\*Java Matrix Programs (general)\*\*

&nbsp;   

&nbsp;   \* Represent as `int\[]\[] m = new int\[r]\[c]`. Use nested loops `for(i) for(j)` to traverse.

&nbsp;       

2\. \*\*Add two matrices\*\*

&nbsp;   

&nbsp;   \* Check same dimensions; `res\[i]\[j] = a\[i]\[j] + b\[i]\[j]`.

&nbsp;       

3\. \*\*Multiply two matrices\*\*

&nbsp;   

&nbsp;   \* For `res\[i]\[j] = sum over k of a\[i]\[k] \* b\[k]\[j]`. Validate `aCols == bRows`.

&nbsp;       

4\. \*\*Subtract two matrices\*\*

&nbsp;   

&nbsp;   \* `res\[i]\[j] = a\[i]\[j] - b\[i]\[j]`.

&nbsp;       

5\. \*\*Determine whether two matrices are equal\*\*

&nbsp;   

&nbsp;   \* Same dims and every `a\[i]\[j] == b\[i]\[j]`.

&nbsp;       

6\. \*\*Display lower triangular matrix\*\*

&nbsp;   

&nbsp;   \* For each `i,j` print `a\[i]\[j]` if `i >= j` else print `0` or skip.

&nbsp;       

7\. \*\*Display upper triangular matrix\*\*

&nbsp;   

&nbsp;   \* Print `a\[i]\[j]` if `i <= j` else `0`.

&nbsp;       

8\. \*\*Frequency of odd \& even numbers in matrix\*\*

&nbsp;   

&nbsp;   \* Loop all entries, increment odd/even counters using `%2`.

&nbsp;       

9\. \*\*Product of two matrices\*\*

&nbsp;   

&nbsp;   \* Same as (3) — matrix multiplication.

&nbsp;       

10\. \*\*Sum of each row and each column\*\*

&nbsp;   



\* For rows: loop `i` sum across j. For columns: loop `j` sum across i.

&nbsp;   



11\. \*\*Transpose of a matrix\*\*

&nbsp;   



\* `res\[j]\[i] = a\[i]\[j]`. For square matrix can swap in-place.

&nbsp;   



12\. \*\*Check if identity matrix\*\*

&nbsp;   



\* For square `n`: diagonal `a\[i]\[i]==1` and off-diagonal `a\[i]\[j]==0`.

&nbsp;   



13\. \*\*Check if sparse matrix\*\*

&nbsp;   



\* Count zeros; if zeros \&gt; (rows\\\*cols)/2 → sparse.

&nbsp;   



14\. \*\*Transpose matrix\*\*

&nbsp;   



\* Same as (11).

&nbsp;   



---



\# Java String Programs (logic)



1\. \*\*Count total number of characters in a string\*\*

&nbsp;   

&nbsp;   \* Use `str.length()` (counts all characters). For excluding spaces use `str.replace(" ", "").length()`.

&nbsp;       

2\. \*\*Count total number of characters in a string 2\*\*

&nbsp;   

&nbsp;   \* Possibly counting unique characters: use `Set<Character>` and add all chars.

&nbsp;       

3\. \*\*Count punctuation characters in a string\*\*

&nbsp;   

&nbsp;   \* Loop chars and check `if (!Character.isLetterOrDigit(c) \&\& !Character.isWhitespace(c)) count++`.

&nbsp;       

4\. \*\*Count vowels and consonants\*\*

&nbsp;   

&nbsp;   \* Loop chars; if `Character.isLetter(c)` then check `aeiou` vs consonant; maintain counts.

&nbsp;       

5\. \*\*Determine whether two strings are anagrams\*\*

&nbsp;   

&nbsp;   \* Normalize (lowercase, remove spaces), sort both char arrays and compare, or count char frequencies.

&nbsp;       

6\. \*\*Divide a string into N equal parts\*\*

&nbsp;   

&nbsp;   \* If `len % n == 0` then chunk size `len/n`; slice substrings of that size.

&nbsp;       

7\. \*\*Find all subsets of a string\*\*

&nbsp;   

&nbsp;   \* Use bitmask from `0` to `2^n - 1` and include characters where bit is set.

&nbsp;       

8\. \*\*Find longest repeating sequence in a string\*\*

&nbsp;   

&nbsp;   \* Use suffix array/DP or sliding window; simpler: for each start, extend and track longest adjacent repeats.

&nbsp;       

9\. \*\*Find all permutations of a string\*\*

&nbsp;   

&nbsp;   \* Use recursion/backtracking swapping chars or use Heap’s algorithm.

&nbsp;       

10\. \*\*Remove all white spaces from a string\*\*

&nbsp;   



\* `str.replaceAll("\\\\s+", "")`.

&nbsp;   



11\. \*\*Replace lower-case with upper and vice-versa\*\*

&nbsp;   



\* Loop chars: if `Character.isUpperCase(c)` convert to `toLowerCase`, else toUpperCase.

&nbsp;   



12\. \*\*Replace spaces with specific character\*\*

&nbsp;   



\* `str.replace(' ', ch)` or `replaceAll("\\\\s+", String.valueOf(ch))`.

&nbsp;   



13\. \*\*Check if a string is palindrome\*\*

&nbsp;   



\* Compare with reversed string, or two-pointer scan `i` and `j`.

&nbsp;   



14\. \*\*Check if one string is rotation of another\*\*

&nbsp;   



\* If lengths equal and `s2` is substring of `s1+s1` then rotation.

&nbsp;   



15\. \*\*Find max and min occurring character\*\*

&nbsp;   



\* Count frequency array of size 256 or map, then find char with max/min count (skip zeros for min).

&nbsp;   



16\. \*\*Reverse of the string\*\*

&nbsp;   



\* Use `new StringBuilder(str).reverse().toString()` or manual loop.

&nbsp;   



17\. \*\*Find duplicate characters in a string\*\*

&nbsp;   



\* Frequency map, print chars with count\&gt;1.

&nbsp;   



18\. \*\*Find duplicate words in a string\*\*

&nbsp;   



\* Split on whitespace to words, use `HashMap<String,Integer>` to count words and print counts\&gt;1.

&nbsp;   



19\. \*\*Find frequency of characters\*\*

&nbsp;   



\* Use `int\[256]` or `Map<Character,Integer>` and count.

&nbsp;   



20\. \*\*Find largest and smallest word in a string\*\*

&nbsp;   



\* Split into words; track longest and shortest by `length()`.

&nbsp;   



21\. \*\*Find most repeated word in a text file\*\*

&nbsp;   



\* Read file, split into words, count with map, then find max entry.

&nbsp;   



22\. \*\*Find number of words in a text file\*\*

&nbsp;   



\* Read file and split on whitespace, count tokens (careful with punctuation).

&nbsp;   



23\. \*\*Separate individual characters from a string\*\*

&nbsp;   



\* Loop `for (char c : str.toCharArray())` and store/print.

&nbsp;   



24\. \*\*Swap two string variables without third variable\*\*

&nbsp;   



\* `a = a + b; b = a.substring(0, a.length()-b.length()); a = a.substring(b.length());` (or use char arrays).

&nbsp;   



25\. \*\*Print smallest and biggest possible palindrome word in given string\*\*

&nbsp;   



\* Interpret: find substrings that are palindromes; pick shortest and longest palindrome substrings.

&nbsp;   



26\. \*\*Reverse string word by word\*\*

&nbsp;   



\* Split into words, reverse array of words, join with spaces.

&nbsp;   



27\. \*\*Reverse string without reverse() function\*\*

&nbsp;   



\* Build new string by iterating from `len-1` to `0` and appending characters.

&nbsp;   



---



\# Java Searching \& Sorting Programs (logic)



1\. \*\*Linear Search\*\*

&nbsp;   

&nbsp;   \* Loop `for(i) if(a\[i]==key) return i;` else -1.

&nbsp;       

2\. \*\*Binary Search\*\*

&nbsp;   

&nbsp;   \* Array must be sorted. Use low/high pointers, mid = (low+high)/2, compare and adjust.

&nbsp;       

3\. \*\*Bubble Sort\*\*

&nbsp;   

&nbsp;   \* Repeated passes swapping adjacent out-of-order elements; optimization: stop if no swaps in a pass.

&nbsp;       

4\. \*\*Selection Sort\*\*

&nbsp;   

&nbsp;   \* For each position i, find min from i..n-1 and swap with i.

&nbsp;       

5\. \*\*Insertion Sort\*\*

&nbsp;   

&nbsp;   \* Build sorted portion by inserting `a\[i]` into correct place in `0..i-1`.

&nbsp;       



---



\# Java Conversion Programs (logic)



1\. \*\*String → int\*\*: `Integer.parseInt(str)` or `Integer.valueOf(str)`.

&nbsp;   

2\. \*\*int → String\*\*: `String.valueOf(i)` or `Integer.toString(i)`.

&nbsp;   

3\. \*\*String → long\*\*: `Long.parseLong(str)`.

&nbsp;   

4\. \*\*long → String\*\*: `String.valueOf(l)`.

&nbsp;   

5\. \*\*String → float\*\*: `Float.parseFloat(str)`.

&nbsp;   

6\. \*\*float → String\*\*: `String.valueOf(f)`.

&nbsp;   

7\. \*\*String → double\*\*: `Double.parseDouble(str)`.

&nbsp;   

8\. \*\*double → String\*\*: `String.valueOf(d)`.

&nbsp;   

9\. \*\*String → Date\*\*: use `SimpleDateFormat` (`new SimpleDateFormat(pattern).parse(str)`).

&nbsp;   

10\. \*\*Date → String\*\*: `new SimpleDateFormat(pattern).format(date)`.

&nbsp;   

11\. \*\*String → char\*\*: `str.charAt(index)` or `str.toCharArray()`.

&nbsp;   

12\. \*\*char → String\*\*: `String.valueOf(ch)`.

&nbsp;   

13\. \*\*String → Object\*\*: The string is already an `Object`; cast: `Object o = (Object) str`.

&nbsp;   

14\. \*\*Object → String\*\*: `String s = obj.toString()` (handle null).

&nbsp;   

15\. \*\*int → long\*\*: implicit cast `long l = i;` or `(long)i`.

&nbsp;   

16\. \*\*long → int\*\*: cast `int i = (int) l;` (may lose data).

&nbsp;   

17\. \*\*int → double\*\*: `double d = i;`.

&nbsp;   

18\. \*\*double → int\*\*: `int i = (int) d;` (truncation).

&nbsp;   

19\. \*\*char → int\*\*: `int code = (int) ch;`.

&nbsp;   

20\. \*\*int → char\*\*: `char c = (char) i;`.

&nbsp;   

21\. \*\*String → boolean\*\*: `Boolean.parseBoolean(str)` (`"true"` → true).

&nbsp;   

22\. \*\*boolean → String\*\*: `String.valueOf(flag)`.

&nbsp;   

23\. \*\*Date → Timestamp\*\*: `new java.sql.Timestamp(date.getTime())`.

&nbsp;   

24\. \*\*Timestamp → Date\*\*: `new Date(timestamp.getTime())`.

&nbsp;   

25\. \*\*Binary → Decimal\*\*: parse with base `2`: `Integer.parseInt(binStr, 2)`.

&nbsp;   

26\. \*\*Decimal → Binary\*\*: `Integer.toBinaryString(n)`.

&nbsp;   

27\. \*\*Hex → Decimal\*\*: `Integer.parseInt(hexStr, 16)`.

&nbsp;   

28\. \*\*Decimal → Hex\*\*: `Integer.toHexString(n)`.

&nbsp;   

29\. \*\*Octal → Decimal\*\*: `Integer.parseInt(octStr, 8)`.

&nbsp;   

30\. \*\*Decimal → Octal\*\*: `Integer.toOctalString(n)`.

&nbsp;   



---



\# Java Pattern Programs (logic)



1–16) \*\*Various printed patterns (spiral, triangle, diamond, palindromic, etc.)\*\*



\* General approach: use nested loops (rows/columns).

&nbsp;   

\* Compute number of spaces and characters per row based on pattern formula.

&nbsp;   

\* Spiral: maintain `top, bottom, left, right` boundaries and traverse in 4 directions updating boundaries.

&nbsp;   

\* For symmetric patterns, use `Math.abs` or two halves approach.

&nbsp;   

\* For numeric patterns, compute values per position (e.g., increasing, decreasing, row-based increments).

&nbsp;   



(If you want specific ASCII patterns, give one example and I’ll provide exact loop logic.)



---



\# Java Singly Linked List Programs (logic)



1\. \*\*Singly linked list Examples\*\*

&nbsp;   

&nbsp;   \* Node with `data` and `next`. Perform standard operations.

&nbsp;       

2\. \*\*Create and display a singly linked list\*\*

&nbsp;   

&nbsp;   \* Build nodes linking `next`; traverse from `head` printing `data`.

&nbsp;       

3\. \*\*Create n nodes and count nodes\*\*

&nbsp;   

&nbsp;   \* Insert n times; to count traverse and increment counter.

&nbsp;       

4\. \*\*Display list in reverse order\*\*

&nbsp;   

&nbsp;   \* Recursion: print `printReverse(`\[`node.next`](http://node.next)`)` then `print` \[`node.data`](http://node.data); or push to stack then pop.

&nbsp;       

5\. \*\*Delete node from beginning\*\*

&nbsp;   

&nbsp;   \* `head =` \[`head.next`](http://head.next).

&nbsp;       

6\. \*\*Delete node from middle\*\*

&nbsp;   

&nbsp;   \* Traverse to node before target and adjust \[`prev.next`](http://prev.next) `=` \[`target.next`](http://target.next).

&nbsp;       

7\. \*\*Delete node from end\*\*

&nbsp;   

&nbsp;   \* Traverse to second-last node and set its `next = null`.

&nbsp;       

8\. \*\*Check if list is palindrome\*\*

&nbsp;   

&nbsp;   \* Find middle (fast/slow), reverse second half, compare halves, optionally restore.

&nbsp;       

9\. \*\*Find max and min value node\*\*

&nbsp;   

&nbsp;   \* Traverse and track `max` and `min`.

&nbsp;       

10\. \*\*Insert new node at middle\*\*

&nbsp;   



\* Find middle index using slow/fast or size/2, insert by pointer adjustments.

&nbsp;   



11\. \*\*Insert at beginning\*\*

&nbsp;   



\* New node's `next = head`; `head = newNode`.

&nbsp;   



12\. \*\*Insert at end\*\*

&nbsp;   



\* Traverse to last and \[`last.next`](http://last.next) `= newNode`.

&nbsp;   



13\. \*\*Remove duplicate elements\*\*

&nbsp;   



\* Use `HashSet` to track seen values; adjust links to skip duplicates.

&nbsp;   



14\. \*\*Search an element\*\*

&nbsp;   



\* Traverse and compare each node's data.

&nbsp;   



---



\# Java Circular Linked List Programs (logic)



1\. \*\*Create \& display a Circular Linked List\*\*

&nbsp;   

&nbsp;   \* Last node `next` points to `head`. Traverse with do-while to avoid infinite loop.

&nbsp;       

2\. \*\*Create N nodes and count\*\*

&nbsp;   

&nbsp;   \* Insert while maintaining circular links; to count, start at head and loop until back to head.

&nbsp;       

3\. \*\*Display reverse\*\*

&nbsp;   

&nbsp;   \* Harder in single-link circular: collect nodes in stack during traversal, then pop to print.

&nbsp;       

4\. \*\*Delete from beginning\*\*

&nbsp;   

&nbsp;   \* If single node: `head = null`; else set \[last.next](http://last.next) = \[head.next](http://head.next) and `head =` \[`head.next`](http://head.next).

&nbsp;       

5\. \*\*Delete from end\*\*

&nbsp;   

&nbsp;   \* Find node before last, set its `next = head`.

&nbsp;       

6\. \*\*Delete from middle\*\*

&nbsp;   

&nbsp;   \* Traverse to previous node of target and adjust link.

&nbsp;       

7\. \*\*Find max and min node\*\*

&nbsp;   

&nbsp;   \* Traverse circularly scanning `data`.

&nbsp;       

8\. \*\*Insert at beginning\*\*

&nbsp;   

&nbsp;   \* Create node, set \[node.next](http://node.next) = head, update \[last.next](http://last.next) = node, head = node.

&nbsp;       

9\. \*\*Insert at end\*\*

&nbsp;   

&nbsp;   \* Create node, set \[last.next](http://last.next) = node, \[node.next](http://node.next) = head.

&nbsp;       

10\. \*\*Insert at middle\*\*

&nbsp;   



\* Find position using count/2 and insert similarly to singly list.

&nbsp;   



11\. \*\*Remove duplicates\*\*

&nbsp;   



\* Use set to detect duplicates while traversing and remove by relinking.

&nbsp;   



12\. \*\*Search an element\*\*

&nbsp;   



\* Traverse until back to head; check each node.

&nbsp;   



13\. \*\*Sort circular linked list\*\*

&nbsp;   



\* Break circularity, apply sorting (e.g., merge sort on linked list), then re-link circularly.

&nbsp;   



---



\# Java Doubly Linked List Programs (logic)



1\. \*\*Convert binary tree to doubly linked list\*\*

&nbsp;   

&nbsp;   \* In-order traversal linking nodes to previous; use recursion to thread nodes.

&nbsp;       

2\. \*\*Create doubly linked list from ternary tree\*\*

&nbsp;   

&nbsp;   \* Flatten tree (pre/in/post order) and link nodes with `prev` and `next`.

&nbsp;       

3\. \*\*Create n nodes and count\*\*

&nbsp;   

&nbsp;   \* Standard insert operations, count by traversing `next`.

&nbsp;       

4\. \*\*Display in reverse order\*\*

&nbsp;   

&nbsp;   \* Traverse to tail, then follow `prev` pointers printing data.

&nbsp;       

5\. \*\*Create and display doubly linked list\*\*

&nbsp;   

&nbsp;   \* Insert nodes with `next` and `prev`, then traverse from head.

&nbsp;       

6\. \*\*Delete node from beginning\*\*

&nbsp;   

&nbsp;   \* `head =` \[`head.next`](http://head.next)`; head.prev = null;`

&nbsp;       

7\. \*\*Delete node from end\*\*

&nbsp;   

&nbsp;   \* Move to tail `tail = tail.prev;` \[`tail.next`](http://tail.next) `= null;`

&nbsp;       

8\. \*\*Delete node from middle\*\*

&nbsp;   

&nbsp;   \* Adjust \[`prev.next`](http://prev.next) `= next` and `next.prev = prev`.

&nbsp;       

9\. \*\*Find max and min node\*\*

&nbsp;   

&nbsp;   \* Traverse and keep track of values.

&nbsp;       

10\. \*\*Insert at beginning\*\*

&nbsp;   



\* New node's `next = head; head.prev = new; head = new`.

&nbsp;   



11\. \*\*Insert at end\*\*

&nbsp;   



\* Append after tail, set pointers.

&nbsp;   



12\. \*\*Insert at middle\*\*

&nbsp;   



\* Locate position then link new node between `prev` and `next`.

&nbsp;   



13\. \*\*Remove duplicates\*\*

&nbsp;   



\* Use set of values while traversing, unlink duplicates updating both `prev` and `next`.

&nbsp;   



14\. \*\*Rotate doubly linked list by N nodes\*\*

&nbsp;   



\* Move `head` to \[`head.next`](http://head.next) N times or adjust `head` and `tail` pointers appropriately.

&nbsp;   



15\. \*\*Search an element\*\*

&nbsp;   



\* Traverse either forward or backward and compare.

&nbsp;   



16\. \*\*Sort elements\*\*

&nbsp;   



\* Use merge sort tailored for linked lists (efficient, O(n log n)).



