package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int result = 0;

        for (int i = t; i  > 0 ; i = i / 10) {
            result += i % 10;
        }
        System.out.println(result);
        //893 -> 3 + 9 + 8 = 20

    }
}
