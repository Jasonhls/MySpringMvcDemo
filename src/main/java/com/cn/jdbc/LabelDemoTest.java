package com.cn.jdbc;

/**
 * @description: Java中标签的用法
 * 循环某一个字符串中是否包含另一个字符串
 * @author: helisen
 * @create: 2020-08-31 15:13
 **/
public class LabelDemoTest {
    public static void main(String[] args) {
        String strSearch = "This is the string in which you have to search for a substring.";
        String subString = "substring";
        boolean found = false;
        int max = strSearch.length() - subString.length();
        testlb1:
        for (int i = 0; i <= max; i++) {
            int length = subString.length();
            int j = i;
            int k = 0;
            while(length-- != 0) {
                System.out.print("strSearch==" + strSearch.charAt(j) + "    ");
                System.out.println("subString==" + subString.charAt(k));
                if(strSearch.charAt(j++) != subString.charAt(k++)) {
                    //下面相当于for循环中的continue，如果if中的条件满足，直接下一轮循环，直到循环次数用完，就会执行for后面的代码
                    continue testlb1;
                }
                System.out.print("j==" + j + "  ");
                System.out.println("k==" + k);
            }
            found = true;
            //相当于for循环中的break，直接跳出循环
            break testlb1;
        }
        if(found) {
            System.out.println("发现子字符串。");
        }
        else {
            System.out.println("字符串中没有发现子字符串。");
        }
    }
}
