package com.keli;
public class Main {
    public static void main(String[] args) {
        int a=0;//定义计数变量，当计数每行有8个数时换行
        for (int i=1;i<=10000;i++){
            for (int j=1;j<=i;){
                //外层循环创建两个数i，j
                //判断i如果是1或者2，直接跳出循环并输出
                if (i==1||i==2){
                    break;
                }
                //判断如果i是合数就i+1,j=1,换下一个数重新循环
                else if (i%j==0&&j!=1&&j!=i){
                    i++;
                    j=1;
                }
                //如果目前不是合数，还没有判断是否为素数，就继续j+1判断
                else {
                    j++;
                }
                //直到内层for循环结束，都没有确定是合数的话就自动跳出循环，输出当前i
            }
            a++;//记输出数字的个数
            System.out.print(i+" ");
            //当一行有8个数字时换行指令
            if (a%8==0){
                System.out.print("当前已经输出"+a+"个素数");
                System.out.print('\n');
            }
        }
        System.out.print("当前已经输出"+a+"个素数");
    }
}