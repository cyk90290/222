package com.example.lib;
import java.util.Scanner;
public class w2 {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入英文字串:");
        String string = scanner.next();
        for(int i=string.length();i>0;i--){
            System.out.print(string.charAt(i-1));
        }
    }
}
