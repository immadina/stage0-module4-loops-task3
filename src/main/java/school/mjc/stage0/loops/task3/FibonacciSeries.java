package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        // 0 1 1 2 3 5 8 13 ...
        int prev = 0;
        int next = 1;
        //int toPrint = 0;
        System.out.println(0);
        for (int i = 1; i < lastFibonacci; i++) {

            System.out.println(next);
            next = next + prev;

            prev = next;


        }
    }
}
