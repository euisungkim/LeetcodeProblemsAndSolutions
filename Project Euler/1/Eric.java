
// Name: Eric Kwon
// Problem 1: Find the sum of all the multiples of 3 or 5 below 1000.

class Eric {
    public static void main(String[] args){

        // Result Container
        int result = 0;

        // Traverse through to 1000
        for (int i=0 ; i < 1000 ; i++) {

            // If divisible by 3 or 5
            if ((i % 3 == 0 || i % 5 == 0))

                // Add to result
                result += i;
        }
        
        // Display the result
        System.out.println(result);
    }
}