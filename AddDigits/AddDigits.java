package com.oshin;

public class AddDigits {
    public static int addDigits(int num) {
        int sum = 0;
        int num1 = 0;

        while(num != 0)
        {
            num1 = num % 10;
            sum += num1;
            num = num / 10;
            if(num == 0 && sum > 9)
            {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int output = addDigits(241);
        System.out.println("Output: " + output);

    }
}
