import java.util.Scanner;
class objectsusingsemmarks{
  int sem1;
  int sem2;
  int sem3;
  int sem4;
  int sem5;
  int sem6;
  int sem7;
static void  marks(){
System.out.println("the marks are very high");
}
objectsusingsemmarks(int sem1,int sem2,int sem3,int sem4,int sem5,int sem6,int sem7){
this.sem1=sem1;
this.sem2=sem2;
this.sem3=sem3;
this.sem4=sem4;
this.sem5=sem5;
this.sem6=sem6;
this.sem7=sem7;

}

public static void main(String[]args){
objectsusingsemmarks s1=new objectsusingsemmarks(29,90,89,89,76,75,89);
Scanner s2=new Scanner(System.in);
s1.marks();
//s1.sem1=80;
//s1.sem2=89;
//s1.sem3=40;
//s1.sem4=89;
//s1.sem5=89;
//s1.sem6=60;
//s1.sem7=68;
int avg=s1.sem1+s1.sem2+s1.sem3+s1.sem4+s1.sem5+s1.sem6+s1.sem7/7;
System.out.println(avg);
//System.out.println("the sem1="+s1.sem1+"the sem2="+s1.sem2+"the sem3="+s1.sem3+"the sem4="+s1.sem4+"the sem5="+s1.sem5+"the sem6="+s1.sem6+"the sem="+s1.sem7);
}
}
