
// Name: Eric Kwon
// Date: October 2nd, 2017
// From: LeetCode
// Problem: #682 Baseball Game

class Solution {
    public int calPoints(String[] ops) {

    	// Size of the incoming array and the result to be returned
        int arraySize = ops.length;
        int result = 0;
        
        // Traverse through the String array
        for (int i=0; i < arraySize ; i++) {
            switch (ops[i]) {

            	// In case of C - invalidate the previous valid score
                case "C":
                    int counttt = 0;
                    for (int j=i ; counttt < 1 ; j--) {
                        if (ops[j-1] != "X") {
                            result -= Integer.valueOf(ops[j-1]);
                            ops[j-1] = "X";
                            counttt++;
                        }
                    }

                    // Make current index into "X" to show that the operation took place
                    ops[i] = "X";
                    break;

                // In case of D - get the previous valid point and add the double to the result
                case "D":
                    int count = 0;
                    int roundScore = 0;
                    for (int j=i ; count < 1 ; j--) {
                        if (ops[j-1] != "X") {
                            roundScore = (2 * Integer.valueOf(ops[j-1]));
                            result += roundScore;
                            count++;
                            }
                    }

                    // Make the current index into the double value of the previous valid score
                    ops[i] = Integer.toString(roundScore);
                    break;

                // In case of + - get the previous 2 valid points and add to the result
                case "+":
                    int countt = 0;
                    int roundScoree = 0;
                    for (int j=i ; countt < 2 ; j--) {
                        if (ops[j-1] != "X") {
                            roundScoree += Integer.valueOf(ops[j-1]);
                            result += Integer.valueOf(ops[j-1]);
                            countt++;
                        }
                    }

                    // Make the current index into the sum of two previous valid points
                    ops[i] = Integer.toString(roundScoree);
                    break;
                default:

                	// Otherwise just add to the resulting integer
                    result += Integer.valueOf(ops[i]);
                    break;
            }
        }
        return result;
    }
}