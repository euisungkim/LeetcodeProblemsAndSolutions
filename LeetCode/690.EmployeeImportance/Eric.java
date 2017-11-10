
// Name: Eric Kwon
// Date: November 6th, 2017
// From: LeetCode
// Problem: #690 Employee Importance

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        
        // Create a queue where the employee id's will be stored
        // Result = the integer sum that will be returned
        Queue<Integer> queue = new LinkedList<Integer>();
        int result = 0;
        
        // Add the first ID
        queue.add(id);
        
        // WHile the queue is not empty
        while (!queue.isEmpty()) {

            // Set the first element on the queue to int container
            int emp = queue.remove();

            // Traverse through the initial list
            for (int i=0 ; i < employees.size() ; i++) {

                // If there is a match
                if (emp == employees.get(i).id) {

                    // Add the importance
                    result += employees.get(i).importance;

                    // And also check if there are subordinates
                    while (!employees.get(i).subordinates.isEmpty()) {

                        // Also add the subordinates to the queue
                        // Remove the subordinates once they are added to the queue
                        queue.add(employees.get(i).subordinates.get(0));
                        employees.get(i).subordinates.remove(0);
                    }
                }
            }
        }
        return result;
    }
}