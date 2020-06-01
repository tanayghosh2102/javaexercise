public class ActivityOne_29_May {
    static int sumOfSubArr = 0;
    static int itrSum = 0;

    public static int getMaxSum(int[] a) {
        int sum = 0;
        sumOfSubArr = 0;
        itrSum = 0;
        for(int i = 0; i < a.length; i++) {
            itrSum = itrSum + a[i];
            if(sumOfSubArr < itrSum) {
                sumOfSubArr = itrSum;
            }
            if(itrSum < 0) {
                itrSum = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int numberOfTC = Integer.parseInt(args[0]);

        for(int i = 1; i < numberOfTC+1; i++) {
            int arraySize = Integer.parseInt(args[i]);
            String[] array = args[i + 1].split(" ");
            int[] a = new int[array.length];
            for(int j = 0; j < a.length; j++) {
                a[i] = Integer.parseInt(array[i]);
            }
            getMaxSum(a);
        }
    }
}
