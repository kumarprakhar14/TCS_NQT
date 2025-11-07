class ArraySmallestElement {
    public static void main(String[] args) {
        int[] arr = {1, 9, 5, -7, 6};
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }

        System.out.println(ans);
    }
}