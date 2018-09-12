/*
给定整数n，取若干个1到n的整数可求和等于整数m，编程求出所有组合的个数。比如当n=6，m=8时，有四种组合：[2,6], [3,5], [1,2,5], [1,3,4]。限定n和m小于120
输入描述:整数n和m
输出描述:求和等于m的所有组合的个数。
输入例子1:6 8
输出例子1:4

分析：
 */

package Thunder1;

import java.util.Scanner;

//public class T2 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter n:");
//        int n = in.nextInt();
//        System.out.println("Please enter m:");
//        int m = in.nextInt();
//        int count = 0;
//        int m1 = m;
//        for (int n1 = 1; n1 <= n; n1++) {
//            while (m1<0){
//                m1 -= n1;
//                n1 ++;
//            }
//        }
//        System.out.println(count);
//
//    }
//}
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] strings = inputString.split(" ");
        int n = Integer.valueOf(strings[0]);
        int m = Integer.valueOf(strings[1]);
        int result = getCount(n, m);//1
        System.out.println(result);
    }
    private static int getCount(int n, int m) {
        System.out.println(n+","+m);
        if (n <= 0 || m <= 0 )
            return 0;
        if (n > m )
            n = m;

        int sum = 0;
        if (n == m)
            sum++;
        sum += getCount(n - 1, m);//2
        System.out.println("sum:"+sum);
        sum += getCount(n - 1, m - n);//3

        return sum;
    }
}
