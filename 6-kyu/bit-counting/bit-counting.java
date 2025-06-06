public class BitCounting {
    public static int countBits(int n){
        // Show me the code!
        String s = Integer.toBinaryString(n);
        String[] arr = s.split("");
        int count = 0;
​
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("1"))
                count++;
        }
        
        return count;
    }
}