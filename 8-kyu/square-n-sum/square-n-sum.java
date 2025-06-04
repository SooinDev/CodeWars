public class Kata {
    public static int squareSum(int[] n) {
        //Your Code
        int sum = 0;
        for (int i = 0; i < n.length; i++)
            sum += Math.pow(n[i], 2);
​
        return sum;
    }
}