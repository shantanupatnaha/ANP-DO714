public class LargestElementArray {
    static int findLargest(int[] arr, int n) {
        // Base case: If there's only one element, return it
        if (n == 1) {
            return arr[0];
        }
        
        // Recursively find the largest in the rest of the array
        int max = findLargest(arr, n - 1);
        
        // Compare the last element with the maximum so far
        return Math.max(max, arr[n - 1]);
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 70, 20};
        int n = arr.length;

        int largest = findLargest(arr, n);
        System.out.println("The largest element is: " + largest);
    }
}
