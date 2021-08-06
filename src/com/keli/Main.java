package com.keli;
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] arg){
        Random randomOne=new Random();
        int randNum=randomOne.nextInt(100)+1;
        Scanner scannerOne=new Scanner(System.in);

        while (true){
            System.out.print("请输入你要猜的数字：");
            int scanNum = scannerOne.nextInt();
            if (scanNum > randNum) {
                System.out.print("您输入的数字有点大");
            } else if (scanNum<randNum){
                System.out.print("您输入的数字有点小");
            }else {
                System.out.print("恭喜你猜对了");
                break;
            }
        }
    }
}
