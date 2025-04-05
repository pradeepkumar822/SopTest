public class LastDuplicate {

    public static int Lastduplicate(int[] arr) {
        int lastduplicate = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (seen.contains(arr[i])) {
                lastduplicate = arr[i];
            } else {
                seen.add(arr[i]);
            }
        }

        return lastduplicate;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,4,5,6,7};
        int result = Lastduplicate(arr);
        if (result == -1) {
            System.out.println("No duplicate found");
        } else {
            System.out.println(result);
        }
    }
}
