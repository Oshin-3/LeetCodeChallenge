import java.util.ArrayList;

public class HappyNumber {

    public static boolean checkRepeatSum(ArrayList arr, int sum)
    {
        boolean flg = false;
        int count = 0;
        for (int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i).equals(sum))
            {
                count += 1;
            }
        }

        if(count > 1)
        {
            flg = true;
        }
        return flg;
    }


    public static boolean isHappy(int n) {
        ArrayList arr = new ArrayList();
        boolean flg = false;
        int temp = 0;
        int sum = 0;
        if(n == 1)
        {
            flg = true;
        }
        else
        {
            while (n != 0)
            {
                temp = n % 10;
                n = n / 10;
                sum += (temp * temp);
                if( n == 0)
                {
                    arr.add(sum);
                    boolean tempFlg = checkRepeatSum(arr, sum);
                    if(sum == 1)
                    {
                        flg = true;
                        break;
                    }
                    else
                    {
                        if(tempFlg)
                        {
                            flg = false;
                            break;
                        }
                        else
                        {
                            n = sum;
                            sum = 0;
                        }

                    }
                }
            }
        }

        return flg;
    }
    public static void main(String[] args) {
        boolean output = isHappy(35);
        if(output)
        {
            System.out.println("Is Happy Number");
        }
        else
        {
            System.out.println("Not Happy Number");
        }
    }
}
