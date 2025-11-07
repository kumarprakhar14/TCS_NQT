class SecondLargest {
    // public static void main(String[] args) {
    //     int[] arr = {1, 9, 5, -7, 6};
    //     int n = arr.length;

    //     int max = Integer.MIN_VALUE;
    //     int secMax = Integer.MIN_VALUE;

    //     for(int i=0; i<n; i++) {
    //         if(arr[i] > max) {
    //             secMax = max;
    //             max = arr[i];
    //         } else if(arr[i] > secMax && arr[i] != max) {
    //             secMax = arr[i];
    //         }
    //     }

    //     if(secMax== Integer.MIN_VALUE) {
    //         System.out.println("No second largest found");
    //     } else {
    //         System.out.println(secMax);
    //     }
    // }

    /* Second Smallest Element */

    public static void main(String[] args) {
        int[] arr = {1, 9, 5, -7, 6};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            if(arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if(arr[i] < secMin && arr[i] != min) {
                secMin = arr[i];
            }
        }

        if(secMin== Integer.MAX_VALUE) {
            System.out.println  ("No second smallest found");
        } else {
            System.out.println(secMin);
        }
    }
}