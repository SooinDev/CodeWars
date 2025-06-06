public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
​
        for (int i = 0; i < args.length; i++)
            min = Math.min(min, args[i]);
​
        return min;
    }
}