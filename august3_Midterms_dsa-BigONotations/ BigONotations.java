public class BigONotations {

    public static int getFirst(int[] data) {
        return data[0];
    }

    public static boolean checkEven(int value) {
        return value % 2 == 0;
    }

    public static int searchBinary(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == key) {
                return middle;
            } else if (arr[middle] < key) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    public static int maxValue(int[] data) {
        int max = data[0];
        for (int val : data) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static int totalSum(int[] data) {
        int sum = 0;
        for (int v : data) {
            sum += v;
        }
        return sum;
    }

    public static void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);

            mergeParts(data, left, mid, right);
        }
    }

    private static void mergeParts(int[] data, int left, int mid, int right) {
        int size1 = mid - left + 1;
        int size2 = right - mid;

        int[] L = new int[size1];
        int[] R = new int[size2];

        for (int i = 0; i < size1; i++) L[i] = data[left + i];
        for (int j = 0; j < size2; j++) R[j] = data[mid + 1 + j];

        int i = 0, j = 0, r = left;

        while (i < size1 && j < size2) {
            if (L[i] <= R[j]) {
                data[r++] = L[i++];
            } else {
                data[r++] = R[j++];
            }
        }

        while (i < size1) data[r++] = L[i++];
        while (j < size2) data[r++] = R[j++];
    }

    public static void bubble(int[] data) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void showDuplicates(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] == data[j]) {
                    System.out.println("Duplicate: " + data[i]);
                }
            }
        }
    }

    public static void triplets(int[] data) {
        int n = data.length;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    System.out.println(data[x] + " " + data[y] + " " + data[z]);
                }
            }
        }
    }

    public static void generateSubsets(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        generateSubsets(arr, index + 1, current);
        generateSubsets(arr, index + 1, current + arr[index] + " ");
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void permutations(int[] data, int pos) {
        if (pos == data.length) {
            printArray(data);
            return;
        }

        for (int i = pos; i < data.length; i++) {
            swap(data, pos, i);
            permutations(data, pos + 1);
            swap(data, pos, i);
        }
    }

    private static void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    private static void printArray(int[] data) {
        for (int v : data) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    int[] arr = {3, 1, 4, 1, 5};
    System.out.println("O(1) - Constant");
    System.out.println("First Number : " + getFirst(arr));
    System.out.println("Is 10 even?  : " + checkEven(10));

    int[] sorted = {1, 2, 3, 4, 5};
    System.out.println("\nO(log n) - Logarithmic");
    System.out.println("Index of 4: " + searchBinary(sorted, 4));

    System.out.println("\nO(n) - Linear");
    System.out.println("Max Value: " + maxValue(arr));
    System.out.println("Total Sum: " + totalSum(arr));

    System.out.println("\nO(n log n) - Linearithmic");
    int[] arr3 = {9, 5, 7, 1, 2};
    mergeSort(arr3, 0, arr3.length - 1);
    System.out.print("Merge Sorted: ");
    printArray(arr3);

    System.out.println("\nO(n^2) - Quadratic");
    int[] arr2 = {5, 3, 2, 4, 1};
    bubble(arr2);
    printArray(arr2);
    showDuplicates(arr);

    System.out.println("\nO(n^3) - Cubic");
    triplets(new int[]{1, 2, 3});

    System.out.println("\nO(2^n) - Exponential");
    System.out.println("Fibonacci(5): " + fibonacci(5));
    System.out.println("Subsets of {1,2,3}:");
    generateSubsets(new int[]{1, 2, 3}, 0, "");

    System.out.println("\nO(n!) - Factorial");
    System.out.println("Permutations of {1,2,3}:");
    permutations(new int[]{1, 2, 3}, 0);
    }
}
