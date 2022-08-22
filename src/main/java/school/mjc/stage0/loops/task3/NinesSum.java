package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
// [ 9 + 99 + 999 + 9999 ... n].
        int result = 0;
        //char s = '9';
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            //int toAdd = (int) s;
            result += (Math.pow(10, i) - 1);
        }

        System.out.println(result);
    }
}
