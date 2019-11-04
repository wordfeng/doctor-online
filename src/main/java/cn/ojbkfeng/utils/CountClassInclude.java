package cn.ojbkfeng.utils;

public class CountClassInclude {
    //成员变量
    int bian;
    //成员常量
    final int finalInt=1;
    //静态变量
    static int staticInf;
    //静态常量
    static final int staitcFinalInt=1;
    final static int c2=2;

    {
        //成员代码块
        System.out.println('d');
    }
    static{
        //静态代码块
        System.out.println('2');
    }
    //构造函数
    public CountClassInclude(){
        System.out.println("我是你爸爸");
    }

    //成员方法
    public void method(){
        int x;
        final int xxxx;
        {
            int a;
        }

        {
            int a;
            //局部代码块
        }
        class InnerMehod{
            //方法内部类
        }
    }
    //静态方法
    public static void method2(){

    }
    //不可被重写方法
    public final void method3(){

    }

    class Inner{

    }
    static class StaticInner{

    }
}