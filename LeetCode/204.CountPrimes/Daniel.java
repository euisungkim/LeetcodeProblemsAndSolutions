
// Name: Daniel Eui Sung Kim
// Date: November 15th, 2017
// From: LeetCode
// Problem: #204 Count Primes
// Algorithm: Sieve of Eratosthenes

class Solution
{
  public int countPrimes(int n)
  {
    int count = 0;
    boolean[] notPrime = new boolean[n];
    for (int i = 2; i < n; i++)
    {
      // check if this number has been marked off
      if (notPrime[i - 1] == false)
      {
        // found prime (first prime == 2), increment count
        count++;
        // mark off the ones that are multiples of i
        for (int j = 2; j * i < n; j++)
        {
          notPrime[j * i - 1] = true;
        }
      }
    }

    return count;
  }
}