public class Average {
    /*
     * This method calculates the average of the values in the nums array.
     * It converts the sum to double to ensure the result is a decimal value.
     *
     * @param nums an array to be manipulated.
     * @return the average of all the values in nums.
     */
    public double getAvg(int[] nums){
        // Check if the array is empty to avoid division by zero
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        // Calculate the sum of all numbers in the array
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // Convert the sum to double and divide by the number of elements
        return (double) sum / nums.length;
    }
}
