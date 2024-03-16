public class RecursionBasics {

    public static void PrintDecnum(int n) {
        if (n == 1) {
            System.out.print(n);
            return;
        }
        ;
        System.out.print(n + " ");
        PrintDecnum(n - 1);
    }

    public static void PrintIncnum(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintIncnum(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) { // Handling minus case
            return -1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int CalcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Snm1 = CalcSum(n - 1);
        int sn = n + Snm1;
        return sn;
    }

    // calculate nth terms of fibonacci number
    public static int fib(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOcc(arr, key, i + 1);
    }

    public static int lastOcc(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int optimizedPow(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow = optimizedPow(a, n / 2);
        int halfPowSqr = halfPow * halfPow;

        // N is odd
        if (n % 2 != 0) {
            halfPowSqr = a * halfPowSqr;
        }
        return halfPowSqr;
    }

    // Assignments Questions

    public static void allOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurance(arr, key, i + 1);
    }

    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.println(digit[lastDigit] + "");
    }

    public static int length(String str) {
        if (str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) + 1;
    }

    public static int countSubstring(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        int res = countSubstring(str, i + 1, j, n - 1) +
                countSubstring(str, i, j - 1, n - 1) -
                countSubstring(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static double myPow(double x, long n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / myPow(x, -1 * n);
        if ((n & 1) == 0)
            return myPow(x * x, n / 2);
        else
            return x * myPow(x, n - 1);
    }

    public static void towerOfHnoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfered Disk" + n + "from" + src + "to" + dest);
            return;
        }
        towerOfHnoi(n - 1, src, dest, helper);
        System.out.println("transfered Disk" + n + "from" + src + "to" + dest);
        towerOfHnoi(n - 1, helper, src, dest);
    }

    public static int pow2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pow2(x, n - 1);
    }

    // public static pow3(int x, int n) {
    // if(n==0){
    // return 1;
    // }
    // return
    // }

    public static void main(String[] args) {
        System.out.println(pow2(0, 0));
    }
}
