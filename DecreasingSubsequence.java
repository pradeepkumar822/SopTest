

public class DecreasingSubsequence {

    public static int decrease(int[] arr) {
        int n = arr.length;
        int[] s = new int[n];
        Arrays.fill(s, 1);
            for (int j = 0; j < i; j++) {
                
                if (arr[i] < arr[j]) {
                    s[i] = Math.max(s[i], s[j] + 1);
                }
            }
        }
        int longest = 0;
        for (int i = 0; i < n; i++) {
            longest = Math.max(longest, s[i]);
        }
        return longest;
    
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,4,6,1,2,3};
        int result = decrease(arr);
        System.out.println(result);
    }
}

