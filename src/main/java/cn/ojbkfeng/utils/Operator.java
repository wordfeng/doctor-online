package cn.ojbkfeng.utils;

public class Operator {
    public static void main(String[] args) {
//        for (int i = 0; i < 15; i++) {
//            System.out.println("7 & "+i+"= "+(7 & i));
//            System.out.println(i+" % 7 = "+(i%7));
//            System.out.println();
//        }
//        System.out.println(0%7);
        test(16);
    }

    public static void test(int mod){
        int j = 0;
        for (int i = 0; i < 10000000; i++) {
            if (useAnd(mod,i) != useMod(mod,i)){
                if(j==0){
                    System.out.println("结论错误点"+i);
                }
                j++;
            }
            System.out.println(useAnd(mod,i));
        }
        System.out.println("结论错误"+j);
    }

    public static int useMod(int mod, int num) {
        return num % mod;
    }

    public static int useAnd(int mod, int num) {
//        if (mod > num) {
//            return mod & num;
//        }
        mod--;
        return  /*num &*/ mod & num;
    }
}
