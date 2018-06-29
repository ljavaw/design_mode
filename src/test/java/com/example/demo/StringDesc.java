package com.example.demo;

/**
 * @Author ljw
 * @Description :
 * @Date Created in 8:59 2018/6/20.
 * @Modified By :
 */
public class StringDesc {

    public static String reorder(String str){
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(reorder(str));
    }
}
