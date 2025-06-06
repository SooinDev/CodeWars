public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String phoneNumber = "";
        String tmp = "";
​
        for (int i = 0; i < numbers.length; i++) {
            tmp += numbers[i];
        }
        phoneNumber = "(" + tmp.substring(0, 3) + ") " + tmp.substring(3, 6) + "-" + tmp.substring(6, 10);
​
        return phoneNumber;
    }
}