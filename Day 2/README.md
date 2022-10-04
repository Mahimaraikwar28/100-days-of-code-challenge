PROBLEM: Check whether the number is palindrome or not.

SOLUTION : USING WHILE LOOP STATEMENT: 

INPUT: initializing variables i.e, rem=0,rev=0,temp=0;
       and initializing one more user define variable i.e, num;

TES CASES: 

           {*** temp=num;
        while(num>0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;*** }
           }

  LOGIC:   let num=1221;
  For number 1221, if we do 1221 % 10, we get the last digit 1, to get the second to the last digit, we need to remove the last digit from 1221, we could do so by dividing it by 10, 1221 / 10 = 122. Then we can get the last digit again by doing a modulus by 10, 122 % 10 = 2, and if we multiply the last digit by 10 and add the second last digit, 1 * 10 + 2 = 12, it gives us the reverted number we want. Continuing this process would give us the reverted number with more digits.

Now we divided the number by 10, and multiplied the reversed number by 10, when the original number is less than the reversed number, it means we've processed half of the number digits.


Output:
