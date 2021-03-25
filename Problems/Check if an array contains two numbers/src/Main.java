import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println(arrayContainsTwoNumbers(arr, n, m));
    }

    public static boolean arrayContainsTwoNumbers(int[] arr, int n, int m) {
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == n && arr[i + 1] == m)
                    || (arr[i] == m && arr[i + 1] == n)) {
                result = true;
                break;
            }
        }
        return result;
    }

}
