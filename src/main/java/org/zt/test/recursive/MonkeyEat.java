
package org.zt.test.recursive;

/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个   
 * 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
 * 以后每天早上都吃了前一天剩下的一半零一个。
 * 到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 
 * @author zhoutao
 *
 */
public class MonkeyEat
{
    public static void main(String[] args)
    {
        System.out.println(method(1));
    }

    //1  4  10  22   
    private static int method(int day)
    {
        if (day == 10)
        {
            return 1;
        }
        else
        {
            //第day天=第(day+1)天加上一个的两倍
            return (method(day + 1) + 1) * 2;
        }

    }
}