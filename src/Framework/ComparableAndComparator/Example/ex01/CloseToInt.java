package Framework.ComparableAndComparator.Example.ex01;

import java.util.Comparator;

// 특정숫자에 가까운순서대로 정렬
public class CloseToInt implements Comparator<Integer> {
    int closeTo;
    public CloseToInt(int closeTo) {
        this.closeTo = closeTo;
    }

    @Override
    public int compare(Integer int1, Integer int2) {
        return (Math.abs(int1 - closeTo) - Math.abs(int2 - closeTo));
    }
}
