class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // If total sum isn't divisible by 3, we can't split it evenly
        if (sum % 3 != 0) {
            return false;
        }
        
        int target = sum / 3;
        int count = 0;
        int currentSum = 0;
        
        // We only loop up to arr.length - 1 because each of the 3 parts must be non-empty
        for (int i = 0; i < arr.length - 1; i++) {
            currentSum += arr[i];
            if (currentSum == target) {
                count++;
                currentSum = 0; // Reset running total for the next section
                
                // If we found two valid parts, the remaining array elements naturally form the 3rd
                if (count == 2) {
                    return true;
                }
            }
        }
        
        return false;
    }
}