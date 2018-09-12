/*
 *  问题：输入一个有符号整数，输出该整数的反转值。
 *  输入描述:一个整数
 *  输出描述:一个整数
 *  输入例子1:123
 *  输出例子1:321
 *  输入例子2:-123
 *  输出例子2:-321
 *  输入例子3:200
 *  输出例子3:2
 */
package Thunder1;


import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("Please enter a number:");
                Scanner in = new Scanner(System.in);
                String strNum = in.next();
                int num = Integer.parseInt(strNum);
                if (num == 0) {
                    System.out.println(0);
                } else {
                    strNum = Math.abs(num) + "";
                    String strNumRev = "";
                    for (int i = strNum.length() - 1; i >= 0; i--) {
                        strNumRev = strNumRev + strNum.charAt(i);
                    }
                    if (num < 0) {
                        strNumRev = "-" + strNumRev;
                    }
                    System.out.println(Integer.parseInt(strNumRev));
                }
            }catch (Exception e){
                System.out.println("Not a number!!");

            }
        }
    }

}
