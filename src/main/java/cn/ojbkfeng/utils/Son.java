package cn.ojbkfeng.utils;

public class Son extends CountClassInclude {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.bian);
        System.out.println(son.finalInt);
        son.method();
        son.method3();
        son.new Inner();
//        String
//        ++j + j++ + j++ + j++;
//         1    1      2    3
    }
}
