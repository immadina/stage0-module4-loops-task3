package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int minNum = first;
        if (minNum > second) {
            minNum = second;
        }

        int result = 1;
        for (int gcd = 1; gcd <= minNum; gcd++) {
            if (first % gcd == 0 && second % gcd == 0) {
                result = gcd;
            }
        }
        System.out.println(result);
    }
}
