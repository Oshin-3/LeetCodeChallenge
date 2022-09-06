public class RomanToNumber {

    public static  int romanValue(char c)
    {
        int value = 0;
        switch (c)
        {
            case 'I': value = 1; break;
            case 'V': value = 5; break;
            case 'X': value = 10; break;
            case 'L': value = 50; break;
            case 'C': value = 100; break;
            case 'D': value = 500; break;
            case 'M': value = 1000; break;
            default:
                System.out.println("Input invalid!");
        }

        return value;
    }

    public static int romanToInt(String s) {

        int num = 0;
        int value1 = 0;
        int value2 = 0;
        char c1;
        char c2;
        int len = s.length();

        //loop through each char
        for (int i = 0; i < len ; i++)
        {
            c1 = s.charAt(i);
            value1 = romanValue(c1);
            if( i != len - 1)
            {
                c2 = s.charAt(i + 1);
                value2 = romanValue(c2);
                if (value1 < value2)
                {
                    num -= value1;
                }
                else
                {
                    num += value1;
                }
            }
            else
            {
                num += value1;
            }

        }
        return num;
    }

    public static void main(String[] args)
    {
        int num = romanToInt("XLIX");
        System.out.println("Output: " + num);
    }
}
