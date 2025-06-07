class Kata {
    public static String getMiddle(String word) {
        //Code goes here!
        String middle = "";
        char[] middleArray = word.toCharArray();
​
        if (middleArray.length % 2 == 0) {
            middle += middleArray[middleArray.length / 2 - 1];
            middle += middleArray[middleArray.length / 2];
        }
        else if (middleArray.length % 2 == 1) {
            middle += middleArray[middleArray.length / 2];
        }
​
        return middle;
    }
}