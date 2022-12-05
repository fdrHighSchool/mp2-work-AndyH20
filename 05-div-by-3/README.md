# Div By 3
#### Respond to the following:

1. A number is considered *prime* if its only factors are 1 and itself. For example, 7 is prime (1 and 7 are the only factors) and 9 is not (1, 3 and 9 are factors).  
Outline an algorithm to determine whether or not a number is prime.  
Think of the following method header:
`public static boolean isPrime(int num)`

  * Take the num and divide from 1-9 so it would a loop. If num % 1-9 doesn't equal 0 then it would be prime, return true. If 1 doesn't work add one and constantly mod. If one number works, return false. If the number is one digit, we don't mod by the number by itself.
