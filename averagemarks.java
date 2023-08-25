import java.util.Scanner;
class averagemarks{
public static void main(String[]args){
Scanner s1=new Scanner(System.in);
double sem1=s1.nextDouble();
double sem2=s1.nextDouble();
double sem3=s1.nextDouble();
double sem4=s1.nextDouble();
double sem5=s1.nextDouble();
double sem6=s1.nextDouble();
double sem7=s1.nextDouble();
double sem8=s1.nextDouble();
double a1=avg(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
System.out.println(a1);
}
static double avg(double sem1,double sem2,double sem3,double sem4,double sem5,double sem6,double sem7,double sem8){
double average=sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8/8;
return average;
}
}