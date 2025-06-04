public class Solution {
    public static boolean validatePin(String pin) {
        if (pin.length() == 4 || pin.length() == 6) {
            for (int i = 0; i < pin.length(); i++) {
                char ch = pin.charAt(i);
                if (ch < '0' || ch > '9')
                    return false;
            }
            return true;
        }
        return false;
    }
}