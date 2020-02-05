package com.company;

public class Main {

    public static boolean isPalindrome(int num){
        if (num < 0) {
            //-101 would be 101- backwards, and as such, is not a palindrome
            return false;

        }
        String numStr = String.valueOf(num);
        int numLength = numStr.length();
        boolean isOdd;
        if (numLength == 1) {
            //1 backwards is 1, 2 backwards is 2
            return true;
        }
        //at this point, num is positive and numLength is 2 or more

        //check if even or odd number of digits
        if (numLength % 2 == 0) {
            isOdd = false;
        } else {
            isOdd = true;
        }
        boolean isPalindrome = true;
        //solving odd
        if (isOdd) {
            //lengh is at least 3
            //example: numLength is 9
            //elements are 0-8
            //0, 1, 2, 3
            //4 (midpoint)
            //5, 6, 7, 8
            //(9-1)/2 = 4
            //midpoint = (numLength - 1) / 2
            //another example: numLength is 21
            //range is 0-20, not 1-21
            //(21-1)/2 = (20)/2 = 10
            // 0,  1,  2,  3,  4,  5,  6,  7,  8,  9,
            //10 midpoint
            //11, 12, 13, 14, 15, 16, 17, 18, 19, 20
            int lastIndex = numLength - 1;
            int midPoint = lastIndex / 2;
            //lastIndex is always even, and so is midPoint
            for (int i = 0; i < midPoint; i++) {
                if (numStr.charAt(i) != numStr.charAt(lastIndex - i)){
                    isPalindrome = false;
                }
            }
        } else { //is even
            //even number
            //meaning the two middle digits are the "midpoint"
            //example:
            //0, 1, 2,  3,  4,
            //5, 6,
            //7, 8, 9, 10, 11
            int lastIndex = numLength - 1;
            //let's say the length is 10
            //then the indices are 0-9
            //0, 1, 2, 3,
            //4, 5,
            //6, 7, 8, 9
            //midpoint1 = 4
            //midpoint2 = 5
            //midpoint1 = (numLength/2)-1
            //midpoint2 = midpoint1 +1
            //example:
            //length = 16
            // 0,  1,  2,  3,  4,  5,  6,
            // 7,  8,
            // 9, 10, 11, 12, 13, 14, 15
            //midpoint1 = 7
            //midpoint1 = (16/2)-1 = (8)-1 = 7
            //works
            int midPoint1 = (numLength / 2) -1;
            int midPoint2 = midPoint1 + 1;
            System.out.println("midPoint1 value is: " + numStr.charAt(midPoint1));
            System.out.println("midPoint2 value is : " + numStr.charAt(midPoint2));
            if (numStr.charAt(midPoint1) != numStr.charAt(midPoint2)) {
                return false;
            } else {
                //the midpoints are the same
                for (int i = 0; i < midPoint1; i++) {
                    //System.out.println("i is: " + i);
                    //System.out.println("lastIndex - i is: " + (lastIndex - i));
                    //System.out.println("isPalindrome: " + isPalindrome);
                    //System.out.println("i: " + i);

                    if (numStr.charAt(i) != numStr.charAt(lastIndex - i)) {

                        isPalindrome = false;
                    }

                }
            }
            return isPalindrome;
        }

        return isPalindrome;
    }


    public static void main(String[] args) {
	    System.out.println("Hello");
	    //testing numbers with an odd number of digits, as well as any negative numbers
	    System.out.println("Is 101 a palindrome? " + isPalindrome(101));
        System.out.println("Is 10122 a palindrome? " + isPalindrome(10122));
        System.out.println("Is 1 a palindrome? " + isPalindrome(1));
        System.out.println("Is -2 a palindrome? " + isPalindrome(-2));
        System.out.println("Is -22 a palindrome? " + isPalindrome(-22));
        System.out.println("Is -222 a palindrome? " + isPalindrome(-222));
        System.out.println("Is 12321 a palindrome? " + isPalindrome(12321));
        System.out.println("Is 1234321 a palindrome? " + isPalindrome(1234321));
        System.out.println("Is 1234421 a palindrome? " + isPalindrome(1234421));
        System.out.println("===========================================");
        //testing numbers with an even number of digits, and all are positive
        int [] evenTestArray = {1221, 123321, 11, 12344321, 1115665111, 345121, 123421, 1251, 15366843, 45678654};
        for (int i = 0; i < evenTestArray.length; i++) {
            System.out.println("Is " + evenTestArray[i] + " a palindrome? " + isPalindrome(evenTestArray[i]));
        }


    }
}
