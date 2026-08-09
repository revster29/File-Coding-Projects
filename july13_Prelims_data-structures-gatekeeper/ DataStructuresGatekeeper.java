public class DataStructureGatekeeper {
    
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {

        int[] data = {14, 21, 18, 9, 30, 18, 25};

        printHeader();

        System.out.print(WHITE + "Input Data      : " + RESET);
        printArray(data);

        int[] qualified = filterQualified(data);

        System.out.print(BLUE + "Qualified Data  : " + RESET);
        printArray(qualified);

        int target = 18;
        int occurrences = countValue(data, target);

        printFooter(target, occurrences);
    }

    public static void printHeader() {
        System.out.println(BLUE + "========================================" + RESET);
        System.out.println(BOLD + WHITE + "     DATA STRUCTURE GATEKEEPER SYSTEM   " + RESET);
        System.out.println(BLUE + "========================================" + RESET);
    }

    public static void printFooter(int value, int count) {
        System.out.println(BLUE + "----------------------------------------" + RESET);
        System.out.println("Value Checked   : " + WHITE + value + RESET);
        System.out.println("Occurrences     : " + RED + count + RESET);
        System.out.println(BLUE + "----------------------------------------" + RESET);
        System.out.println(BOLD + "Process Complete." + RESET);
    }

    public static int[] filterQualified(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 18) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 18) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static int countValue(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void printArray(int[] arr) {
        System.out.print(BLUE + "[ " + RESET);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(BLUE + " | " + RESET);
            }
        }

        System.out.println(BLUE + " ]" + RESET);
    }
}
