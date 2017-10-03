
// Name: Daniel Eui Sung Kim
// Date: October 2nd, 2017
// From: LeetCode
// Problem: #682 Baseball Game

class Solution
{
    public int calPoints(String[] ops)
    {
        // keeping stack of valid values
        Stack<Integer> validValue = new Stack<>();
        int sum = 0;
        int curVal;
        for ( int i = 0; i < ops.length; i++ )
        {
            if ( ops[i].equals("C") )
            {   // if C, last valid round's points were invalid and removed
                sum -= validValue.pop();
            }
            else if ( ops[i].equals("D") )
            {   // if D, points you get this round are
                // doubled data of the last valid round's points
                curVal = validValue.peek() * 2;
                sum += curVal;
                validValue.add(curVal);
            }
            else if ( ops[i].equals("+") )
            {   // if "+", points you get this are
                // sum of last two valid round's points
                int tempValidValue = validValue.peek();
                int tempValidSum = validValue.peek();

                // pop from stack to get the last valid round's point
                sum += validValue.pop();

                // if stack is empty then last valid round's point was the only point
                // thus add the last valid rount's point one more time
                if ( validValue.isEmpty() )
                {
                    sum += tempValidValue;
                    tempValidSum += tempValidValue;
                }
                // otherwise add previous valid rount's point to sum
                else
                {
                    sum += validValue.peek();
                    // tempValidSum is addition of last valid round's point
                    tempValidSum += validValue.peek();
                }

                // add the last valid round's point
                validValue.add(tempValidValue);
                // then add current round's point
                validValue.add(tempValidSum);
            }
            else
            {
                // parse string into integer (current point)
                validValue.add(Integer.parseInt(ops[i]));
                sum += Integer.parseInt(ops[i]);
            }
        }
        
        return sum;
    }
}