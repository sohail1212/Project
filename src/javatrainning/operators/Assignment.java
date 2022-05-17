package javatrainning.operators;

public class Assignment {
    public static void main (String[] args) {
        int num1=20;
        int num2=40;
        int num;
        num=num1=num2;
        System.out.println(num1  + "  "+ num2);
        System.out.println(num);

        num=num1+=num2;
        System.out.println(num);
        num=num1-=num2;
        System.out.println(num);
        num=num1*=num2;
        System.out.println(num);
        num=num2/=num1;
        System.out.println(num);
        num=num2%=num1;
        System.out.println(num);
    }
}

