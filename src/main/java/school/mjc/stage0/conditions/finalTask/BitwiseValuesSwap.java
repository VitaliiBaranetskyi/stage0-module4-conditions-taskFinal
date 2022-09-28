package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        int temp = first ^ second;
        first = temp ^ first;
        second = temp ^ second;
        System.out.println(first);
        System.out.println(second);
    }
}
