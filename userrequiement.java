import java.util.Scanner;
class userrequirement {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner scan=new Scanner(System.in);
         String s=scan.nextLine();
        String name=scan.nextLine();
        System.out.println("the string is name ="+name);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=a+b;
        System.out.println("the value of sum="+sum);
        byte c=scan.nextByte();
        System.out.println("the user of input byte="+c);
      System.out.println(a-b);
    }
}