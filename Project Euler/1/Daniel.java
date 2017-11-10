
// Name: Daniel Eui Sung Kim
// Problem 1: Find the sum of all the multiples of 3 or 5 below 1000.

class Daniel
{
  public static int sum_divisible_by_n(int n, int target)
  {
    int p = target / n;
    return  n * (p * (p+1) ) / 2;
    // 3 + 6 + 9 + 12 + ... + 999 = 3*(1+2+3+4+...+333)
  }

  public static int find_nearest_integer(int n, int target)
  {
    return target - (target % n);
  }

  // O(1) time complexity
  public static void main(String[] args)
  {
    // since sum divisible by 3 and 5 also contain multiples of 15, need to subtract its numbers
    // Find the sum of all the multiples of 3 or 5 __below__ 1000, thus 999 is maximum target to find rounded down nearest integer
    System.out.println(sum_divisible_by_n(3, find_nearest_integer(3,999)) + sum_divisible_by_n(5, find_nearest_integer(5, 999)) - sum_divisible_by_n(15, find_nearest_integer(15,999)));
  }
}