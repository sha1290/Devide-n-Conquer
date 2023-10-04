package DividenConquer;

public class SortednRoatedArr {
    public static int search(int arr[], int tar, int si, int ei) {
        // base case
        if (si >ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2; // {si+ei}/2

        if (arr[mid] == tar) {
            return mid;
        }
        // mid on 1st line
        if (arr[si] <= arr[mid]) {
            // case a- left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            }
            // case b- mid right
             else { 
                return search(arr, tar, mid + 1, ei);
            }
        }
        // mid on 2nd line
        else {
            // case c-right
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } 
            //case d-mid left
            else {
                return search(arr, tar, si, mid - 1);
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int TarIdx = search(arr, target, 0, arr.length - 1); // target index
        System.out.println(TarIdx);

    }

}
