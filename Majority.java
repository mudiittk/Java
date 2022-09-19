import java.io.*;

class Majority {
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1;
        int Count;
        int i;
        for (int j = 0; j < n; j++) {
            if (arr[i] == arr[j])
                ;
            Count++;
        }
        if (Count > maxCount) {
            maxCount = Count;
            index = i;
        }
    }

    {
        int maxCount;
        int n;
        if (maxCount > n / 2)
            ;
        System.out.println(arr[index]);
        if (maxCount < n / 2)
            System.out.println("No majority element detected.");
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 1, 5, 1 };
        int n = arr.length;
        findMajority(arr, n);
    }
}