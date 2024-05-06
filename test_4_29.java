import java.util.Scanner;

public class test_4_29 {
    public static void main6(String[] args) {
        //统计二进制数字中1的个数
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int count=0;
        while(a>0){
            if((a&1)==1){
                count++;
            }
            a=a>>1;
        }
        System.out.println(count);
    }
    public static void main5(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int number=a>=b?b:a;//找谁小;
        for(int i=number;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.printf("最大公约数是%d",i);
                break;
            }

        }

    }
    public static void main4(String[] args) {
//        求分数的和
        double sum=0;
        for(double i=1;i<=100;i++){
            if(i%2==1){
                sum+=1/i;
            }else {
                sum-=1/i;
            }
        }
        System.out.println(sum);

    }
    public static void main3(String[] args) {
//        判断是否为水仙花数
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int hundred=number/100;
        int ten=number/10%10;
        int one=number%10;
        if(hundred*hundred*hundred+ten*ten*ten+one*one*one==number){
            System.out.println("是水仙花数");
        }else{
            System.out.println("不是水仙花数");
        }
    }
public static void main2(String[] args) {
//    给定一个数，判断是否为素数
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入一个整数");
    int number= scanner.nextInt();
    for (int i = 2; i < number; i++) {
        if(number%i==0){
            System.out.println(number+"不是素数");
            break;
        }
    }
}
    public static void main1(String[] args) {
        //    统计1-100中数字9出现的个数
        int count=0;
        for (int i = 0; i < 100; i++) {
            if(i==9) count++;
            if(i>=10){
                count+=i%10==9?1:0;
                count+=i/10==9?1:0;
            }
        }
        System.out.println(count);
    }




}
