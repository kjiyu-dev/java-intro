package Class.Example;

public class intArrInfoInstance {
    public static void main(String[] args) {
        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {382, 194, 27, 915, 138};

        IntArrInfo aryInf1 = new IntArrInfo(ary1);
        IntArrInfo aryInf2 = new IntArrInfo(ary2);

        int ary1Max = aryInf1.max;
        double ary2Avg = aryInf2.average;
        int ary1n2Sum = aryInf1.sum + aryInf2.sum;
    }
}
