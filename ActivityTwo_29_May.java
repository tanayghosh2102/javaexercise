public class ActivityTwo_29_May {
    public static int getMisisngNum(int[] a) {
        int total = 0;
        int n = a.length;
        total = (n + 1) * (n + 2)/2;
        for(int i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;
    }

    public static void main (String[] args) {
        int a[] = {3,2,4,1,6,7};
        int missingNum = getMisisngNum(a);
        System.out.println("Missing number in the array is: " + missingNum);
    }
}
