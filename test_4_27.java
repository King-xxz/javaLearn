public class test_4_27 {
    public static void main(String[] args) {
        //字符串转换成整形
        String str1="123";
        int a1=Integer.valueOf(str1);
        int a2=10;
        System.out.println(str1+a2);//12310
        System.out.println(a1+a2);//133


        //整形转换成字符串
       int b1=110;
       int b2=10;
       String str2=String.valueOf(b1);

        System.out.println(str2+b2);//11010
        System.out.println(b1+b2);//120
    }

    public static void main3(String[] args) {
        //java中的打印
        //规律总结：有字符串后面就直接变成拼接；没有字符串按正常运算
        int a=10;
        int b=20;
        String str1="hello";
        String str2="bite";
        System.out.println(a+b);//30
        System.out.println(str1+str2);//hellobite
        System.out.println(str1+a);//hello10
        System.out.println(str1+a+b);//hello1020

        System.out.println(a+b+str1);//30hello
    }
    public static void main2(String[] args) {

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

    public static void main1(String[] args) {
    //类型转换

        //小字节变大字节要强制转换（不推荐）
            int a=128;
            byte b=(byte)a;//-127

        //大字节变小字节没问题
            byte a2=121;
            int  b2=a2;

        //整形提升：计算机进行运算一般都是按4给字节来进行，所以低于4给字节的类型在运算时会转换乘4个字节
            byte a3=10;
            byte b3=20;
//            byte c3=a3+b3;//报错的原因时byte运算进行了整形提升
            byte d3=(byte)(a3+b3);//解决方法1：强制转换
            int e3=a3+b3;//解决方法2：整形提升后成4个字节，直接用int接收
    }
}
